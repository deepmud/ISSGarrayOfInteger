package arrayOfInteger;

import java.util.Arrays;

public class ArrayOfInteger {

    int N;
    Integer[] integer = new Integer[N];

    public int returnMinimunInteger(){
        int[] n = {8,1,2,7,3,5,6};
        int[] s = new int[7];
        Arrays.sort(n);
        for(int i=0;i < 7;i++) {
            s[i] = i + 1;
            if(n[i]!=s[i]){
                System.out.println(s[i]);
                return s[i];
            }
        }
        int m = 77;
        return m;
    }

    public static void main(String[] args){
        ArrayOfInteger arrayOfInteger = new ArrayOfInteger();
        arrayOfInteger.returnMinimunInteger();
    }

}