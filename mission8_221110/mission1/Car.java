package mission8_221110.mission1;

class Car {
    private static Integer startNo = 1001;
    private Integer carNumber;

//    public Car(Integer carNumber) {
//        this.carNumber = carNumber;
//    }

    public Car() {
        this.carNumber = startNo++;
    }

    public Integer showCarNumber(){
        return this.carNumber;
    }
}
