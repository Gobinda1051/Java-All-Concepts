public class StringReverse {
    public static void main(String[] args) {
      
   //by using predifine StringBuffer Class  ofr revrse the string
        StringBuffer r=new StringBuffer("Gobinda Rawat");
    System.out.println(r.reverse());
    //by userdefine coding to conver string into reverse
 int l,i;
        String name="Gobinda Rawat";
        String name2="";
        l=name.length();
        for(i=l-1;i>=0;i--)
        {
name2=name2+name.charAt(i); 
       
 }
    System.out.println(name2);
        }
}
