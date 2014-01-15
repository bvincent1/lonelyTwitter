package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantLonelyTweetModel extends LonelyTweetModel {

	public ImportantLonelyTweetModel(String text, Date timestamp) {
		super(text, timestamp);
	}

	public ImportantLonelyTweetModel(String text) {
		super(text);
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public Boolean checkImportantTweetModel() {
		return true;		
	}

}
