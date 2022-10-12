import java.util.Scanner;
//hare we make players
public class Player {
    int number=0;
    public void guess(){
     //test2
        Scanner s=new Scanner(System.in);

        while (true){
            System.out.println("Enter a number betwwen 1 to 10");
            int n=s.nextInt();
            if(n>=1&&n<=10)
            {
                number=n;
                break;
            }
            else{
                System.out.println("Enter correct number :");
            }
        }
        /*
        //test 1
        number=(int)(Math.random()*10);
        System.out.println("I'm guessing "+number);

         */
    }
}
