package practice01_221104.modifier01;

public class OnlyHere {
    
    private String privateModifer = "private는 오직 선언한 클래스 내부에서만 사용 가능합니다.";




    public void printPivateModifer() {
        System.out.println(privateModifer);     //클래스 내부에서 직접접근
    }

    public static void main(String[] args) {
        OnlyHere onlyHere = new OnlyHere();
        System.out.println(onlyHere.privateModifer);        //클래스 내부에서 직접접근
    }


    //메서드를 이용한 접근은
    String getPrivateModifer() {
        return privateModifer;
    }

    public void setPrivateModifer(String privateModifer) {
        this.privateModifer = privateModifer;
    }
}
