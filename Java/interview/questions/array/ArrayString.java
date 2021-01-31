package com.interview.questions.array;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class ArrayString {

    //Working with ArrayLists ----------------------------------------------
    public ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for (String word: words) sentence.add(word);
        for (String word: more) sentence.add(word);

        return sentence;
    }

    public ArrayList<Integer> mergeInteger(int[] list1, int[] list2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int num : list1) result.add(num);
        for (int num : list2) result.add(num);

        return result;
    }

    public int count(int[] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) size += 1;
        return size;
    }


    //String Builder

    public String joinWords(String[] words){
        StringBuilder sentence = new StringBuilder();
        for (String w: words) {
            sentence.append(w);
        }
        return sentence.toString();
    }


    //Practice -----------------------------------------------------------
    public boolean isUnique(String str) {

        if (str.length() > 256) {
            return false;
        }

        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);

            if (char_set[value]) { //? true
                return false;
            } else {
                char_set[value] = true;
            }
        }
        return true;
    }

    //Is permutation
    public String sort(String s) {
        //Convert the string into an Array
        char[] content = s.toCharArray();

        //Sort the new array & return it as a string
        java.util.Arrays.sort(content);
        return new String(content);
    }


    public boolean permutation(String string, String t) {
        if (string.length() != t.length()) {
            return false;
        } else {
            //Convert the string into an array, sort it and
            return sort(string) == (sort(t));
        }
    }

    //URLify
    public static String URLify(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char l = word.charAt(i);
            if (l == ' ') {
                result += "%20";
            } else {
                result += l;
            }

        }
        return result;
    }

    //Palindrome
    public static String isPalindrome(String string) {
        String result = "";
        int max = string.length() - 1;
        for (int i = max; i >= 0; i--) {
            char l = string.charAt(i);
            result += l;
        }
        return result;
    }

    public static boolean checkPalindrome(String word) {
        if (isPalindrome(word) != word){
            return true;
        } else {
            return false;
        }
    }




}
