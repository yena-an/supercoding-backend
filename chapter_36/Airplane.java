package ClassAndObject.chapter_36;

public class Airplane implements Flyable{
    // 속성
    private String ariplaneID;
    private long remainingFuelAmount;
    private long maximumCapacity;

    @Override
    public void fly() {
        System.out.println("비행기 ID" + ariplaneID+ "가 납니다.");
    }

    public void refillFuel(long fuel){
        remainingFuelAmount += fuel;
    }

    public Airplane(String ariplaneID) {
        this.ariplaneID = ariplaneID;
    }
}
