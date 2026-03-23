package ClassAndObject.chapter_37;

public class InterfaceTest {
    public static void main(String[] args) {
        // Male role 3개 (같은 객체를 타입만 바꿔서 진행)
        HusbandRole male = new Male("철수");
        Wife wife = new Female("아이유");

        male.sayLoveEvery(); // 우리 가족 사랑합니다~ => 우리 아기 사랑합니다~ 우리 아내 사랑합니다~
        male.takeCareWife(wife); // 아이유 인 아내를 성심성의껏 케어합니다.

        // 아빠
        DaddyRole maleDaddy = (DaddyRole) male;
        Baby baby = new Baby("정우성");
        maleDaddy.educateBaby(baby); // 정우성 아기를 열심히 교육하고 있습니다.
        maleDaddy.sayLoveEvery(); // 우리 가족 사랑합니다~

        // 회사원
        EmployRole maleEmployee = (EmployRole) maleDaddy;
        EmployRole femaleEmployee = new Female("김채원");
        EmployRole maleEmployeeTwo = new MaleTwo("민철");

        maleEmployee.workTogether(femaleEmployee); // 김채원 인 직장동료와 업무를 하고 있습니다.
        maleEmployee.workTogether(maleEmployeeTwo); // 민철 인 직장동료와 업무를 하고 있습니다.

    }
}
