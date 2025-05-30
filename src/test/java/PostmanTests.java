import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostmanTests {
    @Test
    public void testGetRequest() {
        Response response = io.restassured.RestAssured.get("https://postman-echo.com/get?foo1=bar1&foo2=bar2");

        assertEquals(200, response.getStatusCode());
        assertEquals("bar1", response.jsonPath().getString("args.foo1"));
        assertEquals("bar2", response.jsonPath().getString("args.foo2"));
    }

    @Test
    public void testPostRawTextRequest() {
        given()
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
        given()
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

    }

    @Test
    public void testPatchRequest() {

    }

    @Test
    public void testDeleteRequest() {

    }

}




