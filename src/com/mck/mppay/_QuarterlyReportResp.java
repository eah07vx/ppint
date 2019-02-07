/**
 * 
 */
package com.mck.mppay;

import teamworks.TWList;
import teamworks.TWObjectFactory;

/**
 * @author akatre
 *
 */

public class _QuarterlyReportResp extends _APIResp {

	private _QuarterlyReportRow[] quarterlyReviewServiceResp; // Named to match response from API call 
	private TWList twQuarterlyReportRows;

	/**
	 * 
	 */
	public _QuarterlyReportResp() {
		super();
		try {
			this.twQuarterlyReportRows = TWObjectFactory.createList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public _QuarterlyReportRow[] getQuarterlyReviewServiceResp() {
		return quarterlyReviewServiceResp;
	}

	public void setQuarterlyReviewServiceResp(_QuarterlyReportRow[] quarterlyReviewServiceResp) throws Exception {
		this.quarterlyReviewServiceResp = quarterlyReviewServiceResp;
		updateTwQuarterlyReportRows(quarterlyReviewServiceResp);
	}

	public int numberOfResponseLines() {
		return (getQuarterlyReviewServiceResp() != null) ? getQuarterlyReviewServiceResp().length : 0;
	}

	public TWList getTwQuarterlyReportRows() {
		return twQuarterlyReportRows;
	}

	public void setTwQuarterlyReportRows(TWList twQuarterlyReportRows) {
		this.twQuarterlyReportRows = twQuarterlyReportRows;
	}

	public void updateTwQuarterlyReportRows(_QuarterlyReportRow[] quarterlyReviewServiceResp) throws Exception {
		if (this.twQuarterlyReportRows == null) {
			this.twQuarterlyReportRows = TWObjectFactory.createList();
		}
		for (int i = 0; i < quarterlyReviewServiceResp.length; i++) {
			this.twQuarterlyReportRows.addArrayData(quarterlyReviewServiceResp[i].getTwQuarterlyReportRow());
		}
	}

	@Override
	public String toString() {
		String str = "";
		if (getQuarterlyReviewServiceResp() != null) {
			for (int i = 0; i < getQuarterlyReviewServiceResp().length; i++) {
				str += "\n" + getQuarterlyReviewServiceResp()[i].toString();
			}
		}
		str += "\n " +  super.toString();
		return str;
	}
}
