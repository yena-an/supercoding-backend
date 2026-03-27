package JVM.chapter_41;

public class DepartmentSituation {
    public static void main(String[] args) throws InterruptedException {
        // 전제 상황
        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        String hello = "Hello";
        String hello1 = new String("Hello");
        String hello2 = "Hello";
        String hello3 = "Hello";

        Customer customer1 = new Customer("권율");
        Customer customer2 = new Customer("이순신");

        Customer customer3 = new VIPCustomer("아이유");
        Customer customer4 = new VIPCustomer("광해군");
        Customer customer5 = new VIPCustomer("김혜수");

        Customer customer6 = new GoldCustomer("정우성");
        Customer customer7 = new GoldCustomer("정우신");

        Customer[] customerQueue = {
                new GoldCustomer("정우성"),
        };

        // 시나리오
        for(Customer customerEach:customerQueue){
            customerEach.printMyInfo();
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은: %d\n", cash);
            staff.addSalesAmount(cash);
        }

        staff.printMySalesAmount();

        while (true) {
            Thread.sleep(100);
        }
    }
}
