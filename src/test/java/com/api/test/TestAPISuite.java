package com.api.test;

import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.*;


public class TestAPISuite {
    @Test
    public void Verify_APIStatusCode(){
        given().header("auth-key","8b8942e7-bb90-443b-b737-e108887c80de")
                .param("q","oxley")
                .param("state", "QLD")
        .when()
                .get("https://digitalapi.auspost.com.au/postcode/search.json")
        .then()
                .assertThat().statusCode(200);
    }

}
