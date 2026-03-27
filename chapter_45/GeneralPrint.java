package ClassAndObject.chapter_45;

public class GeneralPrint<T> {
//    // using object
//    private Object material;
//
//    public void printMyInfo(){
//        System.out.println(material + "를 출력합니다.");
//    }
//
//    public void setMaterial(Object material){
//        this.material = material;
//    }
//
//    public Object getMaterial() {
//        return this.material;
//    }


    //Generic 사용
    private T material;

    public void printMyInfo(){
        System.out.println(material + "를 출력합니다.");
    }

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial() {
        return this.material;
    }
}