package com.SpringCore.ci;

public class Pesron {
	
	private int personId;
	private String personName;
	private Cert cer;
	
	 public Pesron(int personId,String personName,Cert cer)
	 {
		this.personId=personId;
		this.personName=personName;
		this.cer=cer;
		
	 }

	@Override
	public String toString() {
		
		return this.personId+" : "+this.personName+"{"+this.cer+"}";
	}
	

}
