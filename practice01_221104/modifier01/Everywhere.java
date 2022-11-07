package practice01_221104.modifier01;

import practice01_221104.modifier01.first.DiffrentPackage;

public class Everywhere {

    public String publicModifier = "Public은 패키지, 클래스의 제약이 없습니다.";



    public void printPublicModifer() {
        Everywhere everywhere = new Everywhere();
        System.out.println(everywhere.publicModifier);  //Public 같은 클래스 내부에서 사용
    }

    public void printDefaultModiferInSamePackage() {
        SamePackage samePackage = new SamePackage();
        System.out.println(samePackage.protectedModifier);  //default 같은 클래스 내부에서 사용
        System.out.println(samePackage.defaultModifier);  //default 같은 클래스 내부에서 사용
    }

    public void printDefaultModiferInDiffrentPackage() {
        DiffrentPackage diffrentPackage = new DiffrentPackage();
//        System.out.println(diffrentPackage.defaultModifier);  //Default 다른 패키지에서 사용 > 에러
    }

    public void printProtectedModifier() {
        OnlyHere onlyHere = new OnlyHere();
//        System.out.println(onlyHere.protectedModifier);    //Protected
    }

    public void printDefaultModiferInDiffrentClass() {
        OnlyHere onlyHere = new OnlyHere();
//        System.out.println(onlyHere.privateModifer);    //Private
    }

}
