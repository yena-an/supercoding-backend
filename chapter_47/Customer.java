package ClassAndObject.chapter_47;

import java.util.Objects;

public class Customer {
    // 속성
    static int serialNums = 1;

    public String customerID;
    public String name;
    protected String customerGrade;

    protected int bonusPoint;
    protected double bonusPointRatio;

    // 행위
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    Customer(){}; // 디폴트 생성자를 만들어야 자식 클래스의 생성자에 super() 사용 가능

    public Customer(String customerID, String name) {
        this(name);
        this.customerID = customerID;
    }

    public Customer(String name){
        this.customerID = "Customer" + serialNums++;
        this.name = name;
        this.customerGrade = "SILVER"; // 생성 시 실버 등급에서부터 시작
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    void printMyInfo(){
        System.out.printf("Customer(customerID=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override
    public String toString() {
        return String.format("Customer(customerID=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (obj instanceof Customer){
            // 같은 타입이여야만 equal이 성립하기 때문에 같은 타입인지 확인한다.
            // 같은 타입이면 다운캐스팅을 진행 후 비교
            Customer customer = (Customer) obj;
            return  customer.customerID == this.customerID;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }
}
