package com.example.churrasco.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String nameResource;
	private String nameCamp;
	private Long valueCamp;

	public ResourceNotFoundException(String nameResource, String nameCamp, Long valueCamp) {
		super(String.format("%s Not Founded : %s : '%s'", nameResource, nameCamp, valueCamp));
		this.nameResource = nameResource;
		this.nameCamp = nameCamp;
		this.valueCamp = valueCamp;
	}

	public String getNameResource() {
		return nameResource;
	}

	public void setNameResource(String nameResource) {
		this.nameResource = nameResource;
	}

	public String getNameCamp() {
		return nameCamp;
	}

	public void setNameCamp(String nameCamp) {
		this.nameCamp = nameCamp;
	}

	public Long getValueCamp() {
		return valueCamp;
	}

	public void setValueCamp(Long valueCamp) {
		this.valueCamp = valueCamp;
	}

}
