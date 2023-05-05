package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.ProductCategory;

public class ProductCategorySteps {
    @Steps
    ProductCategory product;

    //Scenario: TC01 - Create a product categories
    @Given("I POST create product categories endpoints")
    public void postProductCategories() {
        product.postProductCategories();
    }
    @When("I POST HTTP request with valid data")
    public void postHTTPRequestProductCategories() {
        product.postHTTPRequestProductCategories();
    }
    @And("I receive response data for product categories")
    public void receiveResponseProductCategories() {
        product.receiveResponseProductCategories();
    }
    @Then("I receive valid HTTP response 200")
    public void receiveResponseCode200ProductCategories() {
        product.receiveResponseCode200ProductCategories();
    }

//    Failed create new category because endpoint is invalid
    @Given("I POST create product categories endpoint")
    public void postProductCategoriesEnd() {
        product.postProductCategoriesEnd();
    }
    @When("I POST HTTP request with invalid endpoint and valid data")
    public void postHTTPProdCatInvEnd() {
        product.postHTTPRequestProdCatInvEnd();
    }
    @Then("I receive response code 404")
    public void receiveResponseCode404ProductCategories() {
        product.receiveResponseCode404ProductCategories();
    }

    // Failed create new category because body is empty
    @Given("I POST create product categories endpoint url")
    public void postProductCategory() {
        product.postProductCategory();
    }
    @When("I POST HTTP request with empty body")
    public void postHTTPRequestProductCategory() {
        product.postHTTPRequestProductCategory();
    }
    @Then("I receive response code 500")
    public void receiveResponseCode500ProductCategory() {
        product.receiveResponseCode500ProductCategory();
    }

    // Failed create new category because parameter is invalid
    @Given("I POST create product categories endpoints url")
    public void postProdCategory() {
        product.postProdCategory();
    }
    @When("I POST HTTP request with invalid parameter body")
    public void postHTTPRequestProdCategory() {
        product.postHTTPRequestProdCategory();
    }
    @Then("I receive status code 500")
    public void receiveStatCode500ProductCategory() {
        product.receiveStatCode500ProductCategory();
    }

    //Get all product categories
    @Given("I GET all product categories endpoint")
    public void getAllProductCategories() {
        product.getAllProductCategories();
    }
    @When("I GET HTTP request with valid endpoint")
    public void getHTTPRequestAllProductCategories() {
        product.getHTTPRequestAllProductCategories();
    }
    @And("I receive response data for all product categories")
    public void receiveResponseGetAllProductCategories() {
        product.receiveResponseGetAllProductCategories();
    }

    @Then("I receive valid HTTP response 200 for get all product categories")
    public void receiveResponseCode200GetAllProductCategories() {
        product.receiveResponseCode200DeleteProductCategory();
    }

    // Failed get all category with invalid endpoint
    @Given("I GET all product categories endpoints")
    public void getAllProductCategory() {
        product.getAllProductCategory();
    }
    @When("I GET HTTP request with invalid endpoint")
    public void getHTTPRequestAllProductCategory() {
        product.getHTTPRequestAllProductCategory();
    }
    @Then("I receive HTTP response 404 for get all product categories")
    public void receiveResponseCode200GetAllProductCategory() {
        product.receiveResponseCode404GetAllProductCategory();
    }

    // Failed all category because method is invalid
    @Given("I GET all product categories endpoint url")
    public void getAllProductCategorys() {
        product.getAllProductCat();
    }
    @When("I GET HTTP request with invalid method")
    public void getHTTPRequestAllProductCategoryWrMeth() {
        product.getHTTPRequestAllProductCat();
    }
    @Then("I receive HTTP response 405 for get all product categories")
    public void receiveResponseCode405GetAllProductCategory() {
        product.receiveResponseCode405GetAllProductCategory();
    }

    // Get product category by ID
    @Given("I GET product category endpoints by ID")
    public void getProductCategoryByID() {
        product.getProductCategoryByID();
    }
    @When("I GET HTTP request with valid ID")
    public void getHTTPRequestProductCategoryByID() {
        product.getHTTPRequestProductCategoryByID();
    }
    @And("I receive response data for product category by ID")
    public void receiveResponseProductCategoryByID() {
        product.receiveResponseProductCategoryByID();
    }
    @Then("I receive valid HTTP response 200 for get by ID")
    public void receiveResponseCode200ProductCategoryByID() {
        product.receiveResponseCode200ProductCategoryByID();
    }

    // Failed get category by id because id is invalid
    @Given("I GET product category endpoint by ID")
    public void getProductCategoriesByID() {
        product.getProductCategoriesByID();
    }
    @When("I GET HTTP request with invalid ID")
    public void getHTTPRequestProductCategoriesByID() {
        product.getHTTPRequestProductCategoriesByID();
    }
    @Then("I receive valid HTTP response 400 for get by ID")
    public void receiveResponseCode400ProductCategoriesByID() {
        product.receiveResponseCode400ProductCategoriesByID();
    }

    // Failed get category by id because method invalid
    @Given("I GET product category endpoints url by ID")
    public void getProductCatByID() {
        product.getProductCatByID();
    }
    @When("I GET Product by ID HTTP request with invalid method")
    public void getHTTPRequestProductCatByID() {
        product.getHTTPRequestProductCatByID();
    }
    @Then("I receive valid HTTP response 405 for get by ID")
    public void receiveResponseCode405ProductCatByID() {
        product.receiveResponseCode405ProductCatByID();
    }

    // Delete a product category
    @Given("I DELETE a product category endpoints")
    public void deleteProductCategory() {
        product.deleteProductCategory();
    }
    @When("I DELETE HTTP request with valid ID")
    public void deleteHTTPRequestAProductCategory() {
        product.deleteHTTPRequestAProductCategory();
    }
    @And("I receive response data for delete a product category")
    public void receiveResponseDeleteProductCategory() {
        product.receiveResponseDeleteProductCategory();
    }
    @Then("I receive valid HTTP response 200 for delete a product category")
    public void receiveResponseCode200DeleteProductCategory() {
        product.receiveResponseCode200DeleteProductCategory();
    }

    // Failed delete product because endpoint is invalid
    @Given("I DELETE a product category endpoint")
    public void deleteProductCat() {
        product.deleteProductCat();
    }
    @When("I DELETE HTTP request with invalid endpoints")
    public void deleteHTTPRequestAProductCat() {
        product.deleteHTTPRequestAProductCat();
    }
    @Then("I receive valid HTTP response 404 for delete a product category")
    public void receiveResponseCode404DeleteProductCat() {
        product.receiveResponseCode404DeleteProductCat();
    }
}
