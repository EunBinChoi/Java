package assignment5;

import application_exception.InvalidNumberRangeException;
import assignment4.AssignFourMain;

import java.util.Locale;
import java.util.Scanner;

public class AssignFiveMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // Q1. 소문자, 대문자, e(E) 문자
//        String str = inputString("문자열을 입력하시오 : ");
//        int lowerLetterCnt = countLetter(str, 'a', 'z');
//        int upperLetterCnt = countLetter(str, 'A', 'Z');
//        int eLetterCnt = countLetter(str.toLowerCase(), 'e', 'e');
//        System.out.println("소문자의 개수 : " + lowerLetterCnt);
//        System.out.println("대문자의 개수 : " + upperLetterCnt);
//        System.out.println("문자 E(e)의 개수 : " + eLetterCnt);


        ////////////////////////////////////////////////////////
        // Q2. 그룹 채팅방
//        String msg = inputString("메시지를 입력하시오 : ");

        // 1) 변환된 문자열을 반환함
//        String encodeMsg = encodeMessage(msg);
//        System.out.println("encode msg : "  + encodeMsg);
//        System.out.println("original : " + msg);


        // 2) 위의 함수를 연산자의 특성을 이용해서 짧게 구현
//        encodeMsg = useOperatorPropForEncodeMessage(msg);
//        System.out.println("encode msg : "  + encodeMsg);
//        System.out.println("original : " + msg);


        // 3) 위의 함수를 자바 라이브러리를 이용해서 최대한 짧게 구현
//        encodeMsg = useJavaAPIForEncodeMessage(msg);
//        System.out.println("encode msg : "  + encodeMsg);
//        System.out.println("original : " + msg);

        ////////////////////////////////////////////////////////
        // Q3. 문자열 substring
        String target = inputString("자를 문자열을 입력하시오: ");
        int[] indice = inputStartEndIndex(target);
        int start = indice[0];
        int end = indice[1];

        // 직접 구현한 substring 이용
        String subStringRes = substring(target, start, end);
        System.out.println(subStringRes);

        // String 클래스의 substring 이용
        subStringRes = target.substring(start, end);
        System.out.println(subStringRes);
    }
    public static int[] inputStartEndIndex(String target){
        while(true) {
            try {
                int start = AssignFourMain.chooseNumInRange("시작 인덱스 입력하시오 : ", 0, target.length(), 0);
                int end = AssignFourMain.chooseNumInRange("끝 인덱스 입력하시오 : ", 0, target.length(), 0);
                if (start > end) throw new InvalidNumberRangeException();
                return new int[]{start, end};
            } catch(InvalidNumberRangeException e){
                System.out.println(e);
                System.out.println("[ERROR] 시작 인덱스가 끝 인덱스를 벗어났습니다 !");
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static String inputString(String msg){
        System.out.print(msg);
        return sc.nextLine();
    }

    public static String substring(String target, int start, int end){
        String res = "";
        for(int i = start; i < end; i++){
            res += target.charAt(i);
        }
        return res;
    }

    public static String useJavaAPIForEncodeMessage(String str){
        String[] splitBySpace = str.toUpperCase().split(" ");
        String res = "";
        for (int i = 0; i < splitBySpace.length ; i++) {
            for (int j = 0; j < splitBySpace[i].length(); j++) {
                if(j == 0) res += Character.toLowerCase(splitBySpace[i].charAt(j));
                else res += splitBySpace[i].charAt(j);
            }
            res += " "; // space
        }
        return res;
    }

    public static String useOperatorPropForEncodeMessage(String str){
        String copy = new String(str).toUpperCase(); // String은 수정이 불가능하기 때문에
        char[] copyCharArr = copy.toCharArray(); // char array로 변경

        for(int i = 0; i < copyCharArr.length; i++){
            if(i == 0 || copyCharArr[i-1] == ' ') {
//                if (copyCharArr[i] >= 'A' && copyCharArr[i] <= 'Z') { // 대문자인 경우
//                    copyCharArr[i] += ('a' - 'A'); // 소문자로 변경
//                }

                copyCharArr[i] = Character.toLowerCase(copyCharArr[i]);

            }
        }
        return new String(copyCharArr);
    }
    public static String encodeMessage(String str){
        String copy = new String(str); // String은 수정이 불가능하기 때문에
        char[] copyCharArr = copy.toCharArray(); // char array로 변경

        // 해당 문제는 띄어쓰기를 기준으로 단어를 구분하기 때문에 띄어쓰기가 몇번째 인덱스에 나오는지 알아야함
        boolean isSpace = false;
        for(int i = 0; i < copyCharArr.length; i++){
            if(i == 0){
                if(copyCharArr[i] >= 'A' && copyCharArr[i] <= 'Z'){ // 대문자인 경우
                    copyCharArr[i] += ('a' - 'A'); // 소문자로 변경
                }
            }
            else {
                if (isSpace) {
                    if (copyCharArr[i] >= 'A' && copyCharArr[i] <= 'Z') { // 대문자인 경우
                        copyCharArr[i] += ('a' - 'A'); // 소문자로 변경
                    }
                    isSpace = false;
                }
                else {
                    if (copyCharArr[i] >= 'a' && copyCharArr[i] <= 'z') { // 대문자인 경우
                        copyCharArr[i] -= ('a' - 'A'); // 소문자로 변경
                    }
                }
                if (copyCharArr[i] == ' ') {
                    isSpace = true;
                }
            }
        }
        return new String(copyCharArr);
    }


    public static int countLetter(String str, char start, char end){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= start && str.charAt(i) <= end) {
                count++;
            }
        }
        return count;
    }
}
