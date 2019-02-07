/**
 * 
 */
package com.mck.mppay;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.net.ssl.HttpsURLConnection;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import teamworks.TWList;
import teamworks.TWObject;
import teamworks.TWObjectFactory;

/**
 * @author akatre
 *
 */
public class CreditAccount extends _API {

	/**
	 * 
	 */
	public CreditAccount() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.mck.mppay._API#prepRequest(java.lang.String, teamworks.TWObject, boolean)
	 */
	@Override
	String prepRequest(String requestJSON, TWObject reqHeader, boolean sopDebug) throws Exception {
		return requestJSON;	//Request is already formatted 
	}

	/* (non-Javadoc)
	 * @see com.mck.mppay._API#parseResponse(java.lang.String, com.mck.mppay._HttpResponse, boolean)
	 */
	@Override
	TWObject parseResponse(String rawResp, _HttpResponse httpResp, boolean sopDebug) throws Exception {
		TWObject creditAccount = null;
		int respCode = httpResp.getResponseCode();
		if (respCode == HttpsURLConnection.HTTP_OK) {
			creditAccount = parseSyncResponse(rawResp, httpResp, sopDebug);
		}
		else if (respCode == HttpsURLConnection.HTTP_ACCEPTED) {
			creditAccount = parseAsyncResponse(rawResp, httpResp, sopDebug);
		}
		return creditAccount;
	}
		
	TWObject parseSyncResponse(String rawResp, _HttpResponse httpResp, boolean sopDebug) throws Exception {
		
		_CreditAccountResp canLookUpResp = parseCreditAccountResp(rawResp);
		if (sopDebug) {
			System.out.println(this.getClass().getName() + ".parseSyncResponse() _CreditAccountResp: " + canLookUpResp);
		}
		// Prepare TWObject response
		try {
			TWObject twCreditAccountResp = TWObjectFactory.createObject();
			TWList caRows = null;
			TWObject httpResponse = TWObjectFactory.createObject();
			
			int respCode = httpResp.getResponseCode();
			String respMsg = httpResp.getResponseMessage();
			httpResponse.setPropertyValue("responseCode", respCode);
			if (respMsg == null || respMsg.equals("")) {
            	respMsg = rawResp;
            }
			if (respCode != HttpsURLConnection.HTTP_OK) {	                
				respMsg = _API.HTTP_NOT_OK + ": " + respMsg; // Not OK - abort mission
			}
			httpResponse.setPropertyValue("responseMessage", respMsg);
			twCreditAccountResp.setPropertyValue("httpResponse", httpResponse);

			if ((canLookUpResp != null) && ((caRows = canLookUpResp.getTwCreditAccountRows()) != null)) { // && ((results = canLookUpResp.getTwResults()) != null)) {
				if(sopDebug) System.out.println(this.getClass().getName() + ".parseSyncResponse() Returning with [" + caRows.getArraySize() + "] number of rows.");				
				twCreditAccountResp.setPropertyValue("canLookUpResp", caRows);
			}
			else {
				// Return empty object but not a null object 
				if(sopDebug) System.out.println(this.getClass() + ".parseSyncResponse() Returning empty response!");
				twCreditAccountResp.setPropertyValue("canLookUpResp", TWObjectFactory.createList());
			}
			return twCreditAccountResp;
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			throw e;
		}
	}

	private _CreditAccountResp parseCreditAccountResp(String rawResp) {
		_CreditAccountResp canLookUpResp = null;
		try {
			ObjectMapper jacksonMapper = new ObjectMapper();

			SimpleDateFormat sdf = new SimpleDateFormat(_API.API_DATE_FORMAT);
			jacksonMapper.setDateFormat(sdf);
			jacksonMapper.configure(
				    DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			
			canLookUpResp = jacksonMapper.readValue(rawResp, _CreditAccountResp.class);
		} catch (JsonParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return canLookUpResp;
	}

	TWObject parseAsyncResponse(String rawResp, _HttpResponse httpResp, boolean sopDebug) throws Exception {
		int respCode = httpResp.getResponseCode();
		// Prepare TWObject for return
		try {
			TWObject twCreditAccountResp = TWObjectFactory.createObject();
			TWObject httpResponse = TWObjectFactory.createObject();
			
			String respMsg = httpResp.getResponseMessage();
			httpResponse.setPropertyValue("responseCode", respCode);
			if (respMsg == null || respMsg.equals("")) {
            	respMsg = rawResp;
            }
			if (respCode != HttpsURLConnection.HTTP_ACCEPTED && respCode != HttpsURLConnection.HTTP_OK) {                
				respMsg = _API.HTTP_NOT_OK + ": " + respMsg; // Not OK - abort mission
			}
			httpResponse.setPropertyValue("responseMessage", respMsg);
			twCreditAccountResp.setPropertyValue("httpResponse", httpResponse);

			return twCreditAccountResp;
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			throw e;
		}
	}
}
