package com.array;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams438 {

    public List<Integer> findAnagrams(String s, String p) {

//        int l=0,r=-1; //[l...r];
//        int count = p.length();
//        List<Integer> res = new ArrayList<>();
//        int[] freq = new int[256];
//        for(char c: p.toCharArray()){
//            freq[c]++;
//        }
//
//        while (l<s.length()){
//
//            if(freq[s.charAt(r+1)]>=1 && r+1 < s.length())
//                count--;
//
//            if(count == 0)
//                res.add(l);
//
////            if()
//
//
//        }

        int[] freq = new int[256];
        int l = 0, r = -1;  //滑动窗口为[l...r]
        int count = p.length();
        List<Integer> res = new ArrayList<>();
        for (char c : p.toCharArray()) {
            freq[c]++;
        }

        while (l < s.length()) {

            if (freq[s.charAt(r++)]-- >= 1 && r + 1 < s.length())
                count--;

            if (count == 0)
                res.add(l);

            if (r - l == s.length() - 1 && freq[s.charAt(l++)]++ >= 0)
                count++;


        }

        return res;


    }
}
