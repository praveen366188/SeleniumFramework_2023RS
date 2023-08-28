package rest_assured.ra_6_ecom_e2e;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import rest_assured.ra_6_ecom_e2e.pojo.add_orders.AddOrderReq_pojo;
import rest_assured.ra_6_ecom_e2e.pojo.add_orders.Add_Order_Res_POJO;
import rest_assured.ra_6_ecom_e2e.pojo.add_orders.OrderDetails_req;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CreateOrder {
    public static String order_id;

    public static void create_order() {


        OrderDetails_req orderDetailsReq = new OrderDetails_req();
        orderDetailsReq.setCountry("India");
        orderDetailsReq.setProductOrderedId(AddProduct.product_id);

        List<OrderDetails_req> list = new ArrayList<>();
        list.add(orderDetailsReq);
        AddOrderReq_pojo addOrderReqPojo = new AddOrderReq_pojo();
        addOrderReqPojo.setOrders(list);
        RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .addHeader("Authorization", Login.token).addHeader("Content-Type", "application/json").build();
//        Response response = given().spec(requestSpecification).body(addOrderReqPojo).when().post("/api/ecom/order/create-order")
//                .then().statusCode(201).extract().response();
//        System.out.println(response.getBody());

        Add_Order_Res_POJO addOrderResPojo = given().spec(requestSpecification).body(addOrderReqPojo).when().post("/api/ecom/order/create-order")
                .then().statusCode(201).extract().as(Add_Order_Res_POJO.class);
        List<String> orders = addOrderResPojo.getOrders();
        order_id = orders.get(0);
        System.out.println(addOrderResPojo.getProductOrderId());
        System.out.println(addOrderResPojo.getMessage());


    }

    public static void delete_order() {
        RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .addHeader("Authorization", Login.token).addHeader("Content-Type", "application/json").addPathParams("key", AddProduct.product_id).build();
        String response = given().spec(requestSpecification).when().delete("/api/ecom/product/delete-product/{key}").then().statusCode(200).extract().response().asString();
        System.out.println(response);
    }
}
