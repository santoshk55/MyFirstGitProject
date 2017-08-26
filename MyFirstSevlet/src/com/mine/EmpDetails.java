package com.mine;

import java.io.Serializable;
import java.util.ArrayList;

public class EmpDetails implements Serializable{

	private String name;
	private String success="Login is Successful";
	private String error="Login is Not Successful";
	private String msg;
	private ArrayList<EmpDetails> allNames;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getFirstName(){
		System.out.println(this.name);
		return this.name;
	}

	public ArrayList<EmpDetails> getAllNames() {
		return allNames;
	}

	public void setAllNames(ArrayList<EmpDetails> allNames) {
		this.allNames = allNames;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
