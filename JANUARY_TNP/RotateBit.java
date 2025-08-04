package JANUARY_TNP;

//Negation
public class RotateBit {
    public static void convertBinary(int n) {

    }

    public static void main(String[] args) {

//        int n = 5;
//        int k = 2;
//        convertBinary(5);


//        int a = 0;
//        a  = ~a ;
//        System.out.println(a);


//                int a = 5; // Given number
//                int k = 2; // Number of bits to mark
//
//                // Create a mask to isolate the last k bits
//                int mask = (1 << k) - 1;
//
//                // Apply the mask
//                int markedBits = a & mask;
//
//                System.out.println("Original number (a): " + a);
//                System.out.println("Binary of a: " + Integer.toBinaryString(a));
//                System.out.println("Last " + k + " bits marked: " + Integer.toBinaryString(markedBits));

//        int a = 5, k =4, n=1;
//        if (( a & n << k - 1) == 0) {
//            System.out.println("false");
//        }
//        else{
//
//        }
        int a = 5;
        int k =2;
        int n = 1; //0001
        a = a | (n << k - 1); //mark
        a = a & ~(n << k - 1); //unmark
        a = a ^ (n << k - 1); //flip
        //if(a & (n<<k-1)) //check

    }


}
