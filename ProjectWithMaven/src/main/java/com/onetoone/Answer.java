package com.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer1;
	
	@OneToOne(mappedBy = "answer", cascade = CascadeType.ALL) 
	private Question question2;
	
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public Question getQuestion2() {
		return question2;
	}
	public void setQuestion2(Question question2) {
		this.question2 = question2;
	}
	
	
}
