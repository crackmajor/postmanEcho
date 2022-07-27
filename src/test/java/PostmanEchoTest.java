import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanEchoTest{
    @Test
    void postmanEchoTest(){
        given()
                .baseUri("https://postman-echo.com")
                .body("some data agfagfadgdgd") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("some data agfagfadgdgd"))
        ;
    }
}
