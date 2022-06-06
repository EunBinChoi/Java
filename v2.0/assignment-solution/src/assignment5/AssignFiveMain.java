package assignment5;

import application_exception.InvalidNumberRangeException;
import assignment4.AssignFourMain;

import java.util.Locale;
import java.util.Scanner;

public class AssignFiveMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // Q1. �ҹ���, �빮��, e(E) ����
//        String str = inputString("���ڿ��� �Է��Ͻÿ� : ");
//        int lowerLetterCnt = countLetter(str, 'a', 'z');
//        int upperLetterCnt = countLetter(str, 'A', 'Z');
//        int eLetterCnt = countLetter(str.toLowerCase(), 'e', 'e');
//        System.out.println("�ҹ����� ���� : " + lowerLetterCnt);
//        System.out.println("�빮���� ���� : " + upperLetterCnt);
//        System.out.println("���� E(e)�� ���� : " + eLetterCnt);


        ////////////////////////////////////////////////////////
        // Q2. �׷� ä�ù�
//        String msg = inputString("�޽����� �Է��Ͻÿ� : ");

        // 1) ��ȯ�� ���ڿ��� ��ȯ��
//        String encodeMsg = encodeMessage(msg);
//        System.out.println("encode msg : "  + encodeMsg);
//        System.out.println("original : " + msg);


        // 2) ���� �Լ��� �������� Ư���� �̿��ؼ� ª�� ����
//        encodeMsg = useOperatorPropForEncodeMessage(msg);
//        System.out.println("encode msg : "  + encodeMsg);
//        System.out.println("original : " + msg);


        // 3) ���� �Լ��� �ڹ� ���̺귯���� �̿��ؼ� �ִ��� ª�� ����
//        encodeMsg = useJavaAPIForEncodeMessage(msg);
//        System.out.println("encode msg : "  + encodeMsg);
//        System.out.println("original : " + msg);

        ////////////////////////////////////////////////////////
        // Q3. ���ڿ� substring
        String target = inputString("�ڸ� ���ڿ��� �Է��Ͻÿ�: ");
        int[] indice = inputStartEndIndex(target);
        int start = indice[0];
        int end = indice[1];

        // ���� ������ substring �̿�
        String subStringRes = substring(target, start, end);
        System.out.println(subStringRes);

        // String Ŭ������ substring �̿�
        subStringRes = target.substring(start, end);
        System.out.println(subStringRes);
    }
    public static int[] inputStartEndIndex(String target){
        while(true) {
            try {
                int start = AssignFourMain.chooseNumInRange("���� �ε��� �Է��Ͻÿ� : ", 0, target.length(), 0);
                int end = AssignFourMain.chooseNumInRange("�� �ε��� �Է��Ͻÿ� : ", 0, target.length(), 0);
                if (start > end) throw new InvalidNumberRangeException();
                return new int[]{start, end};
            } catch(InvalidNumberRangeException e){
                System.out.println(e);
                System.out.println("[ERROR] ���� �ε����� �� �ε����� ������ϴ� !");
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
        String copy = new String(str).toUpperCase(); // String�� ������ �Ұ����ϱ� ������
        char[] copyCharArr = copy.toCharArray(); // char array�� ����

        for(int i = 0; i < copyCharArr.length; i++){
            if(i == 0 || copyCharArr[i-1] == ' ') {
//                if (copyCharArr[i] >= 'A' && copyCharArr[i] <= 'Z') { // �빮���� ���
//                    copyCharArr[i] += ('a' - 'A'); // �ҹ��ڷ� ����
//                }

                copyCharArr[i] = Character.toLowerCase(copyCharArr[i]);

            }
        }
        return new String(copyCharArr);
    }
    public static String encodeMessage(String str){
        String copy = new String(str); // String�� ������ �Ұ����ϱ� ������
        char[] copyCharArr = copy.toCharArray(); // char array�� ����

        // �ش� ������ ���⸦ �������� �ܾ �����ϱ� ������ ���Ⱑ ���° �ε����� �������� �˾ƾ���
        boolean isSpace = false;
        for(int i = 0; i < copyCharArr.length; i++){
            if(i == 0){
                if(copyCharArr[i] >= 'A' && copyCharArr[i] <= 'Z'){ // �빮���� ���
                    copyCharArr[i] += ('a' - 'A'); // �ҹ��ڷ� ����
                }
            }
            else {
                if (isSpace) {
                    if (copyCharArr[i] >= 'A' && copyCharArr[i] <= 'Z') { // �빮���� ���
                        copyCharArr[i] += ('a' - 'A'); // �ҹ��ڷ� ����
                    }
                    isSpace = false;
                }
                else {
                    if (copyCharArr[i] >= 'a' && copyCharArr[i] <= 'z') { // �빮���� ���
                        copyCharArr[i] -= ('a' - 'A'); // �ҹ��ڷ� ����
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
