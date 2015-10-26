package com.mnbryant.twinkies;

import java.text.DateFormat;
import java.util.Date;

public abstract class Event {

	protected String title;
	protected Date date;
	protected String eventDesc;
	
	public Event(String Title, String Date, String Desc) {
		DateFormat df = DateFormat.getDateInstance();
		title = Title;
		try {
			date = df.parse(Date);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		eventDesc = Desc;
	}

}