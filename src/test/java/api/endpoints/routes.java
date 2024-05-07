package api.endpoints;

public class routes {

    // BASE URL

    public static String baseURL="https://petstore.swagger.io/#/";


    //USER MODEL

    public static String postUser=baseURL+"/user";
    public static String getUserUrl=baseURL+"/user/{username}";
    public static String updatetUser=baseURL+"/user/{username}";
    public static String deleteUser=baseURL+"/user/{username}";
    public static String loginUser=baseURL+"/user/login";
    public static String logoutUser=baseURL+"/user/logout";
    public static String postArrayUser=baseURL+"/user/createWithArray";
    public static String postListUser =baseURL+"/user/createWithList";

    //PET MODEL

    public static String postPetImage=baseURL+"/pet/{petId}/uploadImage";
    public static String postPet=baseURL+"/pet";
    public static String putPet=baseURL+"/pet";
    public static String getPetByStatus=baseURL+"/pet/findByStatus";
    public static String getPetByID=baseURL+"/pet/{petId}";
    public static String updatePet=baseURL+"/pet/{petId}";
    public static String deletePet=baseURL+"/pet/{petId}";


    //STORE MODEL

    public static String getStoreByStatus=baseURL+"/store/inventory";
    public static String postOrder=baseURL+"/store/order";
    public static String getOrder=baseURL+"/store/order/{orderId}";
    public static String deleteOrder=baseURL+"/store/order/{orderId}";








}
