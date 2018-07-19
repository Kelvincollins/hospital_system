package com.collinsk.hospital_system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "info")
public class PatientModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "id_number")
	private String id_number;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "second_name")
	private String second_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "tel")
	private String tel;

	// spouse details
	@Column(name = "id_number_spouse")
	private String id_number_spouse;
	@Column(name = "first_name_spouse")
	private String first_name_spouse;
	@Column(name = "last_name_spouse")
	private String last_name_spouse;
	@Column(name = "tel_spouse")
	private String tel_spouse;

// children
	@Column(name = "first_name_child1")
	private String first_name_child1;
	@Column(name = "last_name_child1")
	private String last_name_child1;

	@Column(name = "first_name_child2")
	private String first_name_child2;
	@Column(name = "last_name_child2")
	private String last_name_child2;

	@Column(name = "first_name_child3")
	private String first_name_child3;
	@Column(name = "last_name_child3")
	private String last_name_child3;

	@Column(name = "first_name_child4")
	private String first_name_child4;
	@Column(name = "last_name_child4")
	private String last_name_child4;

	@Column(name = "first_name_child5")
	private String first_name_child5;
	@Column(name = "last_name_child5")
	private String last_name_child5;

	@Column(name = "date_created")
	private String date_created;

	// getter and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getId_number() {
		return id_number;
	}

	public void setId_number(String id_number) {
		this.id_number = id_number;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getId_number_spouse() {
		return id_number_spouse;
	}

	public void setId_number_spouse(String id_number_spouse) {
		this.id_number_spouse = id_number_spouse;
	}

	public String getFirst_name_spouse() {
		return first_name_spouse;
	}

	public void setFirst_name_spouse(String first_name_spouse) {
		this.first_name_spouse = first_name_spouse;
	}

	public String getLast_name_spouse() {
		return last_name_spouse;
	}

	public void setLast_name_spouse(String last_name_spouse) {
		this.last_name_spouse = last_name_spouse;
	}

	public String getTel_spouse() {
		return tel_spouse;
	}

	public void setTel_spouse(String tel_spouse) {
		this.tel_spouse = tel_spouse;
	}

	public String getFirst_name_child1() {
		return first_name_child1;
	}

	public void setFirst_name_child1(String first_name_child1) {
		this.first_name_child1 = first_name_child1;
	}

	public String getLast_name_child1() {
		return last_name_child1;
	}

	public void setLast_name_child1(String last_name_child1) {
		this.last_name_child1 = last_name_child1;
	}

	public String getFirst_name_child2() {
		return first_name_child2;
	}

	public void setFirst_name_child2(String first_name_child2) {
		this.first_name_child2 = first_name_child2;
	}

	public String getLast_name_child2() {
		return last_name_child2;
	}

	public void setLast_name_child2(String last_name_child2) {
		this.last_name_child2 = last_name_child2;
	}

	public String getFirst_name_child3() {
		return first_name_child3;
	}

	public void setFirst_name_child3(String first_name_child3) {
		this.first_name_child3 = first_name_child3;
	}

	public String getLast_name_child3() {
		return last_name_child3;
	}

	public void setLast_name_child3(String last_name_child3) {
		this.last_name_child3 = last_name_child3;
	}

	public String getFirst_name_child4() {
		return first_name_child4;
	}

	public void setFirst_name_child4(String first_name_child4) {
		this.first_name_child4 = first_name_child4;
	}

	public String getLast_name_child4() {
		return last_name_child4;
	}

	public void setLast_name_child4(String last_name_child4) {
		this.last_name_child4 = last_name_child4;
	}

	public String getFirst_name_child5() {
		return first_name_child5;
	}

	public void setFirst_name_child5(String first_name_child5) {
		this.first_name_child5 = first_name_child5;
	}

	public String getLast_name_child5() {
		return last_name_child5;
	}

	public void setLast_name_child5(String last_name_child5) {
		this.last_name_child5 = last_name_child5;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

}
