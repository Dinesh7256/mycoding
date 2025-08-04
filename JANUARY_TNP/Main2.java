package JANUARY_TNP;

import java.sql.SQLOutput;

class Main2{

    public static void main(String[] args){
        int[] arr = {1,2,0,3};
        int prefsum = 0;
        int totalsum = 0;
        int ansidx = -1;

        for(int sum: arr){
            totalsum += sum;
        }

        for(int i = 0; i<arr.length; i++){
            totalsum -= arr[i];
            if(prefsum == totalsum){
                ansidx = i;
            }
            prefsum += arr[i];
        }
        System.out.println(ansidx);
    }
}
