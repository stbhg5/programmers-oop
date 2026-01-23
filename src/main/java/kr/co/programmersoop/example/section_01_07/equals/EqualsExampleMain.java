package kr.co.programmersoop.example.section_01_07.equals;

public class EqualsExampleMain {
    public static void main(String[] args) {
        SomeObject sameObject1 = new SomeObject(1, "programmers");
        SomeObject sameObject2 = new SomeObject(1, "programmers");
        SomeObject sameObject3 = sameObject1;

        SomeObject anotherObject = new SomeObject(100, "foo");

        // 동일성 비교 -> false
        System.out.println(sameObject1 == sameObject2);

        // 동일성 비교 -> true
        // 같은 인스턴스를 가리키기 때문
        System.out.println(sameObject1 == sameObject3);

        // 동등성 비교 -> true
        System.out.println(sameObject1.equals(sameObject2));

        // 동등성 비교 -> true
        System.out.println(sameObject1.equals(sameObject3));

        // 동등성 비교 -> false
        System.out.println(anotherObject.equals(sameObject1));
    }
}
