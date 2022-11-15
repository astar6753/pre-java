package mission8_221110.mission2.model;

public class Score {
    private Integer studentNo;
    private Integer subjectNo;
    private Integer point;

    private Score(Integer studentNo, Integer subjectNo, Integer point) {
        this.studentNo = studentNo;
        this.subjectNo = subjectNo;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Score{" +
                "studentNo=" + studentNo +
                ", subjectNo=" + subjectNo +
                ", point=" + point +
                '}';
    }
}
