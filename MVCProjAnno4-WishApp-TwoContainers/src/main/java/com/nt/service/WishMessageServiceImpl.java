package com.nt.service;

import java.util.Calendar;
import org.springframework.stereotype.Service;

@Service("wishService")
public class WishMessageServiceImpl implements IWishMessageService  {

	@Override
	public String generateWishMessage() {
		
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12) 
			return "Good Morning";
			else if (hour<16) 
				return "Good Afternoon";
			else if (hour<20)
				return "Good Evening";
			else 
				return "Good Night";
 	}
}
