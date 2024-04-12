package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaProblem01 {

    /*
        List<String> word = Arrays.asList(“apple”, “banana”, “apple”);
        Q. 해당 자료형을 Set<String> 으로 변경 하시오
        - stream 을 활용한 방식 1개
        - stream 을 활용하지 않은 방식 1개
    */
    static void listToSet() {
        List<String> words = Arrays.asList("apple", "banana", "apple");

        Set<String> fruitWords = new HashSet<>(words);

        System.out.println("------------ stream 사용 X ------------------");

        for (int i = 0; i < fruitWords.size(); i++) {
            System.out.println(fruitWords.toArray()[i]);
        }

        System.out.println("------------ forEach 사용 -------------------");

        fruitWords.forEach(System.out::println);

        System.out.println("-------------- stream 사용 ------------------");

        Set<String> streamFruit = new HashSet<>(words);
        System.out.println(streamFruit);
    }

    /*
        Q. String a 를 int로 파싱 한뒤 a와 b를 더한 값을 println 으로 출력해주세요
        int b =  302;
    */
    static void intParsing() {
        String a = "123";
        int b = 302;
        int n = Integer.parseInt(a);
        System.out.println("-------------- 문자열 파싱 ------------------");
        System.out.printf("%d 더하기 %d는 \n%d 입니다~!%n", b, n, b + n);
    }
    
    /*
    List<String> word = Arrays.asList(“apple”, “banana”, “tomato”);
    Q. for i 문 for Each 문을 사용해서 print 해보시오
    */

    static void stringFor() {
        List<String> word = Arrays.asList("apple", "banana", "tomato");

        System.out.println("-------------- for문 ---------------------");
        for (int i = 0; i < word.size(); i++) {
            System.out.println(word.get(i));
        }
        System.out.println("-------------- forEach ------------------");
        word.forEach(System.out::println);

    }

    public static void main(String[] args) {
        listToSet();
        intParsing();
        stringFor();
    }

}
