package step_definitions;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Feedback;


public class StepDefinitions {
	
	Feedback feedback;
	@Given("^User open the website$")
	public void user_open_the_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		feedback = new Feedback();
	    
	}

	@When("^User fills the form and click on submit button$")
	public void user_fills_the_form_and_click_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		feedback.fillFeedback();
	}

	@Then("^User should get proper feedback thank you message$")
	public void user_should_get_proper_feedback_thank_you_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    feedback.waitForSuccessMessage();
	    Assert.assertEquals(feedback.getSuccessAlertMessage(),"Thanks Deepanshu, we appreciate your feedback.");
	}


}
