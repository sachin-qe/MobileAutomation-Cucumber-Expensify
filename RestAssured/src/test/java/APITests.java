import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class APITests {

    String baseUrl = "http://localhost:8080/api/v3";
    @Test
    void checkPetFindByStatus() {
        Response response = get(baseUrl + "/pet/findByStatus?status=available");
        Assert.assertEquals(response.getStatusCode(), 200);
    }
    @Test
    public void addPetToStore()
    {
        Response response = get(baseUrl+"/pet/1");
        Assert.assertEquals(response.getStatusCode(),200);
    }
    @Test
    public void storeInventory()
    {
        Response response = get (baseUrl + "/store/inventory");
        Assert.assertEquals(response.getStatusCode(), 200);
    }
    @Test
    public void createUser()
    {
        RestAssured.post( baseUrl+ "/user");
        RestAssured.baseURI = baseUrl+ "/user";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("id", 10);
        requestParams.put("username", "Test");
        requestParams.put("firstName", "Sachin");
        requestParams.put("lastName", "Parmar");
        requestParams.put("email", "sample@gmail.com");
        requestParams.put("password",  "sample2ee26d9");
        requestParams.put("phone",  "33221122");
        requestParams.put("userStatus",  1);

        request.header("Content-Type","application/json");
        Response response = request.body(requestParams.toString()).post();

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);
    }
}
