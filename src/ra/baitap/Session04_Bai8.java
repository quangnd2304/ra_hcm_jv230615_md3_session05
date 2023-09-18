package ra.baitap;

import java.util.Scanner;

public class Session04_Bai8 {
    public static void main(String[] args) {
        /*
        * input: String str, Character charFind
        * output: count char of Str
        * */
        //B1: Nhập vào một chuỗi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi:");
        String str = scanner.nextLine();
        //B2: Nhập vào ký tự cần tìm
        System.out.println("Nhập vào ký tự cần tìm:");
        char c = scanner.nextLine().charAt(0);
        //B3: Thống kê số lần xuất hiện và in ra
        int cntChar = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==c){
                cntChar++;
            }
        }
        System.out.printf("%c xuất hiện %d lần trong chuỗi",c,cntChar);
    }
}
