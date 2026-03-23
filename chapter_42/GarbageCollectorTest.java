package JVM.chapter_42;

public class GarbageCollectorTest {
    public static void main(String[] args) throws InterruptedException {

        Customer[] customers = new Customer[100];

        for (int i = 0; i < 100; i++){
            Customer customer = new Customer("장민철");
            customers[i] = customer;
        }

        System.gc();
        // 가비지 콜렉터가 customer가 더 이상 쓰이지 않아서 이것을 없앨 것임 -> heap에 더 이상 Customer가 없음

        for(Customer customer:customers){
            customer.printMyInfo();
        }

        while(true){
            Thread.sleep(100);
        }
    }
}
