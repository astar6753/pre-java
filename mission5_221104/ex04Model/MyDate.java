package mission5_221104.ex04Model;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String isValid() {
        if(this.year%4 == 0 && this.year%100!=0 || this.year%400==0) {
            return this.year + "년" + this.month + "월 "+ this.day +"일은 유효하지 않은 날짜입니다.";
        }
        return this.year + "년" + this.month + "월 "+ this.day +"일은 유효한 날짜입니다.";
    }
}
