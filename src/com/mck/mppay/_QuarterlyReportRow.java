/**
 * 
 */
package com.mck.mppay;

import java.util.Date;

import teamworks.TWObject;
import teamworks.TWObjectFactory;

/**
 * @author akatre
 *
 */

public class _QuarterlyReportRow {

	private String custId;
	private String custName;
	private String can;
	private String canName;
	private String acmId;
	private String acmName;
	private String calQtr;
	private String fiscalQtr;
	private String billToId;
	private String billToName;
	private String billToDC;
	private int prepayDays;
	private String priorQtrEndBal;
	private String currQtrEndBal;
	private String depositAmt;
	private String openBilling;
	private String priorQtrSales;
	private int salesMonths;
	private String currQtrSales;
	private String dailyAvgSales;
	private String prepayCalc;
	private String currQtrCanSales;
	private String currCanDeposit;
	private String currOpenCanBilling;
	private String rightToOffset;
	private String billType;
	private String adjAmt;
	private String altPayerId;
	private String altPayerName;
	private String dc;
	private Date dateGenerated;
	private String dateGeneratedStr;
	private String contactName;
	private String contactEmail;
	private TWObject twQuarterlyReportRow;

	public _QuarterlyReportRow() {
		super();
		try {
			this.setTwQuarterlyReportRow(TWObjectFactory.createObject());
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
		this.twQuarterlyReportRow.setPropertyValue("can", this.can);
	}

	public String getCanName() {
		return canName;
	}

	public void setCanName(String canName) {
		this.canName = canName;
		this.twQuarterlyReportRow.setPropertyValue("canName", this.canName);
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
		this.twQuarterlyReportRow.setPropertyValue("custId", this.custId);
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
		this.twQuarterlyReportRow.setPropertyValue("custName", this.custName);
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		this.twQuarterlyReportRow.setPropertyValue("contactName", this.contactName);
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
		this.twQuarterlyReportRow.setPropertyValue("contactEmail", this.contactEmail);
	}

	public String getAcmId() {
		return acmId;
	}

	public void setAcmId(String acmId) {
		this.acmId = acmId;
		this.twQuarterlyReportRow.setPropertyValue("acmId", this.acmId);
	}

	public String getAcmName() {
		return acmName;
	}

	public void setAcmName(String acmName) {
		this.acmName = acmName;
		this.twQuarterlyReportRow.setPropertyValue("acmName", this.acmName);
	}

	public String getCalQtr() {
		return calQtr;
	}

	public void setCalQtr(String calQtr) {
		this.calQtr = calQtr;
		this.twQuarterlyReportRow.setPropertyValue("calQtr", this.calQtr);
	}

	public String getFiscalQtr() {
		return fiscalQtr;
	}

	public void setFiscalQtr(String fiscalQtr) {
		this.fiscalQtr = fiscalQtr;
		this.twQuarterlyReportRow.setPropertyValue("fiscalQtr", this.fiscalQtr);
	}

	public String getBillToId() {
		return billToId;
	}

	public void setBillToId(String billToId) {
		this.billToId = billToId;
		this.twQuarterlyReportRow.setPropertyValue("billToId", this.billToId);
	}

	public String getBillToName() {
		return billToName;
	}

	public void setBillToName(String billToName) {
		this.billToName = billToName;
		this.twQuarterlyReportRow.setPropertyValue("billToName", this.billToName);
	}

	public String getBillToDC() {
		return billToDC;
	}

	public void setBillToDC(String billToDC) {
		this.billToDC = billToDC;
		this.twQuarterlyReportRow.setPropertyValue("billToDC", this.billToDC);
	}

	public int getPrepayDays() {
		return prepayDays;
	}

	public void setPrepayDays(int prepayDays) {
		this.prepayDays = prepayDays;
		this.twQuarterlyReportRow.setPropertyValue("prepayDays", this.prepayDays);
	}

	public String getPriorQtrEndBal() {
		return priorQtrEndBal;
	}

	public void setPriorQtrEndBal(String priorQtrEndBal) {
		this.priorQtrEndBal = priorQtrEndBal;
		this.twQuarterlyReportRow.setPropertyValue("prepayDays", this.prepayDays);
	}

	public String getCurrQtrEndBal() {
		return currQtrEndBal;
	}

	public void setCurrQtrEndBal(String currQtrEndBal) {
		this.currQtrEndBal = currQtrEndBal;
		this.twQuarterlyReportRow.setPropertyValue("currQtrEndBal", this.currQtrEndBal);
	}

	public String getOpenBilling() {
		return openBilling;
	}

	public void setOpenBilling(String openBilling) {
		this.openBilling = openBilling;
		this.twQuarterlyReportRow.setPropertyValue("openBilling", this.openBilling);
	}

	public String getPriorQtrSales() {
		return priorQtrSales;
	}

	public void setPriorQtrSales(String priorQtrSales) {
		this.priorQtrSales = priorQtrSales;
		this.twQuarterlyReportRow.setPropertyValue("priorQtrSales", this.priorQtrSales);
	}

	public int getSalesMonths() {
		return salesMonths;
	}

	public void setSalesMonths(int salesMonths) {
		this.salesMonths = salesMonths;
		this.twQuarterlyReportRow.setPropertyValue("salesMonths", this.salesMonths);
	}

	public String getCurrQtrSales() {
		return currQtrSales;
	}

	public void setCurrQtrSales(String currQtrSales) {
		this.currQtrSales = currQtrSales;
		this.twQuarterlyReportRow.setPropertyValue("currQtrSales", this.currQtrSales);
	}

	public String getDailyAvgSales() {
		return dailyAvgSales;
	}

	public void setDailyAvgSales(String dailyAvgSales) {
		this.dailyAvgSales = dailyAvgSales;
		this.twQuarterlyReportRow.setPropertyValue("dailyAvgSales", this.dailyAvgSales);
	}

	public String getPrepayCalc() {
		return prepayCalc;
	}

	public void setPrepayCalc(String prepayCalc) {
		this.prepayCalc = prepayCalc;
		this.twQuarterlyReportRow.setPropertyValue("prepayCalc", this.prepayCalc);
	}

	public String getCurrQtrCanSales() {
		return currQtrCanSales;
	}

	public void setCurrQtrCanSales(String currQtrCanSales) {
		this.currQtrCanSales = currQtrCanSales;
		this.twQuarterlyReportRow.setPropertyValue("currQtrCanSales", this.currQtrCanSales);
	}

	public String getCurrCanDeposit() {
		return currCanDeposit;
	}

	public void setCurrCanDeposit(String currCanDeposit) {
		this.currCanDeposit = currCanDeposit;
		this.twQuarterlyReportRow.setPropertyValue("currCanDeposit", this.currCanDeposit);
	}

	public String getCurrOpenCanBilling() {
		return currOpenCanBilling;
	}

	public void setCurrOpenCanBilling(String currOpenCanBilling) {
		this.currOpenCanBilling = currOpenCanBilling;
		this.twQuarterlyReportRow.setPropertyValue("currOpenCanBilling", this.currOpenCanBilling);
	}

	public String getRightToOffset() {
		return rightToOffset;
	}

	public void setRightToOffset(String rightToOffset) {
		this.rightToOffset = rightToOffset;
		this.twQuarterlyReportRow.setPropertyValue("rightToOffset", this.rightToOffset);
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
		this.twQuarterlyReportRow.setPropertyValue("billType", this.billType);
	}

	public String getAdjAmt() {
		return adjAmt;
	}

	public void setAdjAmt(String adjAmt) {
		this.adjAmt = adjAmt;
		this.twQuarterlyReportRow.setPropertyValue("adjAmt", this.adjAmt);
	}

	public String getDepositAmt() {
		return depositAmt;
	}

	public void setDepositAmt(String depositAmt) {
		this.depositAmt = depositAmt;
		this.twQuarterlyReportRow.setPropertyValue("depositAmt", this.depositAmt);
	}

	public String getAltPayerId() {
		return altPayerId;
	}

	public void setAltPayerId(String altPayerId) {
		this.altPayerId = altPayerId;
		this.twQuarterlyReportRow.setPropertyValue("altPayerId", this.altPayerId);
	}

	public String getAltPayerName() {
		return altPayerName;
	}

	public void setAltPayerName(String altPayerName) {
		this.altPayerName = altPayerName;
		this.twQuarterlyReportRow.setPropertyValue("altPayerName", this.altPayerName);
	}

	public String getDc() {
		return dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
		this.twQuarterlyReportRow.setPropertyValue("dc", this.dc);
	}

	public Date getDateGenerated() {
		return dateGenerated;
	}

	public void setDateGenerated(Date dateGenerated) {
		this.dateGenerated = dateGenerated;
		setDateGeneratedStr(dateGenerated.toString());
		this.twQuarterlyReportRow.setPropertyValue("dateGenerated", this.dateGenerated);
	}

	public String getDateGeneratedStr() {
		return dateGeneratedStr;
	}

	public void setDateGeneratedStr(String dateGeneratedStr) {
		this.dateGeneratedStr = dateGeneratedStr;
		this.twQuarterlyReportRow.setPropertyValue("dateGeneratedStr", this.dateGeneratedStr);
	}

	public TWObject getTwQuarterlyReportRow() {
		return twQuarterlyReportRow;
	}
	
	public void setTwQuarterlyReportRow(TWObject twQuarterlyReportRow) {
		this.twQuarterlyReportRow = twQuarterlyReportRow;
	}

	@Override
	public String toString() {
		String str = "";
		str += " can: " + can + ", custId: " + custId + ", acmId: " + acmId; 
		str += "\n " + super.toString();
		return str;
	}
}
