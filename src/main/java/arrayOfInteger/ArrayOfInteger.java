package arrayOfInteger;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfInteger {
    public ArrayOfInteger(){
        System.out.println("This is an example of the project RETURN-THE-MINIMUM-MISSING" +
                "-NUMBER-IN-ARRAY E.g of Array is {8,1,2,7,3,5,6,10} ");
        System.out.print("The missing number is:  ");
    }


    public int returnMinimumMissingInteger(){
        int b = 15;
        int[] n = {8,1,2,57,34,33,43,56,22,7,3,9,5,6,10};
        int[] s = new int[15];
        for (int i = 0; i < b; i++) {
            s[i] = i + 1;
        }
        Arrays.sort(n);
        return CheckMissingInteger( b, s, n);
    }


    public void returnMinimumMissingIntegerInUserTestArray(int userTestArrayIndex){
        int b = userTestArrayIndex;
        int[] n = new int[b];
        int[] s = new int[b];
        for (int i = 0; i < b; i++) {
            s[i] = i + 1;
        }
        System.out.print("Your Unsorted testArray: ");
        for(int i=0;i < b;i++) {
            n[i] = generateRandomNumber_and_AvoidRepeatedNumberInArrays(i,n,s);
            System.out.print(n[i] + ", ");
        }
        Arrays.sort(n);
        System.out.println();
        int m = CheckMissingInteger(b,s,n) ;
        if (m == 0){
            System.out.println("There is no missing integer...wow");
        }

    }

    public void printExample1(){
        System.out.println();
        System.out.println("This will generate random elements in your array");
        System.out.println("NB: Your Index mustn't be (>10)");
        System.out.print("Type in the Index of Array you are interested to test:_");
    }
    public int generateRandomNumber_and_AvoidRepeatedNumberInArrays(int i, int[] n,
                                                                    int[] s) {
        int d = ((int) (Math.random() * 10)) + 1;
        int g = ((int) (Math.random() * 10)) + 1;
        int p = ((int) (Math.random() * 100)) + 1;
        for(int k = i-1;k >= 0;k--){
            if(n[k] == d){
                    d = s[s.length - 1 - g];
                    for(int l = i - 1;l >= 0; l--){
                        if(n[l] == d) {
                            d = s[s.length - 1] + g;
                            for(int y = i - 1;y >= 0; y--){
                                if(n[y] == d) {
                                    d = s[s.length - 1] + g + g;
                                    for(int z = i - 1;z >= 0; z--) {
                                        if (n[z] == d) {
                                            d = s[s.length - 1] + g + g + p;
                                        }
                                    }
                                }
                            }
                        }
                    }


            }
        }
        return d;
    }

    public int CheckMissingInteger(int b,int[] s,int[] n) {
        for (int i = 0; i < b; i++) {
            if (n[i] != s[i]) {
                System.out.println("testArray do not have number:  " + s[i]);
                return s[i];
            }
        }
        int z = 0;
        return z;
    }

    public static void main(String[] args){
        ArrayOfInteger arrayOfInteger = new ArrayOfInteger();
        arrayOfInteger.returnMinimumMissingInteger();
        arrayOfInteger. printExample1();
        Scanner input = new Scanner(System.in);
       int userTestArrayIndex = input.nextInt();
      arrayOfInteger.returnMinimumMissingIntegerInUserTestArray(userTestArrayIndex);
    }

}
