public class JavaProblem03 {
    public static int solution01(int number, int n, int m) {
        int answer = 0;

        if (number%n==0 &number%m==0){
            return 1;
        }

        return answer;
    }

    public static void main(String[] args){
        int result = solution01(55,10,5);
        System.out.println(result);
    }
}
