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

    public void showInfo() {
        String genderStr = "남성";
        if(gender % 2 == 0){
            genderStr = "여성";
        }
        String isMarriedStr = "기혼자";
        if(!isMarried){
            isMarriedStr = "미혼자";
        }

        String message = "이름은 " + name + "이고 성별은 " + genderStr + "이며," + isMarriedStr + "입니다. " +
                "자녀는 " + numberOfChild + "명이 있습니다.";
        System.out.println(message);
    }
    public String toGenderStr() {
        String genderStr = "남성";
        if(this.gender % 2 == 0){
            genderStr = "여성";
        }
        return genderStr;
    }
    public String toMarriedStr() {
        String isMarriedStr = "기혼자";
        if(!isMarried){
            isMarriedStr = "미혼자";
        }
        return isMarriedStr;
    }

    @Override
    public String toString() {
        return String.format("이름은 %s이고 성별은 %s이며 %s입니다. 자녀는 %s명이 있습니다.",
                name, toGenderStr(), toMarriedStr(), numberOfChild);
    }

    public String getName() {
        return name;
    }
}
