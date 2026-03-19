package BinarySearch.Day02;

public class NumberOfOccurrence {
    public static int solution(int []a,int target){
        int firstIdx=firstOccurrence(a,target);
        int lastIdx=lastOccurrence(a,target);
        System.out.println("firstIdx ->" + firstIdx);
        System.out.println("lastIdx ->"+ lastIdx);
        if(firstIdx ==-1 && lastIdx==-1) return 0;
        if(firstIdx==-1 || lastIdx==-1) return 1;

        return lastIdx-firstIdx+1;
    }

    static int firstOccurrence(int []a,int target){
        int len=a.length;
        int s=0,e=len-1;
        int pos=Integer.MAX_VALUE;
        while (s<=e){
            int mid= s+(e-s)/2;
            if(a[mid]==target) pos=Math.min(pos,mid);
            if(a[mid]>=target) e=mid-1;
            else s=mid+1;
        }

        return pos==Integer.MAX_VALUE?-1:pos;
    }

    static int lastOccurrence(int []a,int target){
        int len=a.length;
        int s=0,e=len-1;
        int pos=-1;
        while (s<=e){
            int mid = s +(e-s)/2;
            if(a[mid]==target) pos=Math.max(pos,mid);
            if(a[mid]<=target) s=mid+1;
            else e=mid-1;
        }

        return pos;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 2, 2, 2, 2, 3},2));
        System.out.println(solution(new int[]{1, 1, 2, 2, 2, 2, 3},4));
        System.out.println(solution(new int[]{8, 9, 10, 12, 12, 12},12));
    }

}
