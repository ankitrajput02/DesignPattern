package com.bridgelabz.behavioral.observerdpattern;

import java.util.ArrayList;
import java.util.List;

/**Subject
 *
 *
 */
public class Page {
	private List<Followers> flws = new ArrayList<>();
	String title;

	public void follow(Followers flw) {
		flws.add(flw);
	}

	public void unFollow(Followers flw) {
		flws.remove(flw);
	}

	public void notifyFollowers() {
		for (Followers flw : flws) {
			flw.update();
		}
	}

	public void upload(String title) {
		this.title = title;
		notifyFollowers();
	}

}
