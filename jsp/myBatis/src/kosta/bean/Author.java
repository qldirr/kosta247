package kosta.bean;

import java.io.Serializable;

public class Author implements Serializable {
	private String author_id;
	private String name;
	private String address;
	
	public Author() {}

	public Author(String author_id, String name, String address) {
		super();
		this.author_id = author_id;
		this.name = name;
		this.address = address;
	}

	public String getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
