package com.tests.automationQA.customtypes;

import com.tests.automationQA.constants.Language;

import io.cucumber.java.ParameterType;

public class CustomParameterType {

	@ParameterType(".*")
	public Language language(String languageName) {
		return Language.valueOf(languageName);
	}
}
