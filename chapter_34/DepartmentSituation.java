package ClassAndObject.chapter_34;

public class DepartmentSituation {
    public static void main(String[] args) {
        // 전제 상황
        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer customer = new VIPCustomer("아이유");

        Customer[] customerQueue = {
                new Customer("권율"), new Customer("이순신"), new VIPCustomer("광해군"),
                customer, new Customer("김좌진"), customer,
                new Customer("장원영"), customer, new VIPCustomer("김혜수"),
                new GoldCustomer("정우성"), new GoldCustomer("정우영"), new GoldCustomer("손흥민")
        };

        // 시나리오
        for(Customer customerEach:customerQueue){
            customerEach.printMyInfo();
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은: %d\n", cash);
            staff.addSalesAmount(cash);
        }

        staff.printMySalesAmount();

        /** Customer(customerID=Customer1, name=권율, customerGrade=SILVER, bonusPoint=0)
         내가 내는 금액은: 10000
         Customer(customerID=Customer2, name=이순신, customerGrade=SILVER, bonusPoint=0)
         내가 내는 금액은: 10000
         VIPCustomer(customerID=VIP2, name=광해군, customerGrade=VIP, bonusPoint=0)
         내가 내는 금액은: 9000
         VIPCustomer(customerID=VIP1, name=아이유, customerGrade=VIP, bonusPoint=0)
         내가 내는 금액은: 9000
         Customer(customerID=Customer3, name=김좌진, customerGrade=SILVER, bonusPoint=0)
         내가 내는 금액은: 10000
         VIPCustomer(customerID=VIP1, name=아이유, customerGrade=VIP, bonusPoint=500)
         내가 내는 금액은: 9000
         Customer(customerID=Customer4, name=장원영, customerGrade=SILVER, bonusPoint=0)
         내가 내는 금액은: 10000
         VIPCustomer(customerID=VIP1, name=아이유, customerGrade=VIP, bonusPoint=1000)
         내가 내는 금액은: 9000
         VIPCustomer(customerID=VIP3, name=김혜수, customerGrade=VIP, bonusPoint=0)
         내가 내는 금액은: 9000
         오늘의 최종 매상은 1085000원 입니다..**/
    }
}
