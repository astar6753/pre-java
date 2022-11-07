package mission6_221107.practice01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticeArray {
    public static void main(String[] args) {
        String str = "hello";
        char[] charArr = str.toCharArray();
        System.out.println(str);
        System.out.println(charArr);

        int[] arr = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        int[][] total = {arr,arr2};
        int[][] same = {{1,2,3,4,5},{6,7,8,9,10}};
        System.out.println(total[0][0]);
        System.out.println(total[1][0]);
        System.out.println(same[0][0]);
        System.out.println(same[1][0]);
        if(total==same){
            System.out.println("배열 연산자를 통해 직접 비교시 주소값 비교");
        }
        if(Arrays.equals(arr,arr2)){
            System.out.println("Arrays의 equals메소드는 배열의 값 순서까지 모두 비교해준다.");
        }
        if(Arrays.equals(total,same)){
            System.out.println("2차원 배열의 경우 deepEquals메소드를 사용한다.");
        }
        if(Arrays.deepEquals(total,same)){
            System.out.println("2차원 배열의 경우 deepEquals메소드를 사용한다.");
        }

        int[] sortArr = {1,3,4,2,1,5,6,9,7,5};
        Arrays.sort(sortArr);
        System.out.println("Arrays.sort : "+Arrays.toString(sortArr));
//        Arrays.sort(sortArr, Collections.reverseOrder());
//        int 불편해!!!!! 배열불편해!!!! AraayList가 짱이야!!!!

        System.out.println("Arrays.sort : "+Arrays.toString(sortArr));



        Integer[] arrInteger = {1,2,3,4,5,6};
        List<Integer> list = Arrays.asList(arrInteger);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
