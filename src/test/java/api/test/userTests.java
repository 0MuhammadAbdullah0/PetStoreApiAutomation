package api.test;

import api.endpoints.UserEndPoints;
import api.payload.user;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class userTests {

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
    @Test(priority = 1)
    public void testPostUser()
    {
        testLoginUser();
        Response response= UserEndPoints.createUser(userPayload);
        response.then().log().all();
        System.out.println(userPayload.toString());
    }
    @Test(priority = 2)
    public void testgetUser()
    {
        Response response=UserEndPoints.ReadUser(this.userPayload.getUserName());
        response.then().statusCode(200).log().all();
    }
    @Test(priority = 3)
    public void testupdateuser()
    {

        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().safeEmailAddress());
        Response response=UserEndPoints.updateUser(this.userPayload.getUserName(),userPayload);
        response.then().statusCode(200).log().all();

    }
    @Test(priority = 7)
    public void testLoginUser()
    {
        Response response=UserEndPoints.loginUser("abcd","abcd");
        response.then().statusCode(200).log().all();
    }
    @Test(priority = 5)
    public void logout()
    {
        Response response=UserEndPoints.logoutUser();
        response.then().statusCode(200).log().all();
    }

    @Test(priority = 6)
    public void testCreateWithArray()
    {
        Response response=UserEndPoints.createUserWithArray(userPayload);
        response.then().log().all();
    }






}
