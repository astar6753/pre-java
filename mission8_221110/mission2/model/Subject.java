package mission8_221110.mission2.model;

public class Subject {
    private static Integer startNo = 1;
    private Integer subjectNo;
    private String subjectName;

    public Subject(String subjectName) {
        this.subjectNo = startNo++;
        this.subjectName = subjectName;
    }

    public Subject(Integer subjectNo, String subjectName) {
        this.subjectNo = subjectNo;
        this.subjectName = subjectName;
        this.startNo = subjectNo+1;
    }

    public Integer findSubjectNoBy(String subjectName) {
        subjectName.equals(this.subjectName);
        return this.subjectNo;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectNo=" + subjectNo +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
