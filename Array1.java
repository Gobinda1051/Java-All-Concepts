import java.util.Scanner;
//Dynamic Array program
public class Array1 {
public static void main(String[] args) {
    int size,i;
    System.out.println("Enter number of elements you want to print");
    Scanner ref=new Scanner(System.in);
    size=ref.nextInt();
    int a[]=new int[size];
    for(i=0;i<size;i++)
    {
        a[i]=ref.nextInt();
       
    }
    System.out.println("printed array elements are");
    for(i=0;i<size;i++)
    {
         System.out.println(a[i]);
    }

}
    
}
