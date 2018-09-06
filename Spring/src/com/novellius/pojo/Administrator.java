package com.novellius.pojo;

import java.sql.Timestamp;

public class Administrator {

	private int id;
	private String names;
	private String role;
	private Timestamp created_at;

	public Administrator() {

	}

	public Administrator(int id, String names, String role, Timestamp created_at) {
		this.id = id;
		this.names = names;
		this.role = role;
		this.created_at = created_at;
	}

	public Administrator(String names, String role, Timestamp created_at) {
		this.names = names;
		this.role = role;
		this.created_at = created_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "Administrador [id=" + id + ", names=" + names + ", role=" + role + ", created_at=" + created_at + "]";
	}

}