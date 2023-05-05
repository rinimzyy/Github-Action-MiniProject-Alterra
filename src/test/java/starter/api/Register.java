package starter.api;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {
    protected static String url = "https://altashop-api.fly.dev/api/auth/register";
//    @Step("I set register endpoint")
//    public String setGetEndpoints(){
//        return url;
//    }
//    @Step("I send POST HTTP request and fill body parameter")
//    public void getHTTPrequest(){
//        JSONObject body = new JSONObject();
//        body.put("email","hm@gmail.com");
//        body.put("password","Apaaja");
//        body.put("fullname","Siapa Aja");
//
//        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setGetEndpoints());
//    }
//    @Step("I successfully register with status code 200")
//    public void response(){
//        restAssuredThat(response -> response.statusCode(200));
//    }

    @Step("I set register endpoint url")
    public String setGetEndpoint2(){
        return url;
    }
    @Step("I send POST HTTP request with empty body")
    public void getHTTPrequest2(){
        JSONObject body = new JSONObject();

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setGetEndpoint2());
    }
    @Step("I failed register with status code 400")
    public void response2(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I set url register endpoint")
    public String setGetEndpoint3(){
        return url;
    }
    @Step("I send POST HTTP request with registered email")
    public void getHTTPrequest3(){
        JSONObject body = new JSONObject();
        body.put("email","hm@gmail.com");
        body.put("password","Apaaja");
        body.put("fullname","Siapa Aja");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setGetEndpoint3());
    }
    @Step("I fail register with status code 400")
    public void response3(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I set url register endpoint")
    public String setGetEndpoint4(){
        return url;
    }
    @Step("I send POST HTTP request with registered email")
    public void getHTTPrequest4(){
        JSONObject body = new JSONObject();
        body.put("ema","hmm@gmail.com");
        body.put("passwo","Apaaja");
        body.put("fulln","Siapa Aja");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setGetEndpoint4());
    }
    @Step("I fail register with status code 400")
    public void response4(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I set the url register endpoints")
    public String setGetEndpoint5(){
        return url;
    }
    @Step("I send POST HTTP request with null parameter value")
    public void getHTTPrequest5(){
        JSONObject body = new JSONObject();
        body.put("email","");
        body.put("password","");
        body.put("fullname","");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(setGetEndpoint5());
    }
    @Step("I failed to register with status code 400")
    public void response5(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I set valid url register endpoints")
    public String setGetEndpoint6(){
        return url;
    }
    @Step("I send PUT HTTP request with valid body")
    public void getHTTPrequest6(){
        JSONObject body = new JSONObject();
        body.put("email","al@gmail.com");
        body.put("password","apaaja");
        body.put("fullname","Siapa Aja");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).put(setGetEndpoint6());
    }
    @Step("I failed to register with status code 405")
    public void response6(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
