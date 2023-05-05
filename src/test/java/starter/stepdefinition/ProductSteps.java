package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import starter.api.Product;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ProductSteps {
    @Steps
    Product product;

    @Given("I set product endpoint")
    public void setProdEndpoint() {
        product.setProductEndpoints();
    }

    @When("I send GET HTTP request")
    public void sendHTTPReq() {
        product.sendHTTPrequest();
    }

    @Then("I successfully get all product data with status code 200")
    public void getAllProduct() {
        product.response();
    }

    @Given("I set product endpoints")
    public void setProdEndpoints() {
        product.setProductEndpoints2();
    }

    @When("I send GET HTTP request with invalid endpoint")
    public void sendHTTPRequest() {
        product.sendHTTPrequest2();
    }

    @Then("I fail get all product data with status code 404")
    public void getAllProductFail() {
        product.response2();
    }

    @Given("I set product endpoints url")
    public void setProdEndpointsUrl() {
        product.setProductEndpoints3();
    }

    @When("I send GET HTTP request with wrong method")
    public void sendHTTPRequestWrongMethod() {
        product.sendHTTPrequest3();
    }

    @Then("I fail get all product data with status code 405")
    public void getAllProductFail405() {
        product.response3();
    }

    @Given("I set product id endpoint")
    public void setProdIdEndpointsUrl() {
        product.setProductEndpoints4();
    }

    @When("I send GET HTTP request with valid endpoint")
    public void sendHTTPRequestValidEnd() {
        product.sendHTTPrequest4();
    }

    @Then("I success get product data by id with status code 200")
    public void getProdByIdSuccess() {
        product.response4();
    }

    @Given("I set product id endpoints")
    public void setProdIdEndpoints() {
        product.setProductEndpoints5();
    }

    @When("I send GET HTTP request with invalid id")
    public void sendHTTPRequestInvalidId() {
        product.sendHTTPrequest5();
    }

    @Then("I failed get product data by id with status code 404")
    public void getProdByIdFail() {
        product.response5();
    }

    @Given("I set product id endpoints url")
    public void setProdIdEndpointUrl() {
        product.setProductEndpoints6();
    }

    @When("I send GET HTTP request with invalid endpoints url")
    public void sendHTTPRequestInvalidEndp() {
        product.sendHTTPrequest6();
    }

    @Then("I failed to get product data by id with status code 404")
    public void getProdByIdFailed() {
        product.response6();
    }

    @Given("I set product rating endpoints url")
    public void setProdRatingEndpointUrl() {
        product.setProductEndpoints7();
    }

    @When("I send GET HTTP request with valid rating endpoint")
    public void sendHTTPRequestValidRating() {
        product.sendHTTPrequest7();
    }

    @Then("I success to get product rating by id with status code 200")
    public void getProdRatingSuccess() {
        product.response7();
    }

    @Given("I set product rating endpoint url")
    public void setProdRatingEndpointsUrl() {
        product.setProductEndpoints8();
    }

    @When("I send GET HTTP request with invalid rating endpoint")
    public void sendHTTPRequestInvalidRating() {
        product.sendHTTPrequest8();
    }

    @Then("I failed to get product rating by id with status code 404")
    public void getProdRatingFail() {
        product.response8();
    }

    @Given("I set product comment endpoint url")
    public void setProdCommentEndpointsUrl() {
        product.setProductEndpoints9();
    }

    @When("I send GET HTTP request with valid comment endpoint")
    public void sendHTTPRequestValidComment() {
        product.sendHTTPrequest9();
    }

    @Then("I success to get product comment by id with status code 200")
    public void getProdCommentSuccess() {
        product.response9();
    }

    @Given("I set product comment endpoint")
    public void setProdCommentEndpoints() {
        product.setProductEndpoints10();
    }

    @When("I send GET HTTP request with invalid comment endpoint")
    public void sendHTTPRequestInalidComment() {
        product.sendHTTPrequest10();
    }

    @Then("I failed to get product comment by id with status code 404")
    public void getProdCommentFailed() {
        product.response10();
    }

    // Add new products
    @Given("I POST add new products endpoints")
    public void postAddNewProductsEndpoints() {
        product.postAddNewProductsEndpoints();
    }
    @When("I POST HTTP request for add new products")
    public void postHTTPRequestForAddNewProducts() {
        product.postHTTPRequestForAddNewProducts();
    }
    @Then("I receive valid HTTP response 200 for add new products")
    public void receiveResponseCode200ForAddNewProducts() {
        product.receiveResponseCode200ForAddNewProducts();
    }

    // Failed create a new product because parameter value is empty
    @Given("I POST add new products endpoint")
    public void postAddNewProductsEndpoint() {
        product.postAddNewProductsEndpoint();
    }
    @When("I POST HTTP request for add new product")
    public void postHTTPRequestForAddNewProduct() {
        product.postHTTPRequestForAddNewProduct();
    }
    @Then("I receive HTTP response 500 for add new products")
    public void receiveResponseCode500ForAddNewProducts() {
        product.receiveResponseCode500ForAddNewProducts();
    }

    // Failed create a new product because parameter is invalid
    @Given("I POST add new products endpoint url")
    public void postAddNewProductEndpoint() {
        product.postAddNewProductEndpoint();
    }
    @When("I POST HTTP request for add new product with invalid parameter")
    public void postRequestForAddNewProduct() {
        product.postRequestForAddNewProduct();
    }
    @Then("I receive response 500 for add new products")
    public void responseCode500ForAddNewProducts() {
        product.responseCode500ForAddNewProducts();
    }

    // Failed create a new product because parameter "name" is not setted
    @Given("I POST add new products endpoints url")
    public void postNewProductEndpoint() {
        product.postNewProductEndpoint();
    }
    @When("I POST HTTP request for add new product with name field is not setted")
    public void requestForAddNewProduct() {
        product.requestForAddNewProduct();
    }
    @Then("I receive response 500 for add new product")
    public void response500ForAddNewProducts() {
        product.response500ForAddNewProducts();
    }

    // Failed create a new product because parameter space
    @Given("I POST new products endpoints url")
    public void postAddProductEndpoint() {
        product.postAddProductEndpoint();
    }
    @When("I POST HTTP request for add new product and parameter is filled with space")
    public void requestAddNewProduct() {
        product.requestAddNewProduct();
    }
    @Then("I receive response code 400 for add new product")
    public void response400ForAddProducts() {
        product.response400ForAddProducts();
    }

    // Assign Rating
    @Given("I POST give products rating endpoints")
    public void postGiveProductsRatingEndpoints() {
        product.postGiveProductsRatingEndpoints();
    }
    @When("I POST HTTP request for give products ratings")
    public void postHTTPRequestForGiveProductsRatings() {
        product.postHTTPRequestForGiveProductsRatings();
    }
    @Then("I receive valid HTTP response 200 for give products ratings")
    public void receiveValidHTTPResponse200ForGiveProductsRatings() {
        product.receiveValidHTTPResponse200ForGiveProductsRatings();
    }

    // Assign Rating
    @Given("I POST give products rating endpoint")
    public void postGiveProductsRatingEndpoint() {
        product.postGiveProductsRatingEndpoint();
    }
    @When("I POST HTTP request for give products ratings with invalid id")
    public void postHTTPRequestForGiveProductsRating() {
        product.postHTTPRequestForGiveProductsRating();
    }
    @Then("I receive valid HTTP response 500 for give products ratings")
    public void receiveValidHTTPResponse500ForGiveProductsRatings() {
        product.receiveValidHTTPResponse500ForGiveProductsRatings();
    }

    @Given("I set add product comment endpoint")
    public void setCreateCommentEnd() {
        product.setCommentEndpoints();
    }

    @When("I send POST HTTP request with comment in body")
    public void sendHTTPRequestCreateComment() {
        product.sendHTTPrequestComment();
    }

    @Then("I success create a comment in product with status code 200")
    public void createCommentSuccess() {
        product.responseComment();
    }

    @Given("I set add product comment wrong endpoint")
    public void setWrongEndComment() {
        product.setCommentEndpoints2();
    }

    @When("I send POST HTTP request with invalid endpoint")
    public void sendHTTPRequestComInvEnd() {
        product.sendHTTPrequestComment2();
    }

    @Then("I failed create a comment in product with status code 404")
    public void createCommentFail() {
        product.responseComment2();
    }

    @Given("I set add product comment wrong endpoints")
    public void setWrongEndsComment() {
        product.setCommentEndpoints3();
    }

    @When("I send POST HTTP request with empty body content")
    public void sendHTTPRequestComEmptyBody() {
        product.sendHTTPrequestComment3();
    }

    @Then("I failed create a comment in product with status code 500")
    public void createCommentFailed() {
        product.responseComment3();
    }

    @Given("I set add product comment wrong endpoints url")
    public void setWrongEndsCommentUrl() {
        product.setCommentEndpoints4();
    }

    @When("I send POST HTTP request with invalid parameter comment")
    public void sendHTTPRequestComInvParam() {
        product.sendHTTPrequestComment4();
    }

    @Then("I failed create a comment in product with response code 500")
    public void createCommentfail() {
        product.responseComment4();
    }

    @Given("I set add product comments wrong endpoints url")
    public void setWrongEndsCommentsUrl() {
        product.setCommentEndpoints5();
    }

    @When("I send PUT HTTP request with invalid parameter comment")
    public void sendHTTPRequestComWrongMethod() {
        product.sendHTTPrequestComment5();
    }

    @Then("I failed create a comment in product with response code 405")
    public void createCommentsfail() {
        product.responseComment5();
    }

    @Given("I set delete product endpoints url")
    public void setWrongEndsDeletesUrl() {
        product.setDeleteEndpoint();
    }

    @When("I send DELETE HTTP request with valid endpoint")
    public void sendHTTPRequestDel() {
        product.sendHTTPrequestDelete();
    }

    @Then("I success delete product with response code 200")
    public void delSuccess() {
        product.responseDelete();
    }

    @Given("I set delete product endpoint url")
    public void setWrongEndsDeleteUrl() {
        product.setDeleteEndpoint2();
    }

    @When("I send DELETE HTTP request with invalid endpoint")
    public void sendHTTPRequestDelInvEnd() {
        product.sendHTTPrequestDelete2();
    }

    @Then("I fail delete product with response code 404")
    public void delFail() {
        product.responseDelete2();
    }
}
