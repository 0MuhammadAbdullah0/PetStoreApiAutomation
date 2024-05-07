package api.endpoints;

import api.payload.user;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.*;

public class UserEndPoints2 {

        static ResourceBundle getURL() {

            ResourceBundle routes=ResourceBundle.getBundle("userRoutes");
            return routes;


        }

        public static Response createUser(user payload)
        {

            String post_URL=getURL().getString("postUser");
            Response response=given().
                    filter(new AllureRestAssured()).
                    contentType(ContentType.JSON).
                    accept(ContentType.JSON).
                    body(payload).
                    when().
                    post(post_URL);

            return response;
        }

        public static Response ReadUser(String userName)
        {
            String get_user_URL=getURL().getString("getUserUrl");
            Response response=given().
                    filter(new AllureRestAssured()).
                    pathParam("username",userName).
                    when().
                    get(get_user_URL);
            return response;
        }
        public static Response updateUser(String userName,user payload)
        {
            String update_user=getURL().getString("updateUser");
            Response response=given().
                    filter(new AllureRestAssured()).
                    contentType(ContentType.JSON).
                    accept(ContentType.JSON).
                    pathParam("username",userName).
                    body(payload).
                    when().
                    get(update_user);
            return response;
        }
        public static Response deleteUser(String userName)
        {
            String delete_user_URL=getURL().getString("deleteUser");
            Response response=given().
                    filter(new AllureRestAssured()).
                    pathParam("username",userName).
                    when().
                    delete(delete_user_URL);
            return response;
        }
        public static Response loginUser(String userName,String password)
        {
            String login_user_URL=getURL().getString("loginUser");
            Response response=given().
                    filter(new AllureRestAssured()).
                    queryParams("username",userName,"password",password).
                    when().
                    get(login_user_URL);
            return response;
        }
        public static Response logoutUser()
        {
            String logout_user_URL=getURL().getString("logoutUser");
            Response response=given().
                    filter(new AllureRestAssured()).
                    when().
                    get(logout_user_URL);
            return response;
        }
        public static Response createUserWithList(user payload)
        {
            String post_userlist_URL=getURL().getString("postListUser");
            Response response=given().
                    filter(new AllureRestAssured()).
                    contentType(ContentType.JSON).
                    accept(ContentType.JSON).
                    body(payload).
                    when().
                    post(post_userlist_URL);

            return response;
        }
        public static Response createUserWithArray(user payload)
        {

            String post_userArray_URL=getURL().getString("postArrayUser");
            Response response=given().
                    filter(new AllureRestAssured()).
                    contentType(ContentType.JSON).
                    accept(ContentType.JSON).
                    body("["+payload+"]").
                    when().
                    post(post_userArray_URL);

            return response;
        }





    }

