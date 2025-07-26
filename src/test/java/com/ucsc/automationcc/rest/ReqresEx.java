package com.ucsc.automationcc.rest;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqresEx {

    @BeforeClass
    public void setBasePage() {
        RestAssured.baseURI = "https://reqres.in/api";
     }
    @Test
    public void getAllUsers() {
        given()
                .when()
                .get("users?page=1")
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void createUsers() {
        String json = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        given()
                .header("x-api-key","reqres-free-v1")
                .body(json)
                .when()
                .contentType("application/json")
                .accept("application/json")
                .post("https://reqres.in/api/users")
                .then()
                .assertThat()
                .statusCode(201)
                .log().all();
    }

}
