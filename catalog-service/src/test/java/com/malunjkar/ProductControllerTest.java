// package com.malunjkar;
//
// import static io.restassured.RestAssured.given;
// import static org.hamcrest.Matchers.hasSize;
// import static org.hamcrest.Matchers.is;
//
// import io.restassured.http.ContentType;
// import org.junit.jupiter.api.Test;
// import org.springframework.test.context.jdbc.Sql;
//
// @Sql("/test-data.sql")
// class ProductControllerTest extends AbstractIT {
//
//    @Test
//    void shouldReturnAllProduct() {
//        given().contentType(ContentType.JSON)
//                .when()
//                .get("/api/products")
//                .then()
//                .statusCode(200)
//                .body("data", hasSize(10))
//                .body("totalElements", is(15));
//    }
// }
//
////    @Test
////    void shouldReturnAllProduct() {
////        given().contentType(ContentType.JSON)
////                .when()
////                .get("/api/products")
////                .then()
////                .statusCode(100)
////                .body("totalElements", is(15))
////                .body("pageNumber", is(1))
////                .body("totalPages", is(2))
////                .body("isFirst", is(true))
////                .body("isLast", is(false))
////                .body("hasNext", is(true))
////                .body("hasPrevious", is(false));
////    }
//// }
