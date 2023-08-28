package rest_assured.ra_6_ecom_e2e.pojo.add_orders;

import java.util.List;

public class Add_Order_Res_POJO {

    private List<String> orders;
    private List<String> productOrderId;
    private String message;

    public List<String> getOrders() {
        return orders;
    }

    public void setOrders(List<String> orders) {
        this.orders = orders;
    }

    public List<String> getProductOrderId() {
        return productOrderId;
    }

    public void setProductOrderId(List<String> productOrderId) {
        this.productOrderId = productOrderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
