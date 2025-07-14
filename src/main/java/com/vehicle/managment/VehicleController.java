package com.vehicle.managment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@GetMapping("/fetch")
	public ResponseEntity<String> fetchVehicleDetails(@RequestParam String name) {
		
		System.out.println("---------------------");
		System.out.println("Processing request. Input received: " + name);
		System.out.println("---------------------");
		
		return ResponseEntity.ok("Vehicle Details are fetched.");
	}
}
