package additionalMission_221101;

import java.util.Scanner;

public class Mission2 {
    //2. 369 게임!
    //간단한 369게임을 만들어 볼까요?
    //1~99까지의 수를 입력받고, 정수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"을 출력하고 두 개 있는 경
    //우는 "박수짝짝"을 출력하도록 구현해주세요!
    //예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 됩니다!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("1~99 사이의 정수를 입력하시오>>");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("Quit")){
                break;
            }

            Integer number = Integer.parseInt(input);

            if(number%10%3==0){
                System.out.print("박수짝");
                if(number/10!=0 && number/10%3==0){
                    System.out.print("짝");
                }
            }
            System.out.println("");
        }

        System.out.println("게임을 종료합니다.");
        sc.close();
    }
}
