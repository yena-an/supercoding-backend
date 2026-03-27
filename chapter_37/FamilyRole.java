package ClassAndObject.chapter_37;

public interface FamilyRole extends HusbandRole, DaddyRole{

    @Override
    default void sayLoveEvery() {
        DaddyRole.super.sayLoveEvery();
        HusbandRole.super.sayLoveEvery();
    }

}
