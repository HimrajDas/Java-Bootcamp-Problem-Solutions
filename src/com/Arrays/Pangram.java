package com.Arrays;
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class Pangram {
    public static  void main(String[] args) {
    }

    static boolean checkIfPangram(String sentence) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (char c : alphabet) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }
}
