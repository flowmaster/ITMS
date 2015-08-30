package com.flowmaster.util;

import org.springframework.validation.Errors;

import com.flowmaster.model.SkillSet;

public class CheckBoxValidator {
	public boolean supports(Class clazz) {
		return SkillSet.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {

		SkillSet cust = (SkillSet) target;

		if (cust.getSkills().length == 0) {
			errors.rejectValue("skills", "Please select at least a skill!");
		}
	}

}
