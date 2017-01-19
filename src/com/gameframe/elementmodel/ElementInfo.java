package com.gameframe.elementmodel;

public class ElementInfo {
	
	private String atomicno;
	private String symbol;
	private String name;
	private String appearance;
	private String rair;
	private String rwater;
	private String racid;
	private String occurance;
	private String eshell;
	private String bp;
	private String mp;
	
	
	public ElementInfo(String at,String sym,String n,String app,String air,String water,String acid,String occ,String shell,String b,String m) {
		// TODO Auto-generated constructor stub
		atomicno=at;
		symbol=sym;
		name=n;
		appearance=app;
		rair=air;
		rwater=water;
		racid=acid;
		occurance=occ;
		eshell=shell;
		bp=b;
		mp=m;
	}
	
	
	public String getAtomicno() {
		return atomicno;
	}
	public void setAtomicno(String atomicno) {
		this.atomicno = atomicno;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAppearance() {
		return appearance;
	}
	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}
	public String getRair() {
		return rair;
	}
	public void setRair(String rair) {
		this.rair = rair;
	}
	public String getRwater() {
		return rwater;
	}
	public void setRwater(String rwater) {
		this.rwater = rwater;
	}
	public String getRacid() {
		return racid;
	}
	public void setRacid(String racid) {
		this.racid = racid;
	}
	public String getOccurance() {
		return occurance;
	}
	public void setOccurance(String occurance) {
		this.occurance = occurance;
	}
	public String getEshell() {
		return eshell;
	}
	public void setEshell(String eshell) {
		this.eshell = eshell;
	}
	public String getBp() {
		return bp;
	}
	public void setBp(String bp) {
		this.bp = bp;
	}
	public String getMp() {
		return mp;
	}
	public void setMp(String mp) {
		this.mp = mp;
	}
	

}
