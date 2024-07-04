package com.codegnan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegnan.entity.Doctor;
import com.codegnan.repo.DoctorRepo;
@Service
public class DoctorService {
	@Autowired
	DoctorRepo doc;

	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return doc.findAll();
	}

	public Doctor getDoctor(int id) {
		// TODO Auto-generated method stub
		return doc.findById(id).orElse(new Doctor());
	}

	public Doctor setDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doc.save(doctor);
	}

	public Doctor delDoctor(int id) {
		// TODO Auto-generated method stub
		Doctor doctor = doc.findById(id).orElse(new Doctor());
		doc.deleteById(id);
		
		return doctor;
	}
	
	

}
