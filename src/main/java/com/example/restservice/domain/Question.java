package com.example.restservice.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String qst;

	private String qsttype;
	
	private String answer;

	public Question() {

	}

	public Question(String qst, String qsttype, String answer) {
		super();
		this.qst = qst;
		this.qsttype = qsttype;
		this.answer = answer;
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQst() {
		return qst;
	}

	public void setQst(String qst) {
		this.qst = qst;
	}

	public String getQsttype() {
		return qsttype;
	}

	public void setQsttype(String qsttype) {
		this.qsttype = qsttype;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", qst=" + qst + ", qsttype=" + qsttype + ", answer=" + answer + "]";
	}

	

}
