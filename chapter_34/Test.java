package ClassAndObject.chapter_34;

public class Test {
    public static void main(String[] args) {
        // 각각의 객체가 잘 만들어지는지 확인
        Customer customer = new Customer("나철수");
        VIPCustomer vipCustomer = new VIPCustomer("나관중");
        Customer customer2 = new Customer("나영희");

        customer.printMyInfo(); // Customer(customerID=Customer1, name=나철수, customerGrade=SILVER, bonusPoint=0)
        customer2.printMyInfo(); // Customer(customerID=Customer2, name=나영희, customerGrade=SILVER, bonusPoint=0)
        vipCustomer.printMyInfo(); // VIPCustomer(customerID=VIP1, name=나관중, customerGrade=VIP, bonusPoint=0)

    }
}
