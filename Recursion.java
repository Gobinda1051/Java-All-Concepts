public class Recursion{
    public static void main(String[] args) {
    Recursion ref=new Recursion();
    int a=ref.sum(10);   
    System.out.println(a); 
    }
    int sum(int b)
    {
if (b>0) {
    return b+sum(  b-1);
    
}
else
{
    return 0;
}

    }
}