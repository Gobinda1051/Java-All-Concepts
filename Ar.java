//This is program of dynamic array
import java.util.*;
public class Ar {

    public static void main(String[] args) {
        int i,size;
      
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
         int  a[]=new int[size];
           System.out.println("enter the size of array");
        for(i=0;i<size;i++)
        {
            
              a[i]=sc.nextInt();
        }
          System.out.println("Print the array elements");
           for(i=0;i<size;i++)
        {
            
              System.out.println(a[i]);
        }

    }
}