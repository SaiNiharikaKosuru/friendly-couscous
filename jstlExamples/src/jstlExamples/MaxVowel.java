package jstlExamples;

import java.util.*;
class MaxVowel {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = in.nextLine();
        int maxindex=0; int max=0;
        String word[]=str.split(" +");
        for(int i=0;i<word.length;i++) {
            int count=0;
            for(int j=0;j<word[i].length();j++) {
                char c= word[i].charAt(j);
                switch(c)  {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    count++;
                }
            }
            if(count>max) {
                max=count;
                maxindex=i;
            }
            System.out.println("Word with max Vowel : "+ word[maxindex]);
        }
    }
}
