package kosta.bean;

import java.io.Serializable;

public class Blog implements Serializable{
	private String id;
	private String title;
	private String content;
	private Author author;
	
	public Blog() {}

	public Blog(String id, String title, String content, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}
