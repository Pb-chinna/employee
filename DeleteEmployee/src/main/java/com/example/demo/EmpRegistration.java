package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="empreg")
public class EmpRegistration {
@Id
	/* @GeneratedValue(strategy = GenerationType.IDENTITY) */
@Column(name="empid")
private long empid;
public long getEmpid() {
	return empid;
}
public void setEmpid(long empid) {
	this.empid = empid;
}
@Column(name="firstname")
private String firstname;
@Column(name="lastname")
private String lastname;
@Column(name="password")
private String password;
@Column(name="confirmpassword")
private String confirmpassword;
@Column(name="address")
private String address;
@Column(name="email")
private String email;
@Column(name="gender")
private String gender;
@Column(name="phonenumber")
private long phonenumber;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}


public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
@Override
public String toString() {
	return "EmpRegistration [empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + ", password="
			+ password + ", confirmpassword=" + confirmpassword + ", address=" + address + ", email=" + email
			+ ", gender=" + gender + ", number=" + phonenumber + "]";
}




}
