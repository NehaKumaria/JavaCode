package LearningJava;

public class Reverse {

    int n = 22;

    int a = n/10;
    int b = n%10;
    int rev;

    void rev()
    {
        rev = (b * 10 ) + a;
        System.out.println("The rev of the number is " +rev);
    }

    void palindrome()
    {
        if (rev==n)
        {
            System.out.println("It is the palindrome");
        }
        else System.out.println("It is not the palindrome");
    }
    public static void main(String[] args) {
        Reverse obj = new Reverse();
        obj.rev();
        obj.palindrome();
    }
}
