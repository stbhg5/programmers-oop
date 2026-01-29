package kr.co.programmersoop.example.section_02_04.c_programmers_coding_test_example;

import java.util.ArrayList;
import java.util.List;

public class FindByLevelMain {
    public static void main(String[] args) {
        String idToFind = "real_user1"; // 사용자가 가입하려고 하는 ID

        // 이미 가입된 유저들
        List<User> list = new ArrayList<>();
        list.add(new User("real_user1", "송진성"));
        list.add(new User("real_user2", "진트"));
        list.add(new User("real_user3", "jint"));

        // 아이디 중복 검사
        list.stream()
                .filter(user -> user.sameId(idToFind))
                .findAny()
                .ifPresentOrElse(
                    user -> { throw new RuntimeException(idToFind + "는 이미 존재하는 아이디입니다."); }
                  , () -> { System.out.println(idToFind + "는 사용할 수 있는 아이디입니다."); }
                );
    }
}
