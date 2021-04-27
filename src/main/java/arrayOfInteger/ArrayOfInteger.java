package arrayOfInteger;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfInteger {

    public int returnMinimumMissingInteger(){
        int[] n = {8,1,2,7,3,5,6,10};
        int[] s = new int[8];
        Arrays.sort(n);
        for(int i=0;i < 8;i++) {
            s[i] = i + 1;
            if(n[i]!=s[i]){
                System.out.println(s[i]);
                return s[i];
            }
        }
        int m = 77;
        return m;
    }

    public void returnMinimumMissingIntegerInUserTestArray(int userTestArrayIndex){
        int b = userTestArrayIndex - 1;
        int[] n = new int[b];
        int[] s = new int[b];
        System.out.print("Your Unsorted testArray: ");
        for(int i=0;i < b;i++) {
            n[i] = generateRandomNumber_and_AvoidRepeatedNumberInArray(i,n);
            System.out.print(n[i] + ", ");
        }
        Arrays.sort(n);
        System.out.println();
        int m = CheckMissingInteger(b,s,n) ;
        if (m == 0){
            System.out.println("There is no missing integer...wow");
        }

    }

    public int generateRandomNumber_and_AvoidRepeatedNumberInArray(int i, int[] n) {
        int d = ((int) (Math.random() * 10)) + 1;
        for(int k = i-1;k >= 0;k--){
            if(n[k] == d){
                d = generateRandomNumber_and_AvoidRepeatedNumberInArray(i,n);
            }
        }
        return d;
    }

    public int CheckMissingInteger(int b,int[] s,int[] n) {
        for (int i = 0; i < b; i++) {
            s[i] = i + 1;
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
        System.out.println("This is an example of the project RETURN-THE-MINIMUM-MISSING" +
                "-NUMBER-IN-ARRAY E.g of Array is {8,1,2,7,3,5,6,10} ");
        System.out.print("The missing number is:  ");
        arrayOfInteger.returnMinimumMissingInteger();

        System.out.println();
        System.out.println("This will generate random elements in your array");
        System.out.println("NB: Your Index mustn't be (>10)");
        System.out.print("Type in the Index of Array you are interested to test:_");
        Scanner input = new Scanner(System.in);
       int userTestArrayIndex = input.nextInt();
      arrayOfInteger.returnMinimumMissingIntegerInUserTestArray(userTestArrayIndex);
    }

}
