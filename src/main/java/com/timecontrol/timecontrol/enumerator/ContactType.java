package com.timecontrol.timecontrol.enumerator;

public enum ContactType {

	EMAIL("email"),

	PHONE("telefone");

	private String description;

	private ContactType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
