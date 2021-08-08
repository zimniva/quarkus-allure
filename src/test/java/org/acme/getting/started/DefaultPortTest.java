package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class DefaultPortTest {

    @Test
    public void testDefaultPort() {
        given()
          .when().get("/")
          .then()
             .statusCode(200);
             //.body(is("<html>/n<head>/n<title>Testing Guide</title>/n</head>/n<body>Information about testing</body>/n</html>"));
    }
    

}