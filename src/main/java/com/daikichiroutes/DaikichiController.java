package com.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController("/")
public class DaikichiController {
	@RequestMapping("/daikichi")
	public String daikichi() {
		return "Welcome!";
	}
	@RequestMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/m/daikichi/{travel}")
	public String showTravel( 
			@PathVariable("travel") String travel ) {
		return "Congratulations you will travel to " + travel;
	}
	
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable int num){
		if(num % 2 == 0) {
			return "You will take a grand journey in the near future" ;
		}
		else {
			return "You have enjoyed the fruits of your labor but now it's a great time to spend time with friends and family";
		}
		
		
	}
	
	
	
	

}
