package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.Register;

public class RegisterSteps {
    @Steps
    Register reg;

    @Given("I set register endpoint")
    public void getSetEndpoint() {
        reg.setGetEndpoints();
    }
    @When("I send POST HTTP request and fill body parameter")
    public void sendPostRegHTTPReq() {
        reg.getHTTPrequest();
    }
    @Then("I successfully register with status code 200")
    public void RegSuccess200() {
        reg.response();
    }

    @Given("I set register endpoint url")
    public void getRegEndpoint() {
        reg.setGetEndpoint2();
    }
    @When("I send POST HTTP request with empty body")
    public void sendPostHTTPReq() {
        reg.getHTTPrequest2();
    }
    @Then("I failed register with status code 400")
    public void failReg400() {
        reg.response2();
    }

    @Given("I set url register endpoint")
    public void getSetUrlEndpoint() {
        reg.setGetEndpoint3();
    }
    @When("I send POST HTTP request with registered email")
    public void sendPostRegHTTPReqs() {
        reg.getHTTPrequest3();
    }
    @Then("I fail register with status code 400")
    public void regFail400() {
        reg.response3();
    }

    @Given("I set url register endpoints")
    public void getSetUrlEndpoints() {
        reg.setGetEndpoint4();
    }
    @When("I send POST HTTP request with invalid parameter")
    public void sendPostRegHTTPReqInvParam() {
        reg.getHTTPrequest4();
    }
    @Then("I fail to register with status code 400")
    public void failToReg400() {
        reg.response4();
    }

    @Given("I set the url register endpoints")
    public void getSetTheUrlEndpoints() {
        reg.setGetEndpoint5();
    }
    @When("I send POST HTTP request with null parameter value")
    public void sendPostRegHTTPReqNullValueParam() {
        reg.getHTTPrequest5();
    }
    @Then("I failed to register with status code 400")
    public void failedToReg400() {
        reg.response5();
    }

    @Given("I set valid url register endpoints")
    public void getSetValidUrlEndpoints() {
        reg.setGetEndpoint6();
    }
    @When("I send PUT HTTP request with valid body")
    public void sendPutRegHTTPReq() {
        reg.getHTTPrequest6();
    }
    @Then("I failed to register with status code 405")
    public void failedToReg405() {
        reg.response6();
    }
}
