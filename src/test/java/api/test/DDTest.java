package api.test;

import api.endpoints.UserEndPoints;
import api.payload.user;
import api.utilites.dataProviders;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DDTest {


    @Test(dataProvider = "data",dataProviderClass = dataProviders.class)
    public void postUserTest(String id,String uname,String fname,String lanme,String email,String pass,String phone )
    {
        user userpayload=new user();
        userpayload.setId(Integer.parseInt(id));
        userpayload.setUserName(uname);
        userpayload.setFirstName(fname);
        userpayload.setLastName(lanme);
        userpayload.setEmail(email);
        userpayload.setPassword(pass);
        userpayload.setPhone(phone);



        Response response= UserEndPoints.createUser(userpayload);
        response.then().log().all();

    }
    @Test(dataProvider = "Username", dataProviderClass=dataProviders.class)
    public void deleteusers(String userName)
    {
        Response response=UserEndPoints.deleteUser(userName);
        response.then().log().all();
    }


}
