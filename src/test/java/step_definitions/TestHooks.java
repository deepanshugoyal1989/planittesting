package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.BasePage;

public class TestHooks extends BasePage{
	
	
	
	@Before
	public void openBrowser() {
	
		new BasePage().initialize();
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}

}
