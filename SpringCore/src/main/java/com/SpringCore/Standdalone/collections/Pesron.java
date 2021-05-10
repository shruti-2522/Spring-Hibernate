package com.SpringCore.Standdalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Pesron {
	private List<String> freinds;
	private Map<String,Integer> fees;
	private Properties prop1;

	public Map<String, Integer> getFees() {
		return fees;
	}

	public Properties getProp1() {
		return prop1;
	}

	public void setProp1(Properties prop1) {
		this.prop1 = prop1;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Pesron [freinds=" + freinds + ", fees=" + fees + "]";
	}

	public List<String> getFreinds() {
		return freinds;
	}

	public void setFreinds(List<String> freinds) {
		this.freinds = freinds;
	}

}
