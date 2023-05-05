package starter.api;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetUserInfo {
    protected static String url = "https://altashop-api.fly.dev/api/auth/";
    private static final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoicmluaUBtYWlsLmNvbSJ9.aVwOOZtxN3obXscWfnNgr8ZQ5-aCgJqRIHhZ69ucah8";
    @Step("I set user endpoint")
    public String setUserEndpoints(){
        return url + "info";
    }
    @Step("I send login GET HTTP request with user bearer token")
    public void sendLogPostHTTPrequest(){
        SerenityRest.given().auth().oauth2(token).when().get(setUserEndpoints());
    }
    @Step("I successfully get user information with status code 200")
    public void response(){
        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.body("'data'.'Email'", equalTo("rini@mail.com")));
    }

    @Step("I set user endpoints")
    public String setUserEndpoints2(){
        return url + "information";
    }
    @Step("I send login POST HTTP request with user bearer token")
    public void sendLogPostHTTPrequest2(){
        SerenityRest.given().auth().oauth2(token).when().get(setUserEndpoints2());
    }
    @Step("I failed get user information with status code 404")
    public void response2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
