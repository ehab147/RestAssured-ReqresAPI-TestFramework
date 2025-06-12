package utils;

import java.util.HashMap;

public class ProjectHeaders {

    public static HashMap<String, String> generalHeaders(){
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization",LoginUtils.login(Constants.userName,Constants.password).jsonPath().getString("token"));
        headers.put("Content-Type","application/json");
        headers.put("x-api-key","reqres-free-v1");

        return headers;
    }
    public static HashMap<String, String> apiKeyHeaders(){
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type","application/json");
        headers.put("x-api-key","reqres-free-v1");
        return headers;
    }
}
