package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class ParametersStepDefinitions {
    @Given("I am on the {string} page")
    public void iAmOnThePage(String page) {
    }

    @When("I enter {string} and password {string}")
    public void iEnterAndPassword(String username, String password) {
    }

    @And("I click login")
    public void i_Click_Login() {
    }

    @Then("I should be navigated to homepage")
    public void i_Should_Be_Navigated_To_Homepage() {
    }


    @And("I can call row {int} column {float} data")
    public void iCanCallRowColumnData(int arg0, float arg2) {
    }


    @When("I enter the following data")
    public void i_Enter_The_Following_Data(List<Map<String,String>> dataTable) {
    
    }
}
