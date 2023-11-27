package Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.demo.project.MagicBricks.Setup;

import Pages.MBHomeLoanPF;
import Pages.MBLoginPF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeLoanStepsDef {

	WebDriver driver;
	MBLoginPF lpf;
	MBHomeLoanPF hl;

	@Given("User Is On Landing Page")
	public void user_is_on_landing_page() {
		Setup s = new Setup("chrome");
		driver = s.initDriver();
		driver.navigate().to("https://www.magicbricks.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		lpf = PageFactory.initElements(driver, MBLoginPF.class);
		hl = PageFactory.initElements(driver, MBHomeLoanPF.class);
	}
	@When("User Able To Go On Login Page")
	public void user_able_to_go_on_login_page() throws InterruptedException {
		lpf.toLoginPage();
	}
	@When("User Is Able To Enter Mobile No or Email ID")
	public void user_is_able_to_enter_mobile_no_or_email_id() {
		lpf.enterCredentials("magicsbricks456@gmail.com", "m@g!c12345");
	}
	@Then("User Is On Next Page")
	public void user_is_on_next_page() {
	    lpf.closePop();
	}
	
	@Given("User Is On Next Page1")
	public void user_is_on_next_page1() {
	    lpf.landPage();
	}
	@When("User is able to move to home loan page")
	public void user_is_able_to_move_to_home_loan_page() throws InterruptedException {
	    hl.homeLoanPage();
	}
	@When("User is able to be enter the salary")
	public void user_is_able_to_be_enter_the_salary() {
	    hl.checkEligibility();
	}
	@When("User is click the eligibility button")
	public void user_is_click_the_eligibility_button() {
	    
	}
	@Then("Check the status of the user")
	public void check_the_status_of_the_user() {
	    
	}

//	@Given("User Is On Next Page2")
//	public void user_is_on_next_page2() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("User is able to move to the loan against property page and eligible for the loan1")
//	public void user_is_able_to_move_to_the_loan_against_property_page_and_eligible_for_the_loan1() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("User is able to enter general details")
//	public void user_is_able_to_enter_general_details() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("User is able to enter profile details")
//	public void user_is_able_to_enter_profile_details() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("User is able to enter income details")
//	public void user_is_able_to_enter_income_details() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Check the user is able to eligible for the loan without co-applicant")
//	public void check_the_user_is_able_to_eligible_for_the_loan_without_co_applicant() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User Is On Next Page3")
//	public void user_is_on_next_page3() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("User is able to move to the loan against property page and eligible for the loan2")
//	public void user_is_able_to_move_to_the_loan_against_property_page_and_eligible_for_the_loan2() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("User is able to enter general details2")
//	public void user_is_able_to_enter_general_details2() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("User have to click yes for co-applicant")
//	public void user_have_to_click_yes_for_co_applicant() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("User is able to enter details of co-applicant")
//	public void user_is_able_to_enter_details_of_co_applicant() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("User is able to enter income of co-applicant")
//	public void user_is_able_to_enter_income_of_co_applicant() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Check the user is able to eligible for the loan with co-applicant")
//	public void check_the_user_is_able_to_eligible_for_the_loan_with_co_applicant() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User Is On Next Page4")
//	public void user_is_on_next_page4() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("User is able to move to the Home loan interest rate page")
//	public void user_is_able_to_move_to_the_home_loan_interest_rate_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("User is able to enter the details and click the calculate your EMI button")
//	public void user_is_able_to_enter_the_details_and_click_the_calculate_your_emi_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("User is able to get the repayment details")
//	public void user_is_able_to_get_the_repayment_details() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}




	


}
