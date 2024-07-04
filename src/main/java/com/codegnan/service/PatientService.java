package com.codegnan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegnan.entity.Patient;
import com.codegnan.repo.PatientRepo;

@Service
public class PatientService {
	@Autowired
	PatientRepo pr;

	public Patient setPatient(Patient patient) {
		// TODO Auto-generated method stub
		return pr.save(patient);
	}

	public List<Patient> getPatient() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	public Patient delPatient(int id) {
		// TODO Auto-generated method stub
		Patient patient = pr.findById(id).orElse(new Patient());
		pr.deleteById(id);
		return patient;
	}

	public Patient editPatient(int id, Patient updatedPatient) {
        return pr.findById(id)
            .map(existingPatient -> {
                existingPatient.setName(updatedPatient.getName());
                existingPatient.setWeight(updatedPatient.getWeight());
                existingPatient.setGender(updatedPatient.getGender());
                existingPatient.setAge(updatedPatient.getAge());
                existingPatient.setDisease(updatedPatient.getDisease());
                return pr.save(existingPatient);
            })
            .orElse(null);  
 }

	public List<Patient> getPatientByDis(String dis) {
		// TODO Auto-generated method stub
		return pr.findBydisease(dis);
	}
}
