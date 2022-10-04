// program to check prime or not using function
import java.util.*;
public class javaBasic42 {
    public static boolean isprime (int n){
        if (n==2){
            return true;
        }
        boolean isprime = true;
        int i =0;
        for(i=2; i<=n-1; i++){
            if(n%i==0)
            return isprime=false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isprime(n));

    }
    
}
