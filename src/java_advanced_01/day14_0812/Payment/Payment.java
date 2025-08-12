package java_advanced_01.day14_0812.Payment;

public abstract class Payment implements Payable {
    protected String shopName;      // 상점명
    protected String productName;   // 상품명
    protected long productPrice;    // 상품가격

    public Payment(String shopName, String productName, long productPrice) {
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }

}
