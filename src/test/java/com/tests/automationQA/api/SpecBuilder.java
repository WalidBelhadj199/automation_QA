package com.tests.automationQA.api;

import com.tests.automationQA.utils.ConfigLoader;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder {
	public static RequestSpecification getRequestSpec() {
		return new RequestSpecBuilder().setBaseUri(ConfigLoader.getInstance().getBaseUrl()).log(LogDetail.ALL).build();
	}

	public static ResponseSpecification getResponseSpec() {
		return new ResponseSpecBuilder().log(LogDetail.ALL).build();
	}
}
