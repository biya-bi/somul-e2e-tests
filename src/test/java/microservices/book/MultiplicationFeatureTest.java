/**
 * 
 */
package microservices.book;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author biya-bi
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber",
		"junit:target/junit-report.xml" }, features = "src/test/resources/multiplication.feature")
public class MultiplicationFeatureTest {

}
