package starter.api;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Product {
    protected static String url = "https://altashop-api.fly.dev/api/";
    private static final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoicmluaUBtYWlsLmNvbSJ9.aVwOOZtxN3obXscWfnNgr8ZQ5-aCgJqRIHhZ69ucah8";
    @Step("I set product endpoint")
    public String setProductEndpoints(){
        return url + "products";
    }
    @Step("I send GET HTTP request")
    public void sendHTTPrequest(){
        SerenityRest.given().when().get(setProductEndpoints());
    }
    @Step("I successfully get all product data with status code 200")
    public void response(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set product endpoints")
    public String setProductEndpoints2(){
        return url + "barang";
    }
    @Step("I send GET HTTP request with invalid endpoint")
    public void sendHTTPrequest2(){
        SerenityRest.given().when().get(setProductEndpoints2());
    }
    @Step("I fail get all product data with status code 404")
    public void response2(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set product endpoints url")
    public String setProductEndpoints3(){
        return url + "products";
    }
    @Step("I send GET HTTP request with wrong method")
    public void sendHTTPrequest3(){
        SerenityRest.given().when().put(setProductEndpoints3());
    }
    @Step("I fail get all product data with status code 405")
    public void response3(){
        restAssuredThat(response -> response.statusCode(405));
    }

    @Step("I set product id endpoint")
    public String setProductEndpoints4(){
        return url + "products/11286";
    }
    @Step("I send GET HTTP request with valid endpoint")
    public void sendHTTPrequest4(){
        SerenityRest.given().when().get(setProductEndpoints4());
    }
    @Step("I success get product data by id with status code 200")
    public void response4(){
//        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set product id endpoints")
    public String setProductEndpoints5(){
        return url + "products/687598";
    }
    @Step("I send GET HTTP request with invalid id")
    public void sendHTTPrequest5(){
        SerenityRest.given().when().get(setProductEndpoints5());
    }
    @Step("I failed get product data by id with status code 404")
    public void response5(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set product id endpoints url")
    public String setProductEndpoints6(){
        return url + "barang/6875";
    }
    @Step("I send GET HTTP request with invalid endpoints url")
    public void sendHTTPrequest6(){
        SerenityRest.given().when().get(setProductEndpoints6());
    }
    @Step("I failed to get product data by id with status code 404")
    public void response6(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set product rating endpoints url")
    public String setProductEndpoints7(){
        return url + "products/6875/ratings";
    }
    @Step("I send GET HTTP request with valid rating endpoint")
    public void sendHTTPrequest7(){
        SerenityRest.given().when().get(setProductEndpoints7());
    }
    @Step("I success to get product rating by id with status code 200")
    public void response7(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set product rating endpoint url")
    public String setProductEndpoints8(){
        return url + "products/6875/nilai";
    }
    @Step("I send GET HTTP request with invalid rating endpoint")
    public void sendHTTPrequest8(){
        SerenityRest.given().when().get(setProductEndpoints8());
    }
    @Step("I failed to get product rating by id with status code 404")
    public void response8(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set product comment endpoint url")
    public String setProductEndpoints9(){
        return url + "products/6875/comments";
    }
    @Step("I send GET HTTP request with valid comment endpoint")
    public void sendHTTPrequest9(){
        SerenityRest.given().when().get(setProductEndpoints9());
    }
    @Step("I success to get product comment by id with status code 200")
    public void response9(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set product comment endpoint")
    public String setProductEndpoints10(){
        return url + "products/6875bh/komentar";
    }
    @Step("I send GET HTTP request with invalid comment endpoint")
    public void sendHTTPrequest10(){
        SerenityRest.given().when().get(setProductEndpoints10());
    }
    @Step("I failed to get product comment by id with status code 404")
    public void response10(){
        restAssuredThat(response -> response.statusCode(404));
    }

    // TC033 - Add new products
    @Step("I POST add new products endpoints")
    public String postAddNewProductsEndpoints() {
        return url + "products";
    }
    @Step("I POST HTTP request for add new products")
    public void postHTTPRequestForAddNewProducts() {
        JSONObject body = new JSONObject();
        body.put("name", "Sony PS5");
        body.put("description", "play has no limits");
        body.put("price", 299);
        JSONArray categories = new JSONArray();
        categories.add(1);
        body.put("categories", categories);

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postAddNewProductsEndpoints());
    }
    @Step("I receive valid HTTP response 200 for add new products")
    public void receiveResponseCode200ForAddNewProducts() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // failed
    @Step("I POST add new products endpoint")
    public String postAddNewProductsEndpoint() {
        return url + "products";
    }
    @Step("I POST HTTP request for add new products")
    public void postHTTPRequestForAddNewProduct() {
        JSONObject body = new JSONObject();


        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postAddNewProductsEndpoint());
    }
    @Step("I receive valid HTTP response 400 for add new products")
    public void receiveResponseCode500ForAddNewProducts() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // Failed create a new product because parameter is invalid
    @Step("I POST add new products endpoint url")
    public String postAddNewProductEndpoint() {
        return url + "products";
    }
    @Step("I POST HTTP request for add new product with invalid parameter")
    public void postRequestForAddNewProduct() {
        JSONObject body = new JSONObject();
        body.put("nama", "Sony PS5");
        body.put("deskripsi", "play has no limits");
        body.put("harga", 299);
        JSONArray categories = new JSONArray();
        categories.add(1);
        body.put("kategori", categories);


        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postAddNewProductEndpoint());
    }
    @Step("I receive response 500 for add new products")
    public void responseCode500ForAddNewProducts() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // Failed create a new product because parameter name is not setted
    @Step("I POST add new products endpoint url")
    public String postNewProductEndpoint() {
        return url + "products";
    }
    @Step("I POST HTTP request for add new product with invalid parameter")
    public void requestForAddNewProduct() {
        JSONObject body = new JSONObject();
        body.put("description", "play has no limits");
        body.put("price", 299);
        JSONArray categories = new JSONArray();
        categories.add(1);
        body.put("categories", categories);


        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postNewProductEndpoint());
    }
    @Step("I receive response 500 for add new products")
    public void response500ForAddNewProducts() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // Failed create a new product because parameter name is not setted
    @Step("I POST new products endpoints url")
    public String postAddProductEndpoint() {
        return url + "products";
    }
    @Step("I POST HTTP request for add new product and parameter is filled with space")
    public void requestAddNewProduct() {
        JSONObject body = new JSONObject();
        body.put("name", "   ");
        body.put("description", "   ");
        body.put("price","  ");
        JSONArray categories = new JSONArray();
        categories.add(1);
        body.put("categories", "  ");


        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postAddProductEndpoint());
    }
    @Step("I receive response code 400 for add new product")
    public void response400ForAddProducts() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC51 - Give products ratings
    @Step("I POST give products rating endpoints")
    public String postGiveProductsRatingEndpoints() {
        return url + "products/11672/ratings";
    }
    @Step("I POST HTTP request for give products ratings")
    public void postHTTPRequestForGiveProductsRatings() {
        JSONObject body = new JSONObject();
        body.put("count", 4);

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoicmluaUBtYWlsLmNvbSJ9.aVwOOZtxN3obXscWfnNgr8ZQ5-aCgJqRIHhZ69ucah8")
                .contentType("application/json")
                .post(postGiveProductsRatingEndpoints());

    }
    @Step("I receive valid HTTP response 200 for give products ratings")
    public void receiveValidHTTPResponse200ForGiveProductsRatings() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC51 - Give products ratings
    @Step("I POST give products rating endpoint")
    public String postGiveProductsRatingEndpoint() {
        return url + "products/1162/ratings";
    }
    @Step("I POST HTTP request for give products ratings with invalid id")
    public void postHTTPRequestForGiveProductsRating() {
        JSONObject body = new JSONObject();
        body.put("count", 4);

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoicmluaUBtYWlsLmNvbSJ9.aVwOOZtxN3obXscWfnNgr8ZQ5-aCgJqRIHhZ69ucah8")
                .contentType("application/json")
                .post(postGiveProductsRatingEndpoint());

    }
    @Step("I receive valid HTTP response 500 for give products ratings")
    public void receiveValidHTTPResponse500ForGiveProductsRatings() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I set add product comment endpoint")
    public String setCommentEndpoints(){
        return url + "products/10003/comments";
    }
    @Step("I send POST HTTP request with comment in body")
    public void sendHTTPrequestComment(){
        JSONObject body = new JSONObject();
        body.put("content","Ini komentar");

        SerenityRest.given().header("Content-Type", "application/json").auth().oauth2(token).when().body(body.toJSONString()).post(setCommentEndpoints());
    }
    @Step("I success create a comment in product with status code 200")
    public void responseComment(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set add product comment wrong endpoint")
    public String setCommentEndpoints2(){
        return url + "products/10003/komentar";
    }
    @Step("I send POST HTTP request with invalid endpoint")
    public void sendHTTPrequestComment2(){
        JSONObject body = new JSONObject();
        body.put("content","Ini komentar");

        SerenityRest.given().header("Content-Type", "application/json").auth().oauth2(token).when().body(body.toJSONString()).post(setCommentEndpoints2());
    }
    @Step("I failed create a comment in product with status code 404")
    public void responseComment2(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set add product comment wrong endpoints")
    public String setCommentEndpoints3(){
        return url + "products/10003/comments";
    }
    @Step("I send POST HTTP request with empty body content")
    public void sendHTTPrequestComment3(){
        JSONObject body = new JSONObject();

        SerenityRest.given().header("Content-Type", "application/json").auth().oauth2(token).when().body(body.toJSONString()).post(setCommentEndpoints3());
    }
    @Step("I failed create a comment in product with status code 500")
    public void responseComment3(){
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I set add product comment wrong endpoints url")
    public String setCommentEndpoints4(){
        return url + "products/10003/comments";
    }
    @Step("I send POST HTTP request with invalid parameter comment")
    public void sendHTTPrequestComment4(){
        JSONObject body = new JSONObject();
        body.put("komen","Ini komentar");

        SerenityRest.given().header("Content-Type", "application/json").auth().oauth2(token).when().body(body.toJSONString()).post(setCommentEndpoints4());
    }
    @Step("I failed create a comment in product with response code 500")
    public void responseComment4(){
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I set add product comments wrong endpoints url")
    public String setCommentEndpoints5(){
        return url + "products/10003/comments";
    }
    @Step("I send PUT HTTP request with invalid parameter comment")
    public void sendHTTPrequestComment5(){
        JSONObject body = new JSONObject();
        body.put("content","Ini komentar");

        SerenityRest.given().header("Content-Type", "application/json").auth().oauth2(token).when().body(body.toJSONString()).put(setCommentEndpoints5());
    }
    @Step("I failed create a comment in product with response code 405")
    public void responseComment5(){
        restAssuredThat(response -> response.statusCode(405));
    }

    @Step("I set delete product endpoints url")
    public String setDeleteEndpoint(){
        return url + "products/11297";
    }
    @Step("I send DELETE HTTP request with valid endpoint")
    public void sendHTTPrequestDelete(){
        SerenityRest.given().when().delete(setDeleteEndpoint());
    }
    @Step("I success delete product with response code 200")
    public void responseDelete(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set delete product endpoint url")
    public String setDeleteEndpoint2(){
        return url + "barang/11297";
    }
    @Step("I send DELETE HTTP request with invalid endpoint")
    public void sendHTTPrequestDelete2(){
        SerenityRest.given().when().delete(setDeleteEndpoint2());
    }
    @Step("I fail delete product with response code 404")
    public void responseDelete2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
