package com.array;

public class ReverseVowels {

    public String reverseVowels(String s) {

        String vowels = "aeiouAEIOU";

        char[] chars = s.toCharArray();
        int head = 0;
        int tail = s.length() - 1;

        while (head <= tail) {
            char cHead = s.charAt(head);
            char cTail = s.charAt(tail);
            if (!vowels.contains(cHead + "")) {
                head++;
            } else if (!vowels.contains(cTail + "")) {
                tail--;
            } else {

                swap(chars, head, tail);

                head++;
                tail--;
            }
        }

        return new String(chars);

    }


    private void swap(char[] chars, int i, int j) {

        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

    }

//    private char[] swap(char[] chars, int i, int j){  //写得智障版本的交换
//
//        char temp = chars[i];
//        chars[i] = chars[j];
//        chars[j] = temp;
//        return chars;
//
//    }


    public static void main(String[] args) {

        System.out.println((new ReverseVowels()).reverseVowels("leetcode"));

    }

}
