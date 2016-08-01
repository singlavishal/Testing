/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class ManachersAlgorithm {

    static int length = 0;
    private static StringBuilder output = new StringBuilder();
    private static String str = "";

    public static void main(String[] args) {
        String name[] = new String[9];
        // String name = "bbabcbcab";
        name[0] = "bharti";
        name[1] = "bharat";
        name[2] = "akash";
        name[3] = "bhav";
        name[4] = "chand";
        name[5] = "brtish";
        name[6] = "chetak";
        name[7] = "arvind";
        name[8] = "bhava";
        
        //int length = name.length();
        new ManachersAlgorithm().longestPalindrome1(name);
    }

    public static int longestPalindrome1(String[] input1) {
        //String name = "";
        for (int i = 0; i < input1.length; i++) {
            str = str + input1[i].substring(0, 1);
            //System.out.println(input1[i]);
        }
        System.out.println(str);
        length=new ManachersAlgorithm().comb(0);
        System.out.println("Length=" + length);
        return length;
    }

    public static int comb(int start) {

        for (int i = start; i < str.length(); i++) {
            output.append(str.charAt(i));
            //System.out.println(output);
            String outputdata = output.toString();
            String rev = "";
            for (int j = outputdata.length() - 1; j > -1; j--) {
                rev = rev + outputdata.charAt(j);

            }

            //   System.out.println(output + ":" + rev);
            if (outputdata.equalsIgnoreCase(rev)) {
                if (outputdata.length() > length) {
                    length = outputdata.length();
                }

                System.out.println(outputdata);
            } else {
                //System.out.println("Entered string is not a palindrome.");
            }
            if (i < str.length()) {
                comb(i + 1);
            }

            output.setLength(output.length() - 1);
        }
        return length;
        //System.out.println("Length="+l);
    }
}
