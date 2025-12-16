import java.util.Scanner;
public class Calcu{
    //instant variable
    int n1,n2,sum,sub,mul,div,rem;
    public static void main(String[] args) {
      Calcu ref=new Calcu();
      ref.input();
      ref.process();
      ref.output();
    }
    void input()
    {
try (Scanner r = new Scanner(System.in)) {
    System.out.println("Enter two number");
    n1=r.nextInt();
    n2=r.nextInt();
}

    }
    void process()
    {
sum=n1+n2;
sub=n1-n2;
mul=n1*n2;
div=n1/n2;
rem=n1%n2;
    }
    void output()
    {
System.out.println("sum of n1 & n2"+" "+sum);
System.out.println("sub of n1 & n2"+" "+sub);
System.out.println("multiplication of n1 & n2"+" "+mul);
System.out.println( "Division of n1 & n2"+" "+sub);
System.out.println("remender of n1 & n2"+" "+rem);

    }
}