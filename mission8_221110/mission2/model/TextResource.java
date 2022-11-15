package mission8_221110.mission2.model;

import java.util.ArrayList;
import java.util.List;

//txt 입출력용 모델
public class TextResource {
    private String studentNo;
    private String studentName;
    private String subjectName;
    private String korPoint;
    private String engPoint;
    private String mathPoint;

    public TextResource(String studentNo, String studentName, String subjectName, String korPoint, String engPoint, String mathPoint) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.subjectName = subjectName;
        this.korPoint = korPoint;
        this.engPoint = engPoint;
        this.mathPoint = mathPoint;
    }

    public Student toStudent() {
        return null;
    }

    private List<Score> toScore() {
        List<Score> list = new ArrayList<>();
        if(this.korPoint!=null) {

        }
        if(this.engPoint!=null) {

        }
        if(this.mathPoint!=null) {

        }
        return list;
    }
}
