package JANUARY_TNP;

public class Main {

        public static boolean triplet(int[] arr, int t){
            boolean flag = false;
            for(int i = 0;i<arr.length; i++){
                for(int j = i+1; j<arr.length; j++){
                    for(int k = j+1; k<arr.length; k++)
                        if( arr[i]+arr[j]+arr[k] == t){
                            flag = true;
                        }
                }
            }
            return flag;
        }
        public static void main(String[] args){
            int[] arr = {1,4,45,6,10,8};
            int target = 8;
            boolean ans = triplet(arr, 13);
            System.out.println(ans);
        }

    }
