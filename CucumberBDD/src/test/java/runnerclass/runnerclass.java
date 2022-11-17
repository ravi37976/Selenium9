package runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"C:\\Users\\HP\\eclipse-workspace\\CucumberBDD\\src\\test\\java\\featurefile\\login.feature"},
glue= {"stepDefination"},dryRun=false,monochrome=true,
plugin= {"pretty","html:repoter\\cucumberrepoter.html"})

public class runnerclass extends AbstractTestNGCucumberTests
{
	
}





