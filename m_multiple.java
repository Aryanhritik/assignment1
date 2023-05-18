import java.util.*;
public class m_multiple {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m;

        System.out.println("enter the value of M");
        m=sc.nextInt();

        if(m%3==0 && m%5==0){
            System.out.println("Good Number");
        }
        else if(m%5==0){
            System.out.println("Bad Number");
        }
        else if(m%3==0){
            System.out.println("Poor Number");
        }
        else{

            System.out.println("-1");
        }

        
    }
    
}