package com.runner;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/feature"},glue= "com.stepdef",tags="@adactin", plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class RunnerClass {

}

