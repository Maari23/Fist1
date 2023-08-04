package Runner;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Maari\\eclipse-workspace\\C_end\\Feature/FLog.feature"
,glue= {"Sd"},monochrome=true,dryRun=false,
plugin= {"pretty","json:target/cucumber1.json","html:target/cucumber-html-report1.html"}
,tags="@Smoke and @Regression")

public class TestRun {

}
