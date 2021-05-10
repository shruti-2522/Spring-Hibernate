package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	private int AnsId;

	public Answer(int ansId, String ans) {
		super();
		AnsId = ansId;
		Ans = ans;
	}

	public int getAnsId() {
		return AnsId;
	}

	public void setAnsId(int ansId) {
		AnsId = ansId;
	}

	public String getAns() {
		return Ans;
	}

	public void setAns(String ans) {
		Ans = ans;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	// @OneToOne

	@ManyToOne
	private Question que1;
	private String Ans;

	public Question getQue1() {
		return que1;
	}

	public void setQue1(Question que1) {
		this.que1 = que1;
	}

}
