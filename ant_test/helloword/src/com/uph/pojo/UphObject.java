package com.uph.pojo;

import java.io.Serializable;

public class UphObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4917462503208541726L;

	private String date;
	private String daytz;
	private String process;
	private String line;
	private String qty;
	private String tqty;
	private String totaltime;
	private String maxtime;
	private String maintaintime;
	private String prqmotime;
	private String changelinetime;
	private String lackelementtime;
	private String lessboard;
	private String xrsssj;
	private String scatteredelement;
	private String oppositeelement;
	private String xboard;
	private String losscapacity;
	private String unusualtime;
	
	@Override
	public String toString() {
		return "{date=" + date + ", daytz=" + daytz + ", process=" + process + ", line=" + line + ", qty="
				+ qty + ", tqty=" + tqty + ", totaltime=" + totaltime + ", maxtime=" + maxtime + ", maintaintime="
				+ maintaintime + ", prqmotime=" + prqmotime + ", changelinetime=" + changelinetime
				+ ", lackelementtime=" + lackelementtime + ", lessboard=" + lessboard + ", xrsssj=" + xrsssj
				+ ", scatteredelement=" + scatteredelement + ", oppositeelement=" + oppositeelement + ", xboard="
				+ xboard + ", losscapacity=" + losscapacity + ", unusualtime=" + unusualtime + "}\r\n";
	}
	public UphObject(){
		
	}
	public UphObject(String date, String daytz, String process, String line, String qty, String tqty, String totaltime,
			String maxtime, String maintaintime, String prqmotime, String changelinetime, String lackelementtime,
			String lessboard, String xrsssj, String scatteredelement, String oppositeelement, String xboard,
			String losscapacity, String unusualtime) {
		super();
		this.date = date;
		this.daytz = daytz;
		this.process = process;
		this.line = line;
		this.qty = qty;
		this.tqty = tqty;
		this.totaltime = totaltime;
		this.maxtime = maxtime;
		this.maintaintime = maintaintime;
		this.prqmotime = prqmotime;
		this.changelinetime = changelinetime;
		this.lackelementtime = lackelementtime;
		this.lessboard = lessboard;
		this.xrsssj = xrsssj;
		this.scatteredelement = scatteredelement;
		this.oppositeelement = oppositeelement;
		this.xboard = xboard;
		this.losscapacity = losscapacity;
		this.unusualtime = unusualtime;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDaytz() {
		return daytz;
	}
	public void setDaytz(String daytz) {
		this.daytz = daytz;
	}
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getTqty() {
		return tqty;
	}
	public void setTqty(String tqty) {
		this.tqty = tqty;
	}
	public String getTotaltime() {
		return totaltime;
	}
	public void setTotaltime(String totaltime) {
		this.totaltime = totaltime;
	}
	public String getMaxtime() {
		return maxtime;
	}
	public void setMaxtime(String maxtime) {
		this.maxtime = maxtime;
	}
	public String getMaintaintime() {
		return maintaintime;
	}
	public void setMaintaintime(String maintaintime) {
		this.maintaintime = maintaintime;
	}
	public String getPrqmotime() {
		return prqmotime;
	}
	public void setPrqmotime(String prqmotime) {
		this.prqmotime = prqmotime;
	}
	public String getChangelinetime() {
		return changelinetime;
	}
	public void setChangelinetime(String changelinetime) {
		this.changelinetime = changelinetime;
	}
	public String getLackelementtime() {
		return lackelementtime;
	}
	public void setLackelementtime(String lackelementtime) {
		this.lackelementtime = lackelementtime;
	}
	public String getLessboard() {
		return lessboard;
	}
	public void setLessboard(String lessboard) {
		this.lessboard = lessboard;
	}
	public String getXrsssj() {
		return xrsssj;
	}
	public void setXrsssj(String xrsssj) {
		this.xrsssj = xrsssj;
	}
	public String getScatteredelement() {
		return scatteredelement;
	}
	public void setScatteredelement(String scatteredelement) {
		this.scatteredelement = scatteredelement;
	}
	public String getOppositeelement() {
		return oppositeelement;
	}
	public void setOppositeelement(String oppositeelement) {
		this.oppositeelement = oppositeelement;
	}
	public String getXboard() {
		return xboard;
	}
	public void setXboard(String xboard) {
		this.xboard = xboard;
	}
	public String getLosscapacity() {
		return losscapacity;
	}
	public void setLosscapacity(String losscapacity) {
		this.losscapacity = losscapacity;
	}
	public String getUnusualtime() {
		return unusualtime;
	}
	public void setUnusualtime(String unusualtime) {
		this.unusualtime = unusualtime;
	}
	
}
