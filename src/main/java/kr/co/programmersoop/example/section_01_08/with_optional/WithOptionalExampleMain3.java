package kr.co.programmersoop.example.section_01_08.with_optional;

import java.util.Optional;

public class WithOptionalExampleMain3 {

    public static void main(String[] args) {
        // Optional의 정적 팩토리 메서드 사용
        
        MapRepository mapRepository = new MapRepository();
        // null이 들어올지 안 들어올지 모르는 값을 Optional.ofNullable() 매개변수로 넣기 -> 매개변수를 가지고 Optional 객체 생성
        String string = Optional.ofNullable(mapRepository.getValue("NOT_EXIST_KEY"))
                .orElseThrow(RuntimeException::new); // 생성자 참조

        System.out.println(string.toUpperCase());
    }

}
