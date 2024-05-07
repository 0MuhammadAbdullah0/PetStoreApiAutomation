package api.test;

import api.endpoints.UserEndPoints2;
import api.payload.user;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class usertest2 {

    Faker faker;
    user userPayload;
    @BeforeClass
    public void SetupData()
    {
        faker=new Faker();
        userPayload=new user();
        int id=Integer.parseInt(faker.idNumber().hashCode()+"");
        userPayload.setId(id);
        userPayload.setUserName(faker.name().username());
        userPayload.setFirstName(faker.name().firstName());
        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().safeEmailAddress());
        userPayload.setPassword(faker.internet().password(5,10));
        userPayload.setPhone(faker.phoneNumber().cellPhone());
    }
    @Test(priority = 2)
    public void testPostUser()
    {
        testLoginUser();
        Response response= UserEndPoints2.createUser(userPayload);
        response.then().log().all();
    }
    @Test(priority = 2)
    public void testgetUser()
    {
        Response response=UserEndPoints2.ReadUser(this.userPayload.getUserName());
        response.then().statusCode(200).log().all();
    }
    @Test(priority = 3)
    public void testupdateuser()
    {

        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().safeEmailAddress());
        Response response=UserEndPoints2.updateUser(this.userPayload.getUserName(),userPayload);
        response.then().statusCode(200).log().all();

    }
    @Test(priority = 1)
    public void testLoginUser()
    {
        Response response=UserEndPoints2.loginUser("abcd","abcd");
        response.then().statusCode(200).log().all();
    }
    @Test(priority = 5)
    public void logout()
    {
        Response response=UserEndPoints2.logoutUser();
        response.then().statusCode(200).log().all();
    }

    @Test
    public void testCreateWithArray()
    {
        Response response=UserEndPoints2.createUserWithArray(userPayload);
        response.then().log().all();
    }
}

