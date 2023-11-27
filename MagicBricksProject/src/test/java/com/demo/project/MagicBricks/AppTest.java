package com.demo.project.MagicBricks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/feature", glue= {"Steps"})//plugin = {"html:target/report.html"}
public class AppTest extends AbstractTestNGCucumberTests
{
    
}
