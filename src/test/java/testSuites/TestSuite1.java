package testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.SeleniumTest;
import tests.WikiTest;

@RunWith(Suite.class)
@SuiteClasses({ SeleniumTest.class, WikiTest.class })
public class TestSuite1 {

}
