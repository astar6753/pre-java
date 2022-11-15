package mission8_221110.mission2.view;

import mission8_221110.mission2.model.Student;

public class TextContentView {
    private static TextContentView textContentView = new TextContentView();

    private TextContentView() {
    }

    public static TextContentView getInstance() {
        return textContentView;
    }

    public String buildResultScoreMessage(Student student) {
        return String.format("%s학생은 %d과목을 수강했습니다.\n총점은 %d점이고 평균은 %d점입니다.",
                "");
//                student.getStudentName(), student.getScoreList().size(), student.sumScore(), student.avgScore());
    }
}
