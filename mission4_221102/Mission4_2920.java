package mission4_221102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Mission4_2920 {
    //백준#2920
    //음계

    //문제
    //다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
    //1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
    //연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
    //입력
    //첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
    //출력
    //첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String question = br.readLine();
        System.out.println(toAnswer(question));
        br.close();
    }

    public enum Answer {
        ASCENDING("ascending", Arrays.asList(1,2,3,4,5,6,7,8)),
        DESCENDING("descending", Arrays.asList(8,7,6,5,4,3,2,1)),
        MIXED("mixed",null),
        ;
        
        private final String msg;   //출력메세지
        private final List<Integer> list;   //조건
        
        Answer(String msg, List<Integer> list) {
            this.msg = msg;
            this.list = list;
        }
    }
    public static String toAnswer(String question) {
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(question);
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        if(list.equals(Answer.ASCENDING.list)){
            return Answer.ASCENDING.msg;
        }
        if(list.equals(Answer.DESCENDING.list)){
            return Answer.DESCENDING.msg;
        }
        return Answer.MIXED.msg;
    }
}
