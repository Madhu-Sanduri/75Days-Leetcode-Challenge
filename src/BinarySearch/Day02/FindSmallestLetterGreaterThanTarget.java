package BinarySearch.Day02;

public class FindSmallestLetterGreaterThanTarget {

    public static char solution(char []letters, char target){
//        if(letters[0]<target) return letters[0];
        int len=letters.length;
        int s=0,e=len-1;
        int pos=-1;

        while (s<=e){
            int mid= s+(e-s)/2;

            if(letters[mid]>target) e=mid-1;
            else s=mid+1;
        }

        return letters[s];
    }


    public static void main(String[] args) {
        System.out.println(solution(new char[]{'c','f','j'},'d'));
        System.out.println(solution(new char[]{'c','f','j'},'g'));
        System.out.println(solution(new char[]{'c','f','j'},'a'));
        System.out.println(solution(new char[]{'x','x','y','y'},'z'));
        System.out.println(solution(new char[]{'c','f','j'},'c'));
    }
}


/*

["c","f","j"]
"a"
["c","f","j"]
"c"
["x","x","y","y"]
"z"


* */