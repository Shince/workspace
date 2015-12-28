package com.github.shince.webtemplate.entities;


import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8547939835167515760L;

	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}