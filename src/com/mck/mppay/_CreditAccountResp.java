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
public class _CreditAccountResp extends _APIResp {
	
	private _CreditAccountRow[] canLookUpResp; // Named to match response from API call 
	private TWList twCreditAccountRows;

	public _CreditAccountResp() {
		super();
		try {
			this.twCreditAccountRows = TWObjectFactory.createList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public _CreditAccountRow[] getCanLookUpResp() {
		return canLookUpResp;
	}

	public void setCanLookUpResp(_CreditAccountRow[] canLookUpResp) throws Exception {
		this.canLookUpResp = canLookUpResp;
		updateTwCreditAccountRows(canLookUpResp);
	}

	public int numberOfResponseLines() {
		return (getCanLookUpResp() != null) ? getCanLookUpResp().length : 0;
	}

	public TWList getTwCreditAccountRows() {
		return twCreditAccountRows;
	}

	public void setTwCreditAccountRows(TWList twCreditAccountRows) {
		this.twCreditAccountRows = twCreditAccountRows;
	}

	public void updateTwCreditAccountRows(_CreditAccountRow[] canLookUpResp) throws Exception {
		if (this.twCreditAccountRows == null) {
			this.twCreditAccountRows = TWObjectFactory.createList();
		}
		for (int i = 0; i < canLookUpResp.length; i++) {
			this.twCreditAccountRows.addArrayData(canLookUpResp[i].getTwCreditAccountRow());
		}
	}

	@Override
	public String toString() {
		String str = "";
		if (getCanLookUpResp() != null) {
			for (int i = 0; i < getCanLookUpResp().length; i++) {
				str += "\n" + getCanLookUpResp()[i].toString();
			}
		}
		str += "\n " +  super.toString();
		return str;
	}
}
