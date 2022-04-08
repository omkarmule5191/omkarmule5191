// programe to check the given number is prime or not
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,flag=0;
        System.out.println("Enter one number: ");
        n=sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Prime Number!!");
        }
        else{
            System.out.println("Not Prime Number!!");
        }
    }
} 
