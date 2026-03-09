package DayTwo;

import java.util.Arrays;

public class NextPermutation {

    public static String solution(int []a){
        int len=a.length;
        int maxIdx=-1;

        for(int i=0;i<len-1;i++){
            if(a[i]<a[i+1]){
                maxIdx=Math.max(i,maxIdx);
            }
        }

        if(maxIdx==-1) {
            rev(a,0,len-1);
            return Arrays.toString(a);
        }

        int min=maxIdx;
        for(int i=maxIdx+1;i<len;i++){
            if(a[maxIdx]<a[i]){
                min=i;
            }
        }
        swap(a,maxIdx,min);

        int []temp=new int[len-maxIdx-1];

        for(int i=maxIdx+1;i<len;i++){
            temp[i-maxIdx-1]=a[i];
        }
        Arrays.sort(temp);

        for(int i=maxIdx+1;i<len;i++){
            a[i]=temp[i-maxIdx-1];
        }

        return Arrays.toString(a);
    }

    static void swap(int []a,int start,int end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }

    static void rev(int []a,int start,int end){
        while (start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{9,10,8,11,3})); //[9,10,11,3,8]
        System.out.println(solution(new int[]{1,2,3}));
        System.out.println(solution(new int[]{3,2,1}));
        System.out.println(solution(new int[]{1,1,5}));
    }
}
