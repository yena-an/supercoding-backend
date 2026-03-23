package ClassAndObject.chapter_45;

public class PrintSituation {
    public static void main(String[] args) {
//        // 1. 기획: String을 출력하는 프린터 만들어주세요~
//        GeneralPrint print = new GeneralPrint();
//        print.setMaterial("설계도");
//
//        String material = (String) print.getMaterial();
//        print.printMyInfo(); // 설계도를 출력합니다.
//
//        // 1. 기획: Integer을 출력하는 프린터 만들어주세요~
//        GeneralPrint print2 = new GeneralPrint();
//        print2.setMaterial(1235); // 1235를 출력합니다.
//
//        Integer intMaterial = (Integer) print2.getMaterial();
//        print2.printMyInfo();
//
//        // 1. 기획: Boolean을 출력하는 프린터 만들어주세요~
//        GeneralPrint print3 = new GeneralPrint();
//        print3.setMaterial(true);
//
//        Boolean booleanMaterial = (Boolean) print3.getMaterial();
//        print3.printMyInfo(); // true를 출력합니다.

        // Generic 사용
        // 1. 기획: String을 출력하는 프린터 만들어주세요~
        GeneralPrint<String> print = new GeneralPrint<>();
        print.setMaterial("설계도");

        String material = (String) print.getMaterial();
        print.printMyInfo();

        // 1. 기획: Integer을 출력하는 프린터 만들어주세요~
        GeneralPrint<Integer> print2 = new GeneralPrint<Integer>();
        print2.setMaterial(1235);

        Integer intMaterial = (Integer) print2.getMaterial();
        print2.printMyInfo();

        // 1. 기획: Boolean을 출력하는 프린터 만들어주세요~
        GeneralPrint<Boolean> print3 = new GeneralPrint<Boolean>();
        print3.setMaterial(true);

        Boolean booleanMaterial = (Boolean) print3.getMaterial();
        print3.printMyInfo();
    }
}
