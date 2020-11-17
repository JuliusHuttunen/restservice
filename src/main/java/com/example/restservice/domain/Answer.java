package com.example.restservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Answer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long answerid;
	private String content;
	
	
	
	public Answer() {
		
	}

	public Answer(String content) {
		super();
		this.content = content;
	}

	public long getAnswerid() {
		return answerid;
	}

	public void setAnswerid(long answerid) {
		this.answerid = answerid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Answer [answerid=" + answerid + ", content=" + content + "]";
	}
	
	
	
	
	
	

}
