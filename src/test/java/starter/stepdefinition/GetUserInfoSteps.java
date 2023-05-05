package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.GetUserInfo;

public class GetUserInfoSteps {
    @Steps
    GetUserInfo info;

    @Given("I set user endpoint")
    public void setUserEndpoint() {
        info.setUserEndpoints();
    }

    @When("I send login GET HTTP request with user bearer token")
    public void sendHTTPReqWithUserToken() {
        info.sendLogPostHTTPrequest();
    }

    @Then("I successfully get user information with status code 200")
    public void getUserInfo() {
        info.response();
    }

    @Given("I set user endpoints")
    public void setUserEndpoints() {
        info.setUserEndpoints2();
    }

    @When("I send login POST HTTP request with user bearer token")
    public void sendPostHTTPReqWithUserToken() {
        info.sendLogPostHTTPrequest2();
    }

    @Then("I failed get user information with status code 404")
    public void getUserInfoFailed() {
        info.response2();
    }
}