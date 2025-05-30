
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class PostmanTests {
    @Test
    public void testGetRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .assertThat()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void testPostRawTextRequest() {
        given().log().body()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "text/plain")
                .body("{\n    \"test\": \"value\"\n}")
                .when()
                .post("/post")
                .then()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo("{\n    \"test\": \"value\"\n}"));

    }

    @Test
    public void testPostFormDataRequest() {
        given().log().body()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "application/json")
                .body("{\"foo1\": \"bar1\", \"foo2\": \"bar2\"}")
                .when()
                .post("/post")
                .then()
                .assertThat()
                .statusCode(200)
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"));
    }

    @Test
    public void testPutRequest() {
        given().log().body()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .when()
                .put("/put")
                .then()
                .assertThat()
                .statusCode(200)
                .body("form", equalTo("{}"));
    }

    @Test
    public void testPatchRequest() {

    }

    @Test
    public void testDeleteRequest() {

    }

}




