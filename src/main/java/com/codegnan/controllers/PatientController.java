package com.codegnan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codegnan.entity.Patient;
import com.codegnan.service.PatientService;

@RestController
@RequestMapping("patient")
@CrossOrigin(origins = "http://localhost:3000")public class PatientController {
	@Autowired
	PatientService ps;
	
	@PostMapping
	public Patient setPatient(@RequestBody Patient patient) {
		return ps.setPatient(patient);
	}
	@GetMapping
	public List<Patient> getPatient() {
		return ps.getPatient();
	}
	@DeleteMapping("/{id}")
	public Patient delPatient(@PathVariable int id) {
		return ps.delPatient(id);
	}
	 @PutMapping("/{id}")  // Added path variable for specific patient update
	    public Patient edit(@PathVariable int id, @RequestBody Patient patient) {
	        return ps.editPatient(id, patient);
	    }
	 
	 @GetMapping("/{dis}")
	 public List<Patient> categoryDis(@PathVariable String dis)
	 {
		 return ps.getPatientByDis(dis);
	 }
	
}
