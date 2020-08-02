package com.nt.dto;

import java.io.Serializable;

public class CricketerDTO implements Serializable {
	private String cname;
	private String cadd;
	private float totalruns;
	private float totalmatches;
	private float numofnotouts;
	private float runsconceded;
	private float  wicketstaken;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public float getTotalruns() {
		return totalruns;
	}
	public void setTotalruns(float totalruns) {
		this.totalruns = totalruns;
	}
	public float getTotalmatches() {
		return totalmatches;
	}
	public float getNumofnotouts() {
		return numofnotouts;
	}
	public void setNumofnotouts(float numofnotouts) {
		this.numofnotouts = numofnotouts;
	}
	public void setTotalmatches(float totalmatches) {
		this.totalmatches = totalmatches;
	}
	public float getRunsconceded() {
		return runsconceded;
	}
	public void setRunsconceded(float runsconceded) {
		this.runsconceded = runsconceded;
	}
	public float getWicketstaken() {
		return wicketstaken;
	}
	public void setWicketstaken(float wicketstaken) {
		this.wicketstaken = wicketstaken;
	}
	
}
