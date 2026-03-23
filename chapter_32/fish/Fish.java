package ClassAndObject.chapter_32.fish;

public class Fish {
    // 속성
    private String sex; // "Male", "Female"
    protected boolean havingPoison; // true 독이 있고, false 독이 없고
    private String StartSpawningDate; // 산란 시작시작
    private String endSpawningDate; // 산란 종료시작
    protected String livingSea;

    // 행위
    void eat (String food){
        System.out.printf(myInfo() + " 는 %s를 먹고 있습니다.\n", food);
    }
    void swim(int meter){
        System.out.println("나는 헤엄칩니다 미터: " + meter);
    }
    void makeCrowd(Fish otherfish){
        System.out.println("나는 다른 물고기와 무리짓습니다.");
    }
    void sleep(){};
    String myInfo(){
        return String.format("물고기 (sex=%s, havingPoison = %b, livingSea = %s)",
                this.sex, this.havingPoison, this.livingSea);
    }

    void printMyInfo(){
        System.out.println(myInfo());
    }

    public void setStartSpawningDate(String startSpawningDate) {
        StartSpawningDate = startSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public void setLivingSea(String livingSea) {
        this.livingSea = livingSea;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isHavingPoison() {
        return havingPoison;
    }

    Fish(){
        System.out.println("부모 물고기가 생성되고 있습니다.");
    }

    public Fish(String sex, boolean havingPoison, String startSpawningDate, String endSpawningDate, String livingSea) {
        this.sex = sex;
        this.havingPoison = havingPoison;
        StartSpawningDate = startSpawningDate;
        this.endSpawningDate = endSpawningDate;
        this.livingSea = livingSea;
    }
}
