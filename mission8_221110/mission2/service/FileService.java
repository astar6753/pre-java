package mission8_221110.mission2.service;

import mission8_221110.mission2.model.Student;
import mission8_221110.mission2.model.Subject;
import mission8_221110.mission2.model.TextResource;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    private static FileService fileService = new FileService();

    private FileService() {
    }

    public static FileService getInstance() {
        return fileService;
    }

    public static BufferedReader readFile(String filePath, String encoding) throws IOException {
        Path path = Paths.get(filePath);
        return new BufferedReader(new InputStreamReader(new FileInputStream(path.toString()), encoding));
    }

    //리소스 파일 읽고 탭 기준으로 떼어서 2차원 배열로 반환
    public static String[][] readResource(BufferedReader br, String filePath) throws IOException {
        Integer lineCount = (int)Files.lines(Paths.get(filePath)).count();

        String[][] resources = new String[lineCount][];
        for (int i = 0; i < lineCount; i++) {
            String line = br.readLine();
            if (line == null) break;
            resources[i] = line.split("\t",-1);
        }
        br.close();

        return resources;
    }


    //old //txt입출력 전용 model로 읽는 방식 >> 과목이 추가될 떄 (열이 추가될 때마다) model을 변경해야 함
    public static List<TextResource> OLDreadResource(BufferedReader br, String filePath) throws IOException {
        List<TextResource> resources = new ArrayList<>();

        br.readLine(); //첫 줄 버림
        while (true) {
            String line = br.readLine();
            if(line==null) { break; }
            String[] elem = line.split("\t",-1);
            TextResource resource = new TextResource(elem[0], elem[1], elem[2], elem[3], elem[4], elem[5]);
            resources.add(resource);
        }

        return resources;
    }
    
    //리소스 파일의 첫 줄에서 과목명 뗴어서 리스트로 반환
    public static List<Subject> createSubjectInfo(String[] resources, int firstSubjectColumnIndex) {
        List<Subject> subjectInfo = new ArrayList<>();

        for (int i = firstSubjectColumnIndex; i < resources.length; i++) {
            subjectInfo.add(new Subject(resources[i]));
        }

        return subjectInfo;
    }

    public static List<Student> createStudentInfo(String[][] resources, List<Subject> subjectInfo) {
        List<Student> studentInfo = new ArrayList<>();
        for (Subject subject : subjectInfo) {
//            subject
        }
        for (String[] line : resources) {
            studentInfo.add(new Student(Integer.parseInt(line[0]), line[1], 1));
        }



        return studentInfo;
    }
}
