
import java.util.*;
public class palindrome {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no to check palindrome or not");
        int n = sc.nextInt();

        int r,sum=0;
        int temp=n;    
        while(n>0){    
         r=n%10;  //getting remainder  
         sum=(sum*10)+r;    
         n=n/10;    
        }    
        if(temp==sum)    
         System.out.println("palindrome number ");    
        else    
         System.out.println("not palindrome");    
      }  
}

