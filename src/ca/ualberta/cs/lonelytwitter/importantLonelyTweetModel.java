package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class importantLonelyTweetModel extends LonelyTweetModel {

	public importantLonelyTweetModel(String text, Date timestamp) {
		super(text, timestamp);
	}

	public importantLonelyTweetModel(String text) {
		super(text);
	}

	public void setText(String text) {
		this.text = text;
	}

}
