package com.his.restControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class patientController {
	
	@RequestMapping("/patientinfo")
	public String demographicsinfo() {
	return "No Patient Data";
	}

}
