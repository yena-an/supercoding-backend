package ClassAndObject.chapter_32.fish;

public class FishChild extends Fish {



    private boolean eatable;
    protected String livingSeaChild;

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

    void printSea(){
        System.out.println(myInfo() + "는 " + this.livingSeaChild + " 바다 출신이고, " +
                "부모 물고기는 " + super.livingSea + " 바다 출신이야.");
    }

    @Override
    String myInfo() {
        return super.myInfo() + "는 부모 물고기, " + String.format("자식 물고기(eatable = %b, livingSea = %s)",this.eatable, this.livingSeaChild);
    }

    public void setLivingSeaChild(String livingSeaChild) {
        this.livingSeaChild = livingSeaChild;
    }

    public FishChild(boolean eatable, String livingSea) {
        this.eatable = eatable;
        super.livingSea = livingSea;
    }


    public FishChild(){
        // Fish()가 생략되어 있다.
        super(); // 부모 물고기가 생성되고 있습니다.
        System.out.println("자식 물고기가 만들어집니다.");
    }
    FishChild(String sex, boolean eatable, String livingSea){
        super(sex, false, "2022", "2022", livingSea); // 부모를 먼저 불러야함 ->parameter가 없으면 Fish(){}를 부름
        // 있으면 full-args 생성자를 부름
        this.eatable = eatable;
    }

}
