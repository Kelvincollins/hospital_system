package com.collinsk.hospital_system.service;

import java.util.List;

import com.collinsk.hospital_system.model.PatientModel;



public interface PatientService {
	 public List<PatientModel> getAllPatients();
	 
	 public  PatientModel getPatientById(long id);
	 
	 public void saveOrUpdate(PatientModel patientModel);
	 
	 public void deletePatient(long id);
	 
	 
}
