package com.klef.dev.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student {
	@Id
	@Column(name = "student_id")
	private int id;
	@Column(name = "student_name", nullable = false, length = 50)
	private String name;
	@Column(name = "student_gender", nullable = false, length = 10)
	private String gender; //FEMALE or MALE
	@Column(name = "student_department", nullable = false, length = 20)
	private String department;
	@Column(name = "student_program", nullable = false, length = 10)
	private String program; //B.Tech or M.Tech or BCA or MCA
	@Column(name = "student_year", nullable = false)
	private String year; // 1 or 2 or 3
	@Column(name = "student_semester", nullable = false, length = 10)
	private String semester; // ODD or EVEN
	@Column(name = "student_email", nullable = false, unique = true, length = 20)
	private String email;
	@Column(name = "student_password", nullable = false, length = 50)
	private String password;
	@Column(name = "student_contact", nullable = false, unique = true, length = 20)
	private String contact;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department
				+ ", program=" + program + ", year=" + year + ", semester=" + semester + ", email=" + email
				+ ", password=" + password + ", contact=" + contact + "]";
	}
}
