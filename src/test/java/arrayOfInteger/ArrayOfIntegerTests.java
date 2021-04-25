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
        Assertions.assertEquals(4,returnMinimunInte(50),"ALL INTEGER WHERE " +
                "PRESENT IN THE " +
                "ARRAY");
    }

    public int returnMinimunInte(int b){
        double[] x = new double[b] ;
        int[] n = new int[b];
        long g;
        int[] s = new int[b];
        for(int i=0;i < b;i++) {
            x[i] = Math.random();
            g = Math.round(x[i]);
            System.out.print(g + ", ");
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