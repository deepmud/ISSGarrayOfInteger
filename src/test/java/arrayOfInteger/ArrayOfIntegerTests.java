package arrayOfInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayOfIntegerTests {

    @Test
    void shouldreturnMinimumMissingInteger(){
        ArrayOfInteger arrayOfInteger = new ArrayOfInteger();
        Assertions.assertEquals(4,arrayOfInteger.returnMinimumMissingInteger());
    }

    @Test
    void shouldreturnMinimumMissingIntegerInUserTestArray(){
        ArrayOfInteger arrayOfInteger = new ArrayOfInteger();
        Assertions.assertEquals(4,workOutReturnMinimumMissingIntegerInUserTestArray
                        (10),
                "ALL INTEGER WHERE " +
                "PRESENT IN THE " +
                "ARRAY");
    }

    public int workOutReturnMinimumMissingIntegerInUserTestArray(int UserTestArrayIndex){
        int b = UserTestArrayIndex - 1;
        int[] n = new int[b];
        int[] s = new int[b];
        System.out.print("Your Unsorted testArray: ");
        for(int i=0;i < b;i++) {
            n[i] = workOutGenerateRandomNumber_and_AvoidRepeatedNumberInArray(i,n);
            System.out.print(n[i] + ", ");
        }
        Arrays.sort(n);
        System.out.println();
        int m = workoutCheckMissingInteger(b,s,n) ;
        return m;
    }

    public int workOutGenerateRandomNumber_and_AvoidRepeatedNumberInArray(int i, int[] n) {
        int d = ((int) (Math.random() * 10)) + 1;
        for(int k = i - 1;k >= 0;k--){
            if(n[k] == d){
                d = workOutGenerateRandomNumber_and_AvoidRepeatedNumberInArray(i,n);
            }
        }
        return d;
    }

    public int workoutCheckMissingInteger(int b,int[] s,int[] n) {
        for (int i = 0; i < b; i++) {
            s[i] = i + 1;
            if (n[i] != s[i]) {
                System.out.println("testArray do not have number:  " + s[i]);
                return s[i];
            }
        }
        int bb = 0;
        return bb;
    }
}
