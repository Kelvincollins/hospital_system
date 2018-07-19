package com.collinsk.hospital_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.collinsk.hospital_system.model.PatientModel;
import com.collinsk.hospital_system.service.PatientService;

@RestController
@RequestMapping(value="/home")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
   public ModelAndView list() {
		ModelAndView model= new ModelAndView("patient_list");
		List<PatientModel> patientList = patientService.getAllPatients();
		model.addObject("patientList", patientList);
		return model;
	}
	
	
	
	@RequestMapping(value="/addPatient/", method=RequestMethod.GET)
	public ModelAndView addPatient() {
		ModelAndView model = new ModelAndView();
		
	  PatientModel patientModel= new PatientModel();
	  model.addObject("patientForm", patientModel);
	  model.setViewName("patient_form");
		
		return model;
	}
	
	
	@RequestMapping(value="/updatePatient/{id_number}", method=RequestMethod.GET)
	public ModelAndView editPatient(@PathVariable("id_number") long id) {
		
		ModelAndView model =new ModelAndView();
		
		PatientModel patientModel= patientService.getPatientById(id);
		model.addObject("patientForm", patientModel);
		model.setViewName("patient_form");
		
		return model;
		
		
		
	}
	@RequestMapping(value="/viewPatient/{id_number}", method=RequestMethod.GET)
	public ModelAndView viewPatient(@PathVariable("id_number") long id) {
		
		ModelAndView model =new ModelAndView();
		PatientModel personDetails =  patientService.getPatientById(id);
		model.addObject("personDetails", personDetails);
		model.setViewName("person_details");
		
		return model;	
		
	}
	
	@RequestMapping(value="/savePatient", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("patientForm") PatientModel patientModel) {
		patientService.saveOrUpdate(patientModel);
		
		return new ModelAndView("redirect:/home/list");
		
		
	}
	
	@RequestMapping(value="/deletePatient/{id}", method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") long id) {
		
		patientService.deletePatient(id);
		
		return new ModelAndView("redirect:/home/list");
		
		
	}
	
	
	
	
}
