
public class StringMethod {

    public static void main(String[] args) {
        String n="GOBINDA";
        String Sn="Rawat";
        String em="";
        String d="    Learn java   ";
        System.out.println(n.toLowerCase());//This is using for convert given string into lowercswe
        System.out.println(Sn.toUpperCase());//This is using for convert given string in uppercas
        System.out.println(n.length());//This is using for finding length of String
        System.out.println(Sn.charAt(3));//This using for Finding the character
        System.out.println(em.isEmpty());//This is using for finding that string is empty or not
        System.out.println(n.isEmpty());//This is using for finding that string is empty or not
        System.out.println(n.replace('A', 'G')); //This is used for replace characters
        System.out.println(n.indexOf('B'));//This using for finding  index number by using character
        System.out.println(n.equals(Sn));//this is used for comparision of two string
        System.out.println(n.concat(Sn)); //this is used for add to string 
        System.out.println(d);//This is using for remove sapacing form both sides
    }
}
