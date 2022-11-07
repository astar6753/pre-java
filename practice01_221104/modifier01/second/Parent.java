package practice01_221104.modifier01.second;

import java.util.ArrayList;

public class Parent {

    protected String protectedModifier = "Protected는 상속받은 자손 클래스에서도 사용이 가능합니다.";
    public Integer a = 1;


    public Parent(String protectedModifier, Integer a) {
        this.protectedModifier = protectedModifier;
        this.a = a;
    }
}
