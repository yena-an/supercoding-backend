package ClassAndObject.chapter_43;

public class EqaulsTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("ID1", "민철");
        Customer customer2 = customer1;

        Customer customer3 = new Customer("ID1", "민철");
        Customer customer4 = new Customer("ID2", "철민");

        System.out.println(customer1); // Customer(customerID=ID1, name=민철, customerGrade=SILVER, bonusPoint=0)
        System.out.println(customer3); // Customer(customerID=ID1, name=민철, customerGrade=SILVER, bonusPoint=0)

        System.out.println(customer1.equals(customer2)); // true
        System.out.println(customer1 == customer2); // true
        System.out.println(customer1.equals(customer3)); // true
        System.out.println(customer1 == customer3); // false, 오버라이드를 하지 않아서 여전히 heap 주소를 비교
        System.out.println(customer1.equals(customer4)); // false
    }
}
