import java.util.Scanner;

public class FirstProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("This is my first Java Program!"); //Its not
        System.out.println("What is your name?");
        String name = input.next();
        System.out.printf("Hello %s welcome to CSE 1341!\n",name);
        System.out.println("I am a smart computer. I can count up to 100!");
        for(int x = 1; x <= 100; x++)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    //end main
}
//end first program
