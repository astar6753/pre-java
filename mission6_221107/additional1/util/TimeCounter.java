package mission6_221107.additional1.util;

import java.util.Timer;
import java.util.TimerTask;

public class TimeCounter {
    // 카운트다운용 타이머
    // https://kkh0977.tistory.com/83

    int count = 5;

    public void countDown() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run() {
                System.out.print("["+count+"]");
                count--;
                if(count < 1 ){
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 1000, 1000); //실행 Task, 1초뒤 실행, 1초마다 반복
    }
}

