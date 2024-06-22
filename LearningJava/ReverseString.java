package LearningJava;

public class ReverseString {

    public static void main(String[] args) {
        String str= "Neha";
        int a = str.length();
        String b="";

        for(int i = a-1; i>=0; i--)
        {
            b=b+str.charAt(i);

        }
        System.out.println(b);

    }

}
