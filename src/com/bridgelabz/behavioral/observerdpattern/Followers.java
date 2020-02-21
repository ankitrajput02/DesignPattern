package com.bridgelabz.behavioral.observerdpattern;

/**
 * Observers
 *
 */
public class Followers {
	private String name;
	private Page page = new Page();

	public Followers(String name) {
		super();
		this.name = name;
	}

	public void update() {
		System.out.println("Hey " + name + " ,New Post Uploaded :"+page.title);
	}

	public void followPage(Page pg) {
		page = pg;
	}
}
