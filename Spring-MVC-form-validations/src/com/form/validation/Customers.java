package com.form.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customers {
	
	@NotNull(message="first Name is a required field")
	@Size(min=1, message="first Name is required")
	//@Min(value=0, message="must be greater than zoro")
	//@Max(value=10, message="must be smaller than 10 charecters")
	private String firstName;
	
	@NotNull(message="first Name is a required field")
	@Size(min=1, message="first Name is required")
	//@Min(value=0, message="must be greater than zoro")
	///@Max(value=10, message="must be smaller than 10 charecters")
	private String lastName;
	
	
	///@Pattern(regexp="^[a-zA-Z0-9]{5}", message="freePass must be 5 degit")
	@NotNull(message="free pass is a reqiurd field")
	private Integer freePass;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePass() {
		return freePass;
	}

	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}
	
	
	
	

}
