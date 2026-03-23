package ClassAndObject.chapter_29;

public class Cashier {
    // 캐시어는 아메리카노가 얼마인지 확인한다.
    // 캐시어는 아메리카노 가격을 답변해준다.
    // 캐시어는 자신의 매상에 돈을 더한다
    // 캐시어는 아메리카노 주문을 알린다
    // 캐시어는 아메리카노 커피를 포장한다
    // 캐시어는 아메리카노 커피 준비완료 알린다

    // 가격표: 아메리카노: 5천원, 카페라페: 6천원, 카페모카: 6500원, 카푸치노: 6천원

    // 속성
    private long salesAmount;

    // 행위
    public long checkCoffeePrice(String coffeeName) {
        long price;
        switch (coffeeName) {
            case "아메리카노":
                price = 5000;
                break;
            case "카페라떼":
                price = 6000;
                break;
            case "카페모카":
                price = 6500;
                break;
            case "카푸치노":
                price = 6000;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }

    public void replyCoffeePrice(String coffeeName, long price) {
        if(price == 0){
            System.out.println("캐시어: 죄송합니다 손님 말씀하신 메뉴: " + coffeeName + "는 저희 가게에 없습니다.");
        }
        System.out.println("캐시어: 말씀하신 커피 " + coffeeName + "은 가격이 " + price +"원 입니다.");
    }

    public void addAmount(long money) {
        this.salesAmount += money;
    }

    public void sayOrder(String coffeeName){
        System.out.println("캐시어: 커피 " + coffeeName + " 주문이 들어왔습니다.");
    }

    public Coffee wrapUpCoffee(Coffee coffee) {
        coffee.beWrappedUp();
        return coffee;
    }

    public void sayCoffeeReady(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("캐시어: 주문하신 커피 " + coffeeName + "가 완료되었습니다.");
    }

    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }
}
