package algorithm;

import java.util.Arrays;

public class JavaProblem02 {
    public static int[] solution01(int[] num_list) {
        int answerLength = num_list.length-5;
        int[] answer = new int[answerLength];
        Arrays.sort(num_list);
        System.arraycopy(num_list, 5, answer, 0, answerLength);
        return answer;
    }

    public static int solution02(int[] num_list) {
        int answerSquare = 0;
        int answer = 0;

        answer = Arrays.stream(num_list).reduce(1, (a,b)-> a*b);
        answerSquare = Arrays.stream(num_list).sum();
        answerSquare *= answerSquare;

        if(answer<answerSquare){
            return 1;
        }
        return 0;
    }

    public static int solution03(int n) {
        int answer = 0;

        if(n%2==0){
            for (int i=0; i<=n; i+=2){
                answer += i*i;
            }
            return answer;
        }

        for(int i=1; i<=n; i+=2){
            System.out.println(i);
            answer += i;
        }

        return answer;
    }

    public static String solution04(String my_string, int k) {
        String answer = "";

        for(int i=1; i<=k; i++){
            answer += my_string;
        }
        return answer;
    }

    public static int solution05(int a, int b) {
        String numA = ""+a;
        String numB = ""+b;

        String AB = numA+numB;
        String BA = numB+numA;

        if (Integer.parseInt(AB) >= Integer.parseInt(BA)){
            return Integer.parseInt(AB);
        }

        return Integer.parseInt(BA);
    }


    public static void main(String[] args){
        int[] sampleArra01 = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] sampleArra02 = {5, 7, 8, 3};
        int sampleInt = 10;
        int k = 10;
        String stringN = "love";
        int a = 89;
        int b = 8;

        int[] result01 = solution01(sampleArra01);
        System.out.println(Arrays.toString(result01));

        int result02 = solution02(sampleArra02);
        System.out.println(result02);

        int result03 = solution03(sampleInt);
        System.out.println(result03);

        String result04 = solution04(stringN,k);
        System.out.println(result04);

        int result05 = solution05(a,b);
        System.out.println(result05);

    }
}
