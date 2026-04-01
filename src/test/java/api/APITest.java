package api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.qameta.allure.*;

public class APITest {

    @Test
    @Epic("API")
    public void getUsers(){

        given()
                .header("Authorization", "Bearer sk_test_51T1ezII9fjcZHliKTLYRPu5ACcnw1cfAdwdhls9CnkzkiOpgxdb3XG3U2cO9e6RZKm9hJNWww5niDV6zVXzz9bKl00v4Vy9cEe")
                .when()
                .get("https://api.stripe.com/v1/customers/cus_U0kM0n42v2hW5q")
                .then()
                .statusCode(200);
    }

}
