package com.devsuperior.bds04.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.devsuperior.bds04.dto.UserÏnsertDTO;
import com.devsuperior.bds04.repositories.UserRepository;
import com.devsuperior.bds04.resources.exceptions.FieldMessage;



public class UserInsertValidator implements ConstraintValidator<UserInsertValid, UserÏnsertDTO> {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public void initialize(UserInsertValid ann) {
	}
	
	@Override
	public boolean isValid(UserÏnsertDTO dto, ConstraintValidatorContext context) {
		
		List<FieldMessage> list = new ArrayList<>();

		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}