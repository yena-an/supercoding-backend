package ClassAndObject.chapter_27.packageTwo;

public class Teacher {

    // 학교 정보
    String schoolName;

    // 담당 과목
    Subject subject;

    // 기본 정보
    private String name;
    String gender;

    // 행위
    void teach(Student student, String subjectName){
        // TODO: 나중에 구현
        String studentName = student.name;
        System.out.printf("선생: %s 학생에게 %s 과목을 가르치고 있습니다.", studentName, subjectName);
    }

    Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode, String pSchoolName){
        name = pName;
        gender = pGender;
        Subject newSubject = new Subject();
        newSubject.setSubjectName(pSubjectName);
        newSubject.setSubjectCode(pSubjectCode);
        schoolName = pSchoolName;

    }

    // getter
    public String getName(){
        return name;
    }
}
