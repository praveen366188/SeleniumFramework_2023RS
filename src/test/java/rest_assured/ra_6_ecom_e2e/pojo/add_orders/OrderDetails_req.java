package rest_assured.ra_6_ecom_e2e.pojo.add_orders;

public class OrderDetails_req {
    private String country;
    private String productOrderedId;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProductOrderedId() {
        return productOrderedId;
    }

    public void setProductOrderedId(String productOrderedId) {
        this.productOrderedId = productOrderedId;
    }
}
