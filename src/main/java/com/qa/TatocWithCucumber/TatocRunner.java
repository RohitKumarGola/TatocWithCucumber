package com.qa.TatocWithCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/home/qainfotech/eclipse-workspace/TatocWithCucumber/Feature/a.feature",
       glue = {"/home/qainfotech/eclipse-workspace/TatocWithCucumber/src/main/java/com/qa/TatocWithCucumber/Steps.java"},
	   tags = "@tags"	     
		)
public class TatocRunner {
	

}
