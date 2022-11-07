package practice01_221104.modifier01;

import practice01_221104.modifier01.second.Child;
import practice01_221104.modifier01.second.Parent;

public class SamePackage {

    protected String protectedModifier = "Protected는 같은 패키지 안에서 그리고 상속받은 자손 클래스에서도 사용이 가능합니다.";
    String defaultModifier = "(Default)는 같은 패키지까지 허용됩니다.";

    Parent p = new Child("1",1);



    public void printPublicModifer() {
        Everywhere everywhere = new Everywhere();
        System.out.println(everywhere.publicModifier);  //Public 다른 클래스에서 사용
    }

    public void printDefaultModifer() {
        SamePackage samePackage = new SamePackage();
        System.out.println(samePackage.defaultModifier);  //default 같은 클래스 내부에서 사용
    }
}




