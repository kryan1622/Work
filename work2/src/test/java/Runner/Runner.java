package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Admin\\Desktop\\Work\\work2\\src\\test\\java\\TeaTesting.feature",glue= {"Runner"})

public class Runner {

}
