package com.kunal.spring.unit_converter.resource;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnitConverterController {

	public static final Logger LOGGER= LoggerFactory.getLogger(UnitConverterController.class);
	
	@GetMapping("/")
	public String appHealth()
	{
		return "{healty:true}"; 
	}
	
	@GetMapping("/unit-converter/from/{from}/to/{to}")
	public String retrieveConvertedValue(@PathVariable String from,@PathVariable String to, @RequestHeader Map<String,String> headers) {
		printAllHeaders(headers);
		return "Converting: "+from+" to: "+to;
	}
	
	private void printAllHeaders(Map<String,String> headers) {
		headers.forEach((key,value)->{
			LOGGER.info(String.format("Header '%s'=%s",key,value));
		});
	}
}
