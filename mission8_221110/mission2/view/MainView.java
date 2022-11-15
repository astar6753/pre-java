package mission8_221110.mission2.view;

import mission8_221110.mission2.service.FileService;

import java.util.Scanner;

public class MainView {
    private static MainView mainView = new MainView();

    private final String rowBars = "==================================================";
    private final String mainMenu = "==================성적 처리 시스템==================\n1.학생정보 2.과목정보 3.성적정보 Q.종료\n>> ";
    private final String errorInvalidInput = "잘못된 입력입니다. 다시 입력해주세요. \n>> ";
    private final String studentMenu = "====================학생 정보====================";
    private final String subjectMenu = "====================과목 정보====================";
    private final String scoreMenu = "====================성적 정보====================";
    private final String subMenu ="\n1.추가 2.조회 3.수정 4.삭제 Q.상위메뉴로\n>> ";

    private MainView() {
    }

    public static MainView getInstance() {
        return mainView;
    }

    public void printMainMenu() {
        System.out.print(mainMenu);
    }

    public void printErrorInvalidInput() {
        System.out.print(errorInvalidInput);
    }

    public void printStudentMenu() {
        System.out.print(studentMenu);
        System.out.print(subMenu);
    }

}
