import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Constants;
import utils.LoginUtils;



public class LoginTests {

    @Test
    public void loginSuccess() {

        JsonPath jsonPath = LoginUtils.login(Constants.userName, Constants.password).jsonPath();
        Assert.assertNotNull(jsonPath.getString("token"));
        jsonPath.prettyPrint();
    }

    @Test
    public void loginInvalidEmail() {
        Response response = LoginUtils.login(Constants.userName, " ");
        JsonPath jsonPath = response.jsonPath();

        Assert.assertEquals(response.statusCode(), 400); // assert status code
        Assert.assertTrue(jsonPath.get("error")!=null);
        Assert.assertEquals(jsonPath.getString("error"), "Missing password"); // assert error message
    }

}