package com.exam.vo;

import java.sql.Timestamp;

// VO(Value Object) : 값 객체
public class Member {
	private int id;
	private String name;
	private Timestamp reg_date;
	
	public Member() {}
	
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Timestamp getReg_date() {
		return reg_date;
	}
	
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", reg_date=" + reg_date + "]";
	}
	
}
