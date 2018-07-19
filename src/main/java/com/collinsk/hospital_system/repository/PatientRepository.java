package com.collinsk.hospital_system.repository;


import org.springframework.data.repository.CrudRepository;

import com.collinsk.hospital_system.model.PatientModel;

public interface PatientRepository extends CrudRepository<PatientModel, Long >{

}
