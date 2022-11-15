package mission8_221110.mission2;

import mission8_221110.mission2.controller.ResourceController;
import mission8_221110.mission2.controller.MenuController;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ResourceController resourceController = new ResourceController();
        resourceController.readResourceFile();
        System.out.println(Arrays.toString(resourceController.resources[0]));
        System.out.println(Arrays.toString(resourceController.resources[1]));
        System.out.println(Arrays.toString(resourceController.resources[2]));
        System.out.println(resourceController.subjectInfo);


        MenuController menuController = new MenuController();
        Scanner sc = new Scanner(System.in);
        menuController.callMainMenu(sc);



//        String[][] lines = a.splitLine();
//        System.out.println(Arrays.toString(lines[4]));

        // 파일서비스 - 입출력
        // 학생서비스
        // 성적서비스

        //input.txt db저장 read/write형태는 고정!!!!! 아놔
        //이름	학번	  전공과목	국어	수학	영어
        //Kim	1001	수학	100	100
        //Lee	1002	국어	55	55	100


        // 학생테이블
        // 이름 학번 전공

        // 과목테이블
        // 과목이름

        // 성적테이블
        // 학생이름 과목이름 성적


        //메인 while처리 사용자 입력 받아서 컨트롤러 호출
        //프로그램 로딩 >>FileCon>>FileSer>> sudentInfo/scoreInfo읽기 처리
        //1성적입력
            //
            // 학생선택(학번입력/학생조회) >> (과목,성적)
        //2조회
            // 학생조회 >> 학생정보(이름,과목,학번) 리스트 조회
            // 성적조회 >> 학생선택(학번입력/학생조회)
            // 파일출력(result) // 학생정보/성적정보
        //3수정
            // 학번입력 >> 출력&(이름,전공,성적) >> 콘솔입력(이름,전공) 성적(과목선택) 성적
        //4삭제

//        String fileName = br.readLine();
//        FileService.readFile(fileName);

        //위 구현을 다 하신 경우 추가적으로 콘솔에서 성적을 입력, 수정 할 수 있게 하고 이를 파일로 다시 저장하는 기능도 구현해보세요
        //학생이 추가되면 학번은 자동생성합니다.
    }
}
