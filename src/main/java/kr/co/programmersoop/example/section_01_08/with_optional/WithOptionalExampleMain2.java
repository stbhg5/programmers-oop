package kr.co.programmersoop.example.section_01_08.with_optional;

public class WithOptionalExampleMain2 {

    public static void main(String[] args) {
        // 이전 코드보다 간결한 코드
        
        MapRepository mapRepository = new MapRepository();
        // 비어있는 값이 들어올 경우에만 orElseThrow() 메서드의 람다 표현식 실행, 비어있지 않은 값이 들어오면 string 반환
        String string = mapRepository.getOptionalValue("NOT_EXIST_KEY").orElseThrow(
                () -> {throw new RuntimeException("키가 존재하지 않습니다.");}
        );

        System.out.println(string.toUpperCase());
    }

}