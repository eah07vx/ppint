/**
 * 
 */
package com.mck.mppay;

//import java.util.Date;

import teamworks.TWObject;
import teamworks.TWObjectFactory;

/**
 * @author akatre
 *
 */
public class _CreditAccountRow {
	
	private String custId;
	private String custName;
	private String can;
	private String canName;
	private String acmId;
	private String acmName;
//	private String calQtr;
//	private String fiscalQtr;
	private String billToId;
	private String billToName;
	private String billToDC;
	private int prepayDays;
	private float priorQtrEndBal;
	private float depositAmt;
//	private float currentDeposit;
//	private float openBilling;
//	private float priorQtrSales;
//	private int salesMonths;
//	private float currQtrSales;
	private float dailyAvgSales;
//	private float prepayCalc;
//	private float currQtrCanSales;
//	private float currCanDeposit;
//	private float currOpenCanBilling;
	private String rightToOffset;
	private String billType;
//	private float adjAmt;
	private String altPayerId;
	private String altPayerName;
	private String dc;
//	private Date dateGenerated;
//	private String dateGeneratedStr;
	private TWObject twCreditAccountRow;
	private String contactName;
	private String contactEmail;
	
	public _CreditAccountRow() {
		super();
		try {
			this.setTwCreditAccountRow(TWObjectFactory.createObject());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public String getCan() {
		return can;
	}

	public void setCan(String can) {
		this.can = can;
		this.twCreditAccountRow.setPropertyValue("can", this.can);
	}

	public String getCanName() {
		return canName;
	}

	public void setCanName(String canName) {
		this.canName = canName;
		this.twCreditAccountRow.setPropertyValue("canName", this.canName);
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
		this.twCreditAccountRow.setPropertyValue("custId", this.custId);
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
		this.twCreditAccountRow.setPropertyValue("custName", this.custName);
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		this.twCreditAccountRow.setPropertyValue("contactName", this.contactName);
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
		this.twCreditAccountRow.setPropertyValue("contactEmail", this.contactEmail);
	}

	public String getAcmId() {
		return acmId;
	}

	public void setAcmId(String acmId) {
		this.acmId = acmId;
		this.twCreditAccountRow.setPropertyValue("acmId", this.acmId);
	}

	public String getAcmName() {
		return acmName;
	}

	public void setAcmName(String acmName) {
		this.acmName = acmName;
		this.twCreditAccountRow.setPropertyValue("acmName", this.acmName);
	}
/*
	public String getCalQtr() {
		return calQtr;
	}

	public void setCalQtr(String calQtr) {
		this.calQtr = calQtr;
		this.twCreditAccountRow.setPropertyValue("calQtr", this.calQtr);
	}

	public String getFiscalQtr() {
		return fiscalQtr;
	}

	public void setFiscalQtr(String fiscalQtr) {
		this.fiscalQtr = fiscalQtr;
		this.twCreditAccountRow.setPropertyValue("fiscalQtr", this.fiscalQtr);
	}
*/
	public String getBillToId() {
		return billToId;
	}

	public void setBillToId(String billToId) {
		this.billToId = billToId;
		this.twCreditAccountRow.setPropertyValue("billToId", this.billToId);
	}

	public String getBillToName() {
		return billToName;
	}

	public void setBillToName(String billToName) {
		this.billToName = billToName;
		this.twCreditAccountRow.setPropertyValue("billToName", this.billToName);
	}

	public String getBillToDC() {
		return billToDC;
	}

	public void setBillToDC(String billToDC) {
		this.billToDC = billToDC;
		this.twCreditAccountRow.setPropertyValue("billToDC", this.billToDC);
	}

	public int getPrepayDays() {
		return prepayDays;
	}

	public void setPrepayDays(int prepayDays) {
		this.prepayDays = prepayDays;
		this.twCreditAccountRow.setPropertyValue("prepayDays", this.prepayDays);
	}

	public float getPriorQtrEndBal() {
		return priorQtrEndBal;
	}

	public void setPriorQtrEndBal(float priorQtrEndBal) {
		this.priorQtrEndBal = priorQtrEndBal;
		this.twCreditAccountRow.setPropertyValue("prepayDays", this.prepayDays);
	}
/*
	public float getCurrentDeposit() {
		return currentDeposit;
	}

	public void setCurrentDeposit(float currentDeposit) {
		this.currentDeposit = currentDeposit;
		this.twCreditAccountRow.setPropertyValue("currentDeposit", this.currentDeposit);
	}

	public float getOpenBilling() {
		return openBilling;
	}

	public void setOpenBilling(float openBilling) {
		this.openBilling = openBilling;
		this.twCreditAccountRow.setPropertyValue("openBilling", this.openBilling);
	}

	public float getPriorQtrSales() {
		return priorQtrSales;
	}

	public void setPriorQtrSales(float priorQtrSales) {
		this.priorQtrSales = priorQtrSales;
		this.twCreditAccountRow.setPropertyValue("priorQtrSales", this.priorQtrSales);
	}

	public int getSalesMonths() {
		return salesMonths;
	}

	public void setSalesMonths(int salesMonths) {
		this.salesMonths = salesMonths;
		this.twCreditAccountRow.setPropertyValue("salesMonths", this.salesMonths);
	}

	public float getCurrQtrSales() {
		return currQtrSales;
	}

	public void setCurrQtrSales(float currQtrSales) {
		this.currQtrSales = currQtrSales;
		this.twCreditAccountRow.setPropertyValue("currQtrSales", this.currQtrSales);
	}
*/
	public float getDailyAvgSales() {
		return dailyAvgSales;
	}

	public void setDailyAvgSales(float dailyAvgSales) {
		this.dailyAvgSales = dailyAvgSales;
		this.twCreditAccountRow.setPropertyValue("dailyAvgSales", this.dailyAvgSales);
	}
/*
	public float getPrepayCalc() {
		return prepayCalc;
	}

	public void setPrepayCalc(float prepayCalc) {
		this.prepayCalc = prepayCalc;
		this.twCreditAccountRow.setPropertyValue("prepayCalc", this.prepayCalc);
	}

	public float getCurrQtrCanSales() {
		return currQtrCanSales;
	}

	public void setCurrQtrCanSales(float currQtrCanSales) {
		this.currQtrCanSales = currQtrCanSales;
		this.twCreditAccountRow.setPropertyValue("currQtrCanSales", this.currQtrCanSales);
	}

	public float getCurrCanDeposit() {
		return currCanDeposit;
	}

	public void setCurrCanDeposit(float currCanDeposit) {
		this.currCanDeposit = currCanDeposit;
		this.twCreditAccountRow.setPropertyValue("currCanDeposit", this.currCanDeposit);
	}

	public float getCurrOpenCanBilling() {
		return currOpenCanBilling;
	}

	public void setCurrOpenCanBilling(float currOpenCanBilling) {
		this.currOpenCanBilling = currOpenCanBilling;
		this.twCreditAccountRow.setPropertyValue("currOpenCanBilling", this.currOpenCanBilling);
	}
*/
	public String getRightToOffset() {
		return rightToOffset;
	}

	public void setRightToOffset(String rightToOffset) {
		this.rightToOffset = rightToOffset;
		this.twCreditAccountRow.setPropertyValue("rightToOffset", this.rightToOffset);
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
		this.twCreditAccountRow.setPropertyValue("billType", this.billType);
	}
/*
	public float getAdjAmt() {
		return adjAmt;
	}

	public void setAdjAmt(float adjAmt) {
		this.adjAmt = adjAmt;
		this.twCreditAccountRow.setPropertyValue("adjAmt", this.adjAmt);
	}
*/
	public float getDepositAmt() {
		return depositAmt;
	}

	public void setDepositAmt(float depositAmt) {
		this.depositAmt = depositAmt;
		this.twCreditAccountRow.setPropertyValue("depositAmt", this.depositAmt);
	}

	public String getAltPayerId() {
		return altPayerId;
	}

	public void setAltPayerId(String altPayerId) {
		this.altPayerId = altPayerId;
		this.twCreditAccountRow.setPropertyValue("altPayerId", this.altPayerId);
	}

	public String getAltPayerName() {
		return altPayerName;
	}

	public void setAltPayerName(String altPayerName) {
		this.altPayerName = altPayerName;
		this.twCreditAccountRow.setPropertyValue("altPayerName", this.altPayerName);
	}

	public String getDc() {
		return dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
		this.twCreditAccountRow.setPropertyValue("dc", this.dc);
	}
/*
	public Date getDateGenerated() {
		return dateGenerated;
	}

	public void setDateGenerated(Date dateGenerated) {
		this.dateGenerated = dateGenerated;
		setDateGeneratedStr(dateGenerated.toString());
		this.twCreditAccountRow.setPropertyValue("dateGenerated", this.dateGenerated);
	}

	public String getDateGeneratedStr() {
		return dateGeneratedStr;
	}

	public void setDateGeneratedStr(String dateGeneratedStr) {
		this.dateGeneratedStr = dateGeneratedStr;
		this.twCreditAccountRow.setPropertyValue("dateGeneratedStr", this.dateGeneratedStr);
	}
*/
	public TWObject getTwCreditAccountRow() {
		return twCreditAccountRow;
	}
	
	public void setTwCreditAccountRow(TWObject twCreditAccountRow) {
		this.twCreditAccountRow = twCreditAccountRow;
	}

	@Override
	public String toString() {
		String str = "";
		str += " can: " + can + ", custId: " + custId + ", acmId: " + acmId; 
		str += "\n " + super.toString();
		return str;
	}
}


