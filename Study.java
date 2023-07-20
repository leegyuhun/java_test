import java.util.ArrayList;
import java.util.Collections;

public class Study{
    double solution3(int[] arr) {
        double sum = 0;
        double answer = 0;
        for (int i : arr){
            sum += i;
        }
        answer = sum / arr.length;
        System.out.println(answer);
        return answer;
    }

    String EvenOrOdd(int num){
        // return num % 2 == 0 ? "Even": "Odd";
        String answer = "";
        if (num % 2 ==0) {
            answer = "Odd";
        } else{
            answer ="Even";
        }
        return answer;
    }

    int sumN(int n){
        int sum = 0;
        String str = Integer.toString(n);
        for (char c : str.toCharArray()){
            sum += Integer.parseInt(Character.toString(c));
        }
        return sum;
    }
    public static void main(String args[]){
        int a1 = 3;
        String a1Str = String.format("%02d", a1);
        a1 = 12;
        a1Str = String.format("%02d", a1);

        a1 = 9;
        a1Str = String.format("%02d", a1);

        a1 = 11;
        a1Str = String.format("%02d", a1);

        String upperTest = "UA08";
        upperTest = upperTest.toUpperCase();

        upperTest = "ua08".toUpperCase();

        upperTest = "uA08".toUpperCase();

        upperTest = "Ua08".toUpperCase();    

        Study study = new Study();

        int [] arr = { 1,2,3,4,5,6 };
        System.out.println(study.solution3(arr));
    }

    public static String solution2(int num){

        // return num % 2 == 0 ? "Even": "Odd";
        String answer = "";
        if (num % 2 ==0) {
            answer = "Odd";
        } else{
            answer ="Even";
        }
        return answer;
    }
    /*  */
    public static int solution1(int n){
        int answer = 0;
        for(int i=1; i<n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    /* 스킬체크 테스트 Lv 1 (1/2)*/
    public static String solution(String s){

        ArrayList<String> strList = new ArrayList<String>();

        for (char c:s.toCharArray()){
            String tmp = "" + c;
            strList.add(tmp);
        }
        Collections.sort(strList, Collections.reverseOrder());
        String answer = "";

        for (String str:strList){
            answer += str;
        }

        return answer;
    }

    /* 스킬체크 테스트 Lv 1 (2/2)*/
    public static int solution(int[][] sizes){
        for (int i = 0; i < sizes.length; i++){
            System.err.println(sizes[i][0] * sizes[i][1]);
            System.err.println(sizes[i][0] * sizes[i][1]);
            // for(int j = 0; j < sizes[i].length; j++){
            //     System.err.println("arr[" + i + "][" + j + "] = " + sizes[i][j]);
            // }
        }
        int answer = 0;
        return answer;
    }
}