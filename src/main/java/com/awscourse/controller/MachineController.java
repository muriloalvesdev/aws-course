package com.awscourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awscourse.resource.DetailedMachine;
import com.awscourse.resource.Machine;
import com.awscourse.service.MachineService;

@RestController
@RequestMapping(value = "machines")
public class MachineController {

	@Autowired
	private MachineService service;

	@GetMapping("/basic")
	public ResponseEntity<Machine> getMachineInformation() {
		return ResponseEntity.ok(service.getMachineInformation());
	}

	@GetMapping("/detailed")
	public ResponseEntity<DetailedMachine> getDetailedMachineInformation() {
		return ResponseEntity.ok(service.getDetailedMachineInformation());
	}

}
