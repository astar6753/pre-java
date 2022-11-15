package mission8_221110.mission2.service;

public class StudentService {
    private static StudentService studentService = new StudentService();

    private StudentService() {
    }

    public static StudentService getInstance() {
        return studentService;
    }
}
