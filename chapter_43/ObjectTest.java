package ClassAndObject.chapter_43;

public class ObjectTest {
    public static void main(String[] args) {
        Object customer = new Customer("정우성"); // object로 업캐스팅
        Customer customer1 = new Customer("장민철");

        System.out.println(customer1); // Customer(customerID=Customer2, name=장민철, customerGrade=SILVER, bonusPoint=0)
        GoldCustomer customer2 = new GoldCustomer("정우영");
        System.out.println(customer2); // Customer(customerID=Customer3, name=정우영, customerGrade=GOLD, bonusPoint=0, discountRatio=0.030000)

        Staff staff = new Staff();
        VIPCustomer vipCustomer = new VIPCustomer("아이유");
        System.out.println(staff); // Staff{salesAmount=0}
        System.out.println(vipCustomer); // VIPCustomer{agentID='null', customerID='VIP1', name='아이유', customerGrade='VIP', bonusPoint=0}
    }
}
