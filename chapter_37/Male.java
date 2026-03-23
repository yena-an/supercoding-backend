package ClassAndObject.chapter_37;

public class Male extends FamilyMan implements EmployRole, FamilyRole{
    // 속성
    private int age;
    private String job;

    // role을 인터페이스로 구현
    @Override
    public void workTogether(EmployRole employRole) {
        String name = employRole.getName();
        System.out.println(name + " 인 직장동료와 업무를 하고 있습니다.");

    }

    @Override
    public String getName() {
        return this.name;
    }

    public Male(String name) {
        this.name = name;
    }
}
