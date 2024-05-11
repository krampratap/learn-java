package com.java.advanced;

import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        if(s.length()!=t.length())
            return false;
        int i =0;
        while (i<s.length()) {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i))==t.charAt(i))
                {
                    i++;
                    continue;
                }
                else
                {
                    return false;
                }
            }
            else if(map.containsValue(t.charAt(i)))
            {
                return false;
            }
            else
            {
                map.put(s.charAt(i),t.charAt(i));
            }
            i++;
        }
        return true;
    }
}
public class HashMaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = in.nextLine();
        Solution s = new Solution();
        System.out.println(s.isIsomorphic(str,str2));
    }
}
