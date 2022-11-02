package additionalMission_221101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mission1_A1 {
    //1. 중간 숫자 구하기 (Scanner 연습)
    //Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력해주세요!
    //(평균값을 구하는 것이 아니에요~ 그냥 중간에 배치되는 숫자를 출력해주세요!)

    public static void main(String[] args) {
        System.out.print("정수 3개 입력 >>");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.remove(Collections.min(list));
        list.remove(Collections.max(list));
        int output = list.get(0);

        System.out.println("중간 값은 "+output);
        input.close();
    }
}
