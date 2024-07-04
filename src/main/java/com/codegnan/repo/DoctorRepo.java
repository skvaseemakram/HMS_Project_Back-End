package com.codegnan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codegnan.entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer>{

}
