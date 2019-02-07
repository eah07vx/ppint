package com.mck.mppay;


//import teamworks.TWList;
import teamworks.TWObject;

/**
 * @author akatre
 *
 */
public class AggregateAPI {
	
	/**
	 * Convenience method that does the same job as process method inherited from API. 
	 * 
	 * @param url
	 * @param httpMethod
	 * @param sslAlias
	 * @param requestJSON
	 * @param sopDebug
	 * @return teamworks.TWObject to be mapped to BPM BO with same properties/parameters 
	 *  
	 */
	public TWObject invokeAsync(String url, String httpMethod, String sslAlias, String requestJSON, boolean sopDebug) throws Exception  {
		return new AsyncAPI().process(url, httpMethod, sslAlias, requestJSON, null, sopDebug);
	}
	
	/**
	 * Convenience method that does the same job as process method of CreditAccount inherited from API. 
	 * 
	 * @param url
	 * @param httpMethod
	 * @param sslAlias
	 * @param requestJSON
	 * @param sopDebug
	 * @return teamworks.TWObject to be mapped to BPM BO with same properties/parameters 
	 *  
	 */
	public TWObject getCreditAccountInfo(String url, String httpMethod, String sslAlias, String requestJSON, boolean sopDebug) throws Exception  {
		return new CreditAccount().process(url, httpMethod, sslAlias, requestJSON, null, sopDebug);
	}

	/**
	 * Convenience method that does the same job as process method of CreditAccount inherited from API. 
	 * 
	 * @param url
	 * @param httpMethod
	 * @param sslAlias
	 * @param requestJSON
	 * @param sopDebug
	 * @return teamworks.TWObject to be mapped to BPM BO with same properties/parameters 
	 *  
	 */
	public TWObject getQuarterlyReport(String url, String httpMethod, String sslAlias, String requestJSON, boolean sopDebug) throws Exception  {
		return new QuarterlyReport().process(url, httpMethod, sslAlias, requestJSON, null, sopDebug);
	}
}
