package com.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grade")
public class Grade {
	@Id
	@Column(name="grade_id")
	private Integer gradeId;
	
	@Column(name="g_name")
	private String Gradename;	
	
	
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public String getGradename() {
		return Gradename;
	}
	public void setGradename(String gradename) {
		Gradename = gradename;
	}
	
	
	
}
