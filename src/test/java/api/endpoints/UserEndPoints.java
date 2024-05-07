package api.endpoints;

import api.payload.user;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;



public class UserEndPoints {

    public static Response createUser(user payload)
    {

        Response response=given().
                filter(new AllureRestAssured()).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(payload).
        when().
                post(routes.postUser);

        return response;
    }
    public static Response ReadUser(String userName)
    {
        Response response=given().
                filter(new AllureRestAssured()).
                pathParam("username",userName).
                when().
                get(routes.getUserUrl);
        return response;
    }
    public static Response updateUser(String userName,user payload)
    {
        Response response=given().
                filter(new AllureRestAssured()).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                pathParam("username",userName).
                body(payload).
        when().
                get(routes.updatetUser);
        return response;
    }
    public static Response deleteUser(String userName)
    {
        Response response=given().
                filter(new AllureRestAssured()).
                pathParam("username",userName).
        when().
                delete(routes.deleteUser);
        return response;
    }
    public static Response loginUser(String userName,String password)
    {
        Response response=given().
                filter(new AllureRestAssured()).
                queryParams("username",userName,"password",password).
        when().
                get(routes.loginUser);
        return response;
    }
    public static Response logoutUser()
    {
        Response response=given().
                filter(new AllureRestAssured()).
                when().
                get(routes.logoutUser);
        return response;
    }
    public static Response createUserWithList(user payload)
    {
        Response response=given().
                filter(new AllureRestAssured()).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(payload).
        when().
                post(routes.postListUser);

        return response;
    }
    public static Response createUserWithArray(user payload)
    {
        Response response=given().
                filter(new AllureRestAssured()).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body("["+payload+"]").
                when().
                post(routes.postArrayUser);

        return response;
    }





}
