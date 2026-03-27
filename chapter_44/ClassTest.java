package ClassAndObject.chapter_44;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Customer customer = new Customer("민철");
        // 클래스 가져오기
        Class clazz = customer.getClass();
        // 같은 방법: Class clazz = Customer.class;

        // 생성자 가져오기
        // .getConstructors는 모든 contructor를 가져옴
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        // 메소드 가져오기
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        } // object method도 같이 출력

        // 필드 가져오기
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        } // public만 출력
        // Field[] fields = clazz.getDeclaredFields(); ->모두 출력

        ///
        // 특정 타입의 constructor를 가져오고 어떤 constructor를 가져올지는 그 constructor의 parameter의 타입을 명시함으로 정의
        // .newInstance는 인스턴스를 만듬 (object로 생성)
        Customer customer2 = (Customer) clazz.getConstructor(String.class).newInstance("민철");
        // Object class로 저장되는 것이 기본이라서 다운캐스팅 필요
        System.out.println(customer2); // Customer(customerID=Customer2, name=민철, customerGrade=SILVER, bonusPoint=0) -> public Customer(String name)를 가져옴
    }
}
