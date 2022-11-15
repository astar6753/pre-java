package mission8_221110.mission2.model;

public class Student {
    private static Integer startNo = 1001;
    private Integer studentNo;      //학번
    private String studentName;     //이름
    private Integer majorNo;          //전공 == 과목번호

    public Student(String studentName) {
        this.studentNo = startNo++;
        this.studentName = studentName;
    }

    public Student(Integer studentNo, String studentName, Integer subjectNo) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.majorNo = subjectNo;
        this.startNo = studentNo+1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", studentName='" + studentName + '\'' +
                ", majorNo=" + majorNo +
                '}';
    }
}
