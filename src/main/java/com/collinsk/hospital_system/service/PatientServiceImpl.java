package com.collinsk.hospital_system.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collinsk.hospital_system.model.PatientModel;
import com.collinsk.hospital_system.repository.PatientRepository;

@Service
@Transactional
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public List<PatientModel> getAllPatients() {
		// TODO Auto-generated method stub
		return (List<PatientModel>) patientRepository.findAll();
		
	}

	@Override
	public PatientModel getPatientById(long id) {
		// TODO Auto-generated method stub
		return  patientRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(PatientModel patientModel) {
		// TODO Auto-generated method stub
		patientRepository.save(patientModel);
	}

	@Override
	public void deletePatient(long id) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(id);
	}

}
