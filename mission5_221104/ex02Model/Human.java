package mission5_221104.ex02Model;


public class Human {
    private String name;
    private Integer age;
    private Integer gender;         //성별 {1,2,3,4} - 홀수 남성 짝수 여성
    private Boolean isMarried;      //ture 기혼 false 미혼
    private Integer numberOfChild;

    public Human(String name, Integer age, Integer gender, Boolean isMarried, Integer numberOfChild) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.numberOfChild = numberOfChild;
    }

    private String toGenderStr() {
        if(this.gender%2 == 0){
            return "여성";
        }
        return "남성";
    }

    private String toMarriedStr() {
        if(!isMarried){
            return "미혼";
        }
        return "기혼";
    }

    @Override
    public String toString() {
        return String.format("이름은 %s이고 나이는 %s세 입니다. 성별은 %s이며 %s자입니다. 자녀는 %s명이 있습니다.",
                name, age, toGenderStr(), toMarriedStr(), numberOfChild);
    }
}