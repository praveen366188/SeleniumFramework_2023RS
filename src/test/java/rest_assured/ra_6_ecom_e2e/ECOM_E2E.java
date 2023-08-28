package rest_assured.ra_6_ecom_e2e;

public class ECOM_E2E {
    public static void main(String[] args) {
        Login.login_to_get_token();
        AddProduct.add_product();
        CreateOrder.create_order();
        GetOrder.get_order();
        CreateOrder.delete_order();
    }
}
