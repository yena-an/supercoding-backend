package ClassAndObject.chapter_34;

public class Customer {
    // 속성
    static int serialNums = 1;

    protected String customerID;
    protected String name;
    protected String customerGrade;

    protected int bonusPoint;
    protected double bonusPointRatio;

    // 행위
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    Customer(){}; // 디폴트 생성자를 만들어야 자식 클래스의 생성자에 super() 사용 가능

    Customer(String name){
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
}
