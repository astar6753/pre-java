package mission6_221107.mission3;

import java.util.ArrayList;

public class Maze {
    //3 . 미로 찾기 문제를 구현하세요 (이차원 배열 활용)
    //입구에서 출구로 통하는 길을 찾는 미로 찾기 문제
    //배열을 활용하여 문제를 해결할 수 있음
    //출구 탐색을 위해 BFS나 DFS로 해결할 수 있음
    //아래 그림에서 Enter 에서 Exit을 찾아가는 path의 좌표를 출력하세요
    //움직 일 수 있는 방향의 예: ( 2,2 ) 위치에서 볼 수 있는 도달 가능 위치는 N(2,1), E(3,2), S(2,3), W(1,2)

    public static void main(String[] args) {

        // 미로 0=길 1=벽
        int[][] myMaze = {
            {0, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 0}
        };

        System.out.println(myMaze[0][0]);
        System.out.println(myMaze[1][0]); // blocked
        System.out.println(myMaze[0][1]); // pass
        System.out.println(myMaze[0][2]); // blocked

        // 인접행렬 배열로 전환
        int[][] graph = {
                {},
                {},
                {}
        };



    }
}
