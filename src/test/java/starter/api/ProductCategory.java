package starter.api;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ProductCategory {
    protected static String url = "https://altashop-api.fly.dev/api/";
    //Scenario: TC01 - Create a product categories
    @Step("I POST create product categories endpoints")
    public String postProductCategories() {
        return url + "categories/";
    }
    @Step("I POST HTTP request with valid data")
    public void postHTTPRequestProductCategories() {
        JSONObject body = new JSONObject();
        body.put("name", "gaming");
        body.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(postProductCategories());

    }
    @Step("I receive response data for product categories")
    public void receiveResponseProductCategories() {
//        restAssuredThat(response -> response.body("'name'", equalTo("gaming")));
        restAssuredThat(response -> response.statusCode(200)
                .body("data.Name", equalTo("gaming"))
                .body("data.Description", equalTo("for gaming purposes")));
    }
    @Step("I receive valid HTTP response 200")
    public void receiveResponseCode200ProductCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // Failed create new category because endpoint is invalid
    @Step("I POST create product categories endpoint")
    public String postProductCategoriesEnd() {
        return url + "kategori";
    }
    @Step("I POST HTTP request with invalid endpoint and valid data")
    public void postHTTPRequestProdCatInvEnd() {
        JSONObject body = new JSONObject();
        body.put("name", "gaming");
        body.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(postProductCategoriesEnd());

    }
    @Step("I receive response code 404")
    public void receiveResponseCode404ProductCategories() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // Failed create new category because body is empty
    @Step("I POST create product categories endpoint url")
    public String postProductCategory() {
        return url + "categories/";
    }
    @Step("I POST HTTP request with empty body")
    public void postHTTPRequestProductCategory() {
        JSONObject body = new JSONObject();

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(postProductCategory());

    }
    @Step("I receive response code 500")
    public void receiveResponseCode500ProductCategory() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // Failed create new category because parameter is invalid
    @Step("I POST create product categories endpoints url")
    public String postProdCategory() {
        return url + "categories/";
    }
    @Step("I POST HTTP request with invalid parameter body")
    public void postHTTPRequestProdCategory() {
        JSONObject body = new JSONObject();
        body.put("nama", "gaming");
        body.put("deskripsi", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toJSONString()).post(postProdCategory());

    }
    @Step("I receive status code 500")
    public void receiveStatCode500ProductCategory() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // Get all product categories
    @Step("I GET all product categories endpoint")
    public String getAllProductCategories() {
        return url + "categories/";
    }
    @Step("I GET HTTP request with valid endpoint")
    public void getHTTPRequestAllProductCategories() {
        SerenityRest
                .given()
                .get(getAllProductCategories());
    }
    @Step("I receive response data for all product categories")
    public void receiveResponseGetAllProductCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid HTTP response 200 for get all product categories")
    public void receiveResponseCode200GetAllProductCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // Failed get all category with invalid endpoint
    @Step("I GET all product categories endpoints")
    public String getAllProductCategory() {return url + "kategori/";    }
    @Step("I GET HTTP request with invalid endpoint")
    public void getHTTPRequestAllProductCategory() {
        SerenityRest
                .given()
                .get(getAllProductCategory());
    }
    @Step("I receive HTTP response 404 for get all product categories")
    public void receiveResponseCode404GetAllProductCategory() {restAssuredThat(response -> response.statusCode(404));    }

    // Failed get all category with invalid method
    @Step("I GET all product categories endpoint url")
    public String getAllProductCat() {return url + "categories/";    }
    @Step("I GET HTTP request with invalid method")
    public void getHTTPRequestAllProductCat() {
        SerenityRest
                .given()
                .put(getAllProductCat());
    }
    @Step("I receive HTTP response 405 for get all product categories")
    public void receiveResponseCode405GetAllProductCategory() {restAssuredThat(response -> response.statusCode(405));    }

    //Scenario: TC02 - Get product category by ID
    @Step("I GET product category endpoints by ID")
    public String getProductCategoryByID() {
        return url + "categories/12502";
    }
    @Step("I GET HTTP request with valid ID")
    public void getHTTPRequestProductCategoryByID() {
        SerenityRest
                .given()
                .get(getProductCategoryByID());
    }
    @Step("I receive response data for product category by ID")
    public void receiveResponseProductCategoryByID() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid HTTP response 200 for get by ID")
    public void receiveResponseCode200ProductCategoryByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // Failed get category by id because id is invalid
    @Step("I GET product category endpoint by ID")
    public String getProductCategoriesByID() {
        return url + "categories/113sad31";
    }
    @Step("I GET HTTP request with invalid ID")
    public void getHTTPRequestProductCategoriesByID() {
        SerenityRest
                .given()
                .get(getProductCategoriesByID());
    }
    @Step("I receive valid HTTP response 400 for get by ID")
    public void receiveResponseCode400ProductCategoriesByID() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // Failed get category by id because method invalid
    @Step("I GET product category endpoints url by ID")
    public String getProductCatByID() {
        return url + "categories/11331";
    }
    @Step("I GET Product by ID HTTP request with invalid method")
    public void getHTTPRequestProductCatByID() {
        SerenityRest
                .given()
                .post(getProductCatByID());
    }
    @Step("I receive valid HTTP response 405 for get by ID")
    public void receiveResponseCode405ProductCatByID() {
        restAssuredThat(response -> response.statusCode(405));
    }

    // Delete a product category
    @Step("I DELETE a product category endpoints")
    public String deleteProductCategory() {
        return url + "categories/11382";
    }
    @Step("I DELETE HTTP request with valid ID")
    public void deleteHTTPRequestAProductCategory() {
        SerenityRest
                .given()
                .delete(deleteProductCategory());
    }
    @Step("I receive response data for delete a product category")
    public void receiveResponseDeleteProductCategory() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid HTTP response 200 for delete a product category")
    public void receiveResponseCode200DeleteProductCategory() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // Failed delete product because endpoint is invalid
    @Step("I DELETE a product category endpoint")
    public String deleteProductCat() {
        return url + "kategori/11382";
    }
    @Step("I DELETE HTTP request with invalid endpoints")
    public void deleteHTTPRequestAProductCat() {
        SerenityRest
                .given()
                .delete(deleteProductCat());
    }
    @Step("I receive valid HTTP response 404 for delete a product category")
    public void receiveResponseCode404DeleteProductCat() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
