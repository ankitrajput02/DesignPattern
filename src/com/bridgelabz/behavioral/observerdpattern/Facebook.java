package com.bridgelabz.behavioral.observerdpattern;

/**
 * Title:Observer design pattern is useful when you are interested in the state
 * of an object and want to get notified whenever there is any change. In
 * observer pattern, the object that watch on the state of another object are
 * called Observer and the object that is being watched is called Subject.
 * Eg:Facebook notification program that shows when any page on the Facebook.On
 * that any user send the follow request to the page..and when the page having
 * new post then notification will be send to the followers
 * Created By:Ankit Rajput
 *
 */
public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Page reliance = new Page();
		Followers f1 = new Followers("Kunal");
		Followers f2 = new Followers("Ankit");
		Followers f3 = new Followers("Ashish");
		Followers f4 = new Followers("Vicky");
		reliance.follow(f1);
		reliance.follow(f2);
		reliance.follow(f3);
		reliance.follow(f4);
		reliance.unFollow(f2);
		f1.followPage(reliance);
		f2.followPage(reliance);
		f3.followPage(reliance);
		f4.followPage(reliance);
		reliance.upload("Good Morning Followers!!");

	}

}
