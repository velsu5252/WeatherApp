package com.qcs.WeatherApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
	
	@RequestMapping("/")
	public String getWeather(@RequestParam(value = "city", defaultValue = "World")String city) {
		
		
		return "Do you want to know the weather of "+city;
		
	}
	

}
