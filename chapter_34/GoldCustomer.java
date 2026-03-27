package ClassAndObject.chapter_34;

public class GoldCustomer extends Customer{
    private double discountRatio;

    // 행위

    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    GoldCustomer(String name){
        super();
        this.customerID = "Customer" + Customer.serialNums++; // Customer와 같은 serial number 공유
        this.name = name;
        this.customerGrade = "GOLD";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.03;
        this.discountRatio = 0.03;
    }
}
