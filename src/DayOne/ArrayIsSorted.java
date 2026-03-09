package DayOne;

public class ArrayIsSorted {
    public static boolean solution(int []a){
        int len=a.length;

        int []d=new int[2*len];

        for(int i=0;i<len;i++){
            d[i]=a[i];
            d[i+len]=a[i];
        }

        for(int i=0;i<d.length-1;i++){
            if(d[i]>d[i+1]){
                return isRotated(d,i+1,len);
            }
        }

        return true;
    }

    static boolean isRotated(int []a,int idx,int len){
        for(int i=idx;i<len+idx-1;i++){
            if(a[i]<=a[i+1]) continue;
            else return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(solution(new int[]{8,6,5,4,3,2,1}));
        System.out.println(solution(new int[]{4,8,1,2,0,1,4,6,7}));
    }
}
