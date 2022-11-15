package mission9_221114.mission1stretagy;

public class Member {
    private String memberName;
    private Double bonusPoint;
    private Grade grade;

    public String getMemberName() {
        return memberName;
    }

    public Grade getGrade() {
        return grade;
    }

    enum Grade { RED , PLATINUM, DIAMOND }

    public Member(String memberName, Double bonusPoint, Grade grade) {
        this.memberName = memberName;
        this.bonusPoint = bonusPoint;
        this.grade = grade;
    }
}
