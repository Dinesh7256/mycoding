import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.next();

        char[] s1 = s.toCharArray();
        boolean flag = false;



//        char[] s2 = new char[s1.length];
//
//        for(int i = 0;i<s1.length; i++){
//            s2[i] = s1[(s1.length-1)-i];
//        }
//
//        if(Arrays.equals(s1, s2)){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not Palindrome");
//        }


        int left = 0;
        int right = s1.length-1;

        while(left<right){
            if(s1[left] == s1[right]){
                flag = true;
            }
            left++;
            right--;
        }
        if(flag){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

}

