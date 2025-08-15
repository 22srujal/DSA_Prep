// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=array

public class EvenDigit {
    public static void main(String[] args) {
        int [] num= {12,345,23,6,789};
        System.out.println(findNumbers(num));
        //System.out.println(digits2(-980));
    }
    
    static int findNumbers(int [] num){
        int count = 0;
        for(int nums: num){
            if(even(nums)){
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits2(num);
        /*
        if(nummberOfDigits % 2 == 0){
            return true;
        }
        return false;
        */
        return numberOfDigits%2 == 0;
    }

    static int digits2(int num){
         if(num==0){
            return 1;
        }
        if(num<0){
            num*=-1;
        }
        
        return (int)(Math.log10(num)) + 1;
    }

    // count number of digits in a number
    static int digits(int num){
        if(num<0){
            num*=-1;
        }
        if(num==0){
            return 1;
        }
        
        int count = 0;
        while(num >0){
            count++;
            num/=10;
        }
        return count;
    }
}
