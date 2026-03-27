package ClassAndObject.chapter_31;

public class FishChild extends Fish {
    public FishChild(){
        // Fish()가 생략되어 있다.
        System.out.println("자식 물고기가 만들어집니다.");
    }


    private boolean eatable;

    public void digging(){
        System.out.println(myInfo() + "가 모래를 파고 있습니다." );
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public void becomeDanger(){
        this.havingPoison = true;
    }

    @Override  // 메소드 오버라이딩
    void eat(String food){
        System.out.printf(myInfo() + " 는 %s를 아주 열심히 먹고 있습니다.\n", food);
    }


}
