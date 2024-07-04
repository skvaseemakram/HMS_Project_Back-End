package com.codegnan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codegnan.entity.Doctor;
import com.codegnan.service.DoctorService;

@RestController
@RequestMapping("/doctor")
@CrossOrigin("*")
public class DoctorController {
	@Autowired
	DoctorService ds;
	@GetMapping
	public List<Doctor> Doctors(){
		return ds.getAllDoctors(); 
	}
	@GetMapping("/{id}")
	public Doctor doctor(@PathVariable("id") int id) {
		return ds.getDoctor(id);
	}
	@PostMapping
	public Doctor setDoctor(Doctor doctor) {
		return ds.setDoctor(doctor);
	}
	@DeleteMapping("/{id}")
	public Doctor delDoctor(@PathVariable("id") int id) {
		return ds.delDoctor(id);
	}
	
}
