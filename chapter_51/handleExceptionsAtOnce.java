package ClassAndObject.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class handleExceptionsAtOnce {
    public static void main(String[] args) {
        try {
            printCsvFile("src/ClassAndObject/chapter_51/test.csv");
            printTextFile("src/ClassAndObject/chapter_51/test.txt");
        }catch (IOException e){
            System.out.println("fileName에 의한 IO exception이 발생합니다.");
            e.printStackTrace();
        }
    }

    public static void printTextFile(String filename) throws IOException {
        if (!filename.contains(".txt")){
            System.out.println("txt 파일이 아닙니다.");
            return;
        }

        FileInputStream fs = new FileInputStream(filename);


        int i;
        while((i = fs.read()) != -1){
            System.out.write(i);
        }
    }

    public static void printCsvFile(String filename) throws IOException{
        if (!filename.contains(".csv")){
            System.out.println("csv 파일이 아닙니다.");
            return;
        }

        FileInputStream fs = new FileInputStream(filename);


        int i;
        while((i = fs.read()) != -1){
            System.out.write(i);
        }
    }

}
