package DayOne;

public class Kleft {
    public static void solution(int []a,int k){
        int len=a.length;
        k=k%len;
        rev(a,0,len-1);
        rev(a,0,k-1);
        rev(a,k,len-1);
    }
    static void rev(int []a,int s,int e){

        while(s<e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
}
