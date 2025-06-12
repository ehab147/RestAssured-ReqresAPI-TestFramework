package utils;

import RequestModels.CreateUserRequestModel;
import RequestModels.LoginRequestModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginUtils {

    public static Response login(String userName, String password){

        LoginRequestModel loginRequestModel= new LoginRequestModel();
        loginRequestModel.email=userName;
        loginRequestModel.password=password;
        String body="";

        body=GeneralUtils.getObject(loginRequestModel);

        return RestAssured.given().log().all().headers(ProjectHeaders.apiKeyHeaders()).contentType(ContentType.JSON)
                .body(body).when().post(Constants.baseURL+Constants.loginEndPoint).then().extract().response();
    }
}
