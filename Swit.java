import java.util.Scanner;
public class Swit {

    static void add(){
        int a1,b1 ,sum;
    
         System.out.println("Enter the value of Num1 ");
        Scanner a=new Scanner(System.in);
        a1=a.nextInt();
         System.out.println("Enter the value of Num2 ");
          Scanner b=new Scanner(System.in);
        b1=b.nextInt();
       sum=a1+b1;
       System.out.println("Addition of Num1 and Num2"+" "+sum);

    }
    static void sub(){
 int a1,b1 ,sum;
         System.out.println("Enter the value of Num1 ");
        Scanner a=new Scanner(System.in);
        a1=a.nextInt();
         System.out.println("Enter the value of Num2 ");
          Scanner b=new Scanner(System.in);
        b1=b.nextInt();
       sum=a1-b1;
       System.out.println("Substraction of Num1 and Num2"+" "+sum);
    }
    static void mul(){
 int a1,b1 ,sum;
         System.out.println("Enter the value of Num1 ");
        Scanner a=new Scanner(System.in);
        a1=a.nextInt();
         System.out.println("Enter the value of Num2 ");
          Scanner b=new Scanner(System.in);
        b1=b.nextInt();
       sum=a1*b1;
       System.out.println("Multiplication of Num1 and Num2"+" "+sum);
    }
    static void rem(){
 int a1,b1 ,sum;
         System.out.println("Enter the value of Num1 ");
        Scanner a=new Scanner(System.in);
        a1=a.nextInt();
         System.out.println("Enter the value of Num2 ");
          Scanner b=new Scanner(System.in);
        b1=b.nextInt();
       sum=a1%b1;
       System.out.println("Remender of Num1 and Num2"+" "+sum);
    }
    static void div(){
 int a1,b1 ,sum;
         System.out.println("Enter the value of Num1 ");
        Scanner a=new Scanner(System.in);
        a1=a.nextInt();
         System.out.println("Enter the value of Num2 ");
          Scanner b=new Scanner(System.in);
        b1=b.nextInt();
       sum=a1/b1;
       System.out.println("Division  of Num1 and Num2"+" "+sum);
    }
    

    public static void main(String[] args) {
        
        int a1;
        System.out.println(" 1.Addition  method is called... ");
        System.out.println(" 2.Substraction  method is called... ");
        System.out.println(" 3.Multiplication method is called... ");
        System.out.println(" 4.Remender  method is called... ");
        System.out.println(" 5.Division  method is called... ");
        while (true) {
            
        
        System.out.println("Enter your choice ");
           Scanner a=new Scanner(System.in);
        a1=a.nextInt();
switch (a1) {
    case 1:
     System.out.println(" Addition  method is called... ");
    add();
     break;
     case 2:
      System.out.println("Substraction method is called.. ");
      sub();
      break;
      case 3:
       System.out.println("Multiplication method is called.. ");
       mul();
       break;
       case 4:
        System.out.println("Remender method id called..");
        rem();
        break;
        case 5:
         System.out.println("Division method is called..");
         div();
         break;
    default:
    System.out.println("Please enter valid choice");
        break;
}
    }

    }
}

