package ClassAndObject.chapter_29;

public class CoffeeShopSituation {
    public static void main(String[] args) {
        // 인스턴스화
        Customer customer = new Customer();
        customer.setCashAmount(50_000);

        Cashier cashier = new Cashier();
        cashier.setSalesAmount(1_000_000);

        Barista barista = new Barista();

        // 로직
        String coffeeName = "아메리카노";
        boolean isTakeOut = true;

        customer.askCoffee(cashier, coffeeName);

        long price = cashier.checkCoffeePrice(coffeeName);
        cashier.replyCoffeePrice(coffeeName, price);

        long cash = customer.withDrawCash(price);
        customer.orderCoffee(coffeeName, isTakeOut);

        cashier.addAmount(cash);
        cashier.sayOrder(coffeeName);

        barista.noticeOrder(coffeeName);
        // 새 Coffee 객체를 만듬
        Coffee coffee = barista.makeUpCoffee(coffeeName, 500, 30);
        barista.sayCoffeeReady(coffee);

        Coffee coffeeCompleted = cashier.wrapUpCoffee(coffee);
        cashier.sayCoffeeReady(coffeeCompleted);

        customer.drinkCoffee(coffeeCompleted);
        if (coffeeCompleted.getCoffeeName() == coffeeName &&
        coffeeCompleted.isWrappedUp() == isTakeOut){
            customer.upgradeMyFeeling();
        }

        customer.showMyInfo();
    }
    /** 손님: 커피 아메리카노얼마인가요?
     캐시어: 말씀하신 커피 아메리카노은 가격이 5000원 입니다.
     손님: 커피 아메리카노을 주문할게요단, 포장 여부는 true으로 부탁드려요.
     캐시어: 커피 아메리카노 주문이 들어왔습니다.
     바리스타: 커피주문 확인했습니다. 커피: 아메리카노
     바리스타: 커피 제작이 완료되었습니다. 커피: 아메리카노
     캐시어: 주문하신 커피 아메리카노가 완료되었습니다.
     손님: 나는 커피 아메리카노을 마신다.
     손님: 지금 나의 기분은 기분이 좋아졌다. 하고, 현금은 45000 있습니다..**/
}
