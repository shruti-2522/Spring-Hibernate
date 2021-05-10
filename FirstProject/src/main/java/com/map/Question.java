package com.map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	@Column(name = "QuestionId")
	private int que_id;
	private String Question;

//	@OneToOne
//	private Answer and;

	
	//EAGER LOADING
	@OneToMany(mappedBy = "que1",fetch = FetchType.EAGER)
	private List<Answer> ans;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQue_id() {
		return que_id;
	}

	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	public Question(int que_id, String question, List<Answer> ans) {
		super();
		this.que_id = que_id;
		Question = question;
		this.ans = ans;
	}

}
