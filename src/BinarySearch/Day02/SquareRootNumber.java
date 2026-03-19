package BinarySearch.Day02;

public class SquareRootNumber {
    public static int solution(int x){
        int s=1,e=x/2;

        while (s<=e){
            int mid = s +(e-s)/2;

            if((long) mid*mid>x) e=mid-1;
            else s=mid+1;
        }
        return e;
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
        System.out.println(solution(8));
        System.out.println(solution(810));
        System.out.println(solution(100));
        System.out.println(solution(10));
        System.out.println(solution(199));
    }
}
