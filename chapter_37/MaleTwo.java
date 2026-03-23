package ClassAndObject.chapter_37;

public class MaleTwo extends FamilyMan implements FamilyRole, EmployRole{

    @Override
    public void workTogether(EmployRole employRole) {
        String name = employRole.getName();
        System.out.println(name + " 인 직장동료와 업무를 하고 있습니다.");

    }

    @Override
    public String getName() {
        return this.name;
    }

    public MaleTwo(String name) {
        this.name = name;
    }
}
