package mission8_221110.mission2.controller;

import mission8_221110.mission2.model.Subject;
import mission8_221110.mission2.model.TextResource;
import mission8_221110.mission2.service.*;

import java.io.*;
import java.util.*;

public class ResourceController {
    private final String RESOURCE_PATH = "C:/Users/java-test/input.txt"; //리소스 경로 고정값
    private final String ENCODING = "UTF8";
    private final int firstSubjectColumnIndex = 3;     //리소스 파일에서 첫 과목 컬럼 인덱스
    public static String[][] resources;
    public static List<Subject> subjectInfo = new ArrayList<>();

    private final FileService fileService = FileService.getInstance();
    private final StudentService studentService = StudentService.getInstance();
    private final ScoreService scoreService = ScoreService.getInstance();

    //서비스 호출해서 파일 읽고 입출력전용 model로 static 변수에 저장
    public void readResourceFile() throws IOException {
        BufferedReader br = FileService.readFile(RESOURCE_PATH, ENCODING);
        this.resources = FileService.readResource(br, RESOURCE_PATH);
        this.subjectInfo = FileService.createSubjectInfo(resources[0], firstSubjectColumnIndex);
        //서브젝트리스트에서 맞는 서브젝트넘버를 조회해서 반환 
//        StudentService.createStudentInfo(resources);
//        ScoreService.createScoreInfo(resources);
        br.close();
    }

}
