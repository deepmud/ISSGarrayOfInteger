package arrayOfInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayOfIntegerTests {

    @Test
    void returnMinimunInt(){
        ArrayOfInteger arrayOfInteger = new ArrayOfInteger();
        Assertions.assertEquals(4,arrayOfInteger.returnMinimunInteger());
    }

    @Test
    void returnMinimunIn(){
        ArrayOfInteger arrayOfInteger = new ArrayOfInteger();
        Assertions.assertEquals(4,returnMinimunInte(6),"ALL INTEGER WHERE " +
                "PRESENT IN THE " +
                "ARRAY");
    }

    public int returnMinimunInte(int b){

        int[] n = new int[b];

        int[] s = new int[b];
        for(int i=0;i < b;i++) {
            n[i] = ((int)(Math.random()*10)) + 1;
            System.out.print(n[i] + ", ");
        }
        Arrays.sort(n);
        for(int i=0;i < b;i++) {
            s[i] = i + 1;
            if(n[i]!=s[i]){
                System.out.println(s[i]);
                return s[i];
            }
        }
        int m = 0;
        return m;
    }
}
