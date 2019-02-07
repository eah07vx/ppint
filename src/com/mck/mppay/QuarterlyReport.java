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
public class QuarterlyReport extends _API {

	/**
	 * 
	 */
	public QuarterlyReport() {
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
		TWObject quarterlyReport = null;
		int respCode = httpResp.getResponseCode();
		if (respCode == HttpsURLConnection.HTTP_OK) {
			quarterlyReport = parseSyncResponse(rawResp, httpResp, sopDebug);
		}
		else if (respCode == HttpsURLConnection.HTTP_ACCEPTED) {
			quarterlyReport = parseAsyncResponse(rawResp, httpResp, sopDebug);
		}
		return quarterlyReport;
	}
		
	TWObject parseSyncResponse(String rawResp, _HttpResponse httpResp, boolean sopDebug) throws Exception {
		
		_QuarterlyReportResp quarterlyReviewServiceResp = parseQuarterlyReportResp(rawResp);
		if (sopDebug) {
			System.out.println(this.getClass().getName() + ".parseSyncResponse() _QuarterlyReportResp: " + quarterlyReviewServiceResp);
		}
		// Prepare TWObject response
		try {
			TWObject twQuarterlyReportResp = TWObjectFactory.createObject();
			TWList qrRows = null;
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
			twQuarterlyReportResp.setPropertyValue("httpResponse", httpResponse);

			if ((quarterlyReviewServiceResp != null) && ((qrRows = quarterlyReviewServiceResp.getTwQuarterlyReportRows()) != null)) { // && ((results = quarterlyReviewServiceResp.getTwResults()) != null)) {
				if(sopDebug) System.out.println(this.getClass().getName() + ".parseSyncResponse() Returning with [" + qrRows.getArraySize() + "] number of rows.");				
				twQuarterlyReportResp.setPropertyValue("quarterlyReviewServiceResp", qrRows);
			}
			else {
				// Return empty object but not a null object 
				if(sopDebug) System.out.println(this.getClass() + ".parseSyncResponse() Returning empty response!");
				twQuarterlyReportResp.setPropertyValue("quarterlyReviewServiceResp", TWObjectFactory.createList());
			}
			return twQuarterlyReportResp;
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			throw e;
		}
	}

	private _QuarterlyReportResp parseQuarterlyReportResp(String rawResp) {
		_QuarterlyReportResp quarterlyReviewServiceResp = null;
		try {
			ObjectMapper jacksonMapper = new ObjectMapper();

			SimpleDateFormat sdf = new SimpleDateFormat(_API.API_DATE_FORMAT);
			jacksonMapper.setDateFormat(sdf);
			jacksonMapper.configure(
				    DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			
			quarterlyReviewServiceResp = jacksonMapper.readValue(rawResp, _QuarterlyReportResp.class);
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
		return quarterlyReviewServiceResp;
	}

	TWObject parseAsyncResponse(String rawResp, _HttpResponse httpResp, boolean sopDebug) throws Exception {
		int respCode = httpResp.getResponseCode();
		// Prepare TWObject for return
		try {
			TWObject twQuarterlyReportResp = TWObjectFactory.createObject();
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
			twQuarterlyReportResp.setPropertyValue("httpResponse", httpResponse);

			return twQuarterlyReportResp;
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			throw e;
		}
	}
}
