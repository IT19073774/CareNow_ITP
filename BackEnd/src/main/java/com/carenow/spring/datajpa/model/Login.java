package com.carenow.spring.datajpa.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "logins")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LoginId")
	Integer LoginId;
	
	@Column(name = "email")
	String email;
	
	@Column(name = "Password")
	String Password;

	public Integer getLoginId() {
		return LoginId;
	}

	public void setLoginId(Integer loginId) {
		LoginId = loginId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String Email) {
		email = Email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
	
}
