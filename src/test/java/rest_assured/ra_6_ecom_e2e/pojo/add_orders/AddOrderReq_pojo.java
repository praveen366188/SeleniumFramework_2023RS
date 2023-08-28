package rest_assured.ra_6_ecom_e2e.pojo.add_orders;

import java.util.List;

public class AddOrderReq_pojo {

    private List<OrderDetails_req> orders;

    public List<OrderDetails_req> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDetails_req> orders) {
        this.orders = orders;
    }
}
