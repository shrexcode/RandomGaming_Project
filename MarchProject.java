package Projects;
import java.util.*;
public class MarchProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice 0-Easy 1-Hard");
        char ch = sc.next().charAt(0);
        if(ch=='0'){
        System.out.println("Enter your choice");
        int user=sc.nextInt();
        int comp = (int)(1+Math.random()*(10-1));
        System.out.println("Computer choice ="+comp);

        if(user==comp){
            System.out.println("You won");
        }else if(++user==comp || --user==comp || --comp==user || ++comp==user){
            System.out.println("Too close");
        }else{
            System.out.println("You lose");
            }
        }if(ch=='1'){
            int maxattempts = 5;
            int attemptsleft=maxattempts;
            while(attemptsleft>0){
            System.out.println("Enter your choice");
            int user=sc.nextInt();
        int comp = (int)(1+Math.random()*(10-1));
        System.out.println("Computer choice ="+comp);

        if(user==comp){
            System.out.println("You won");
            System.out.println("You won too" +(maxattempts-attemptsleft)+ "attempts");
            break;
        }else if(++user==comp || --user==comp || --comp==user || ++comp==user){
            System.out.println("Too close");
        }else{
            System.out.println("You lose");
            }
            attemptsleft--;
            System.out.println("Attempts left ="+attemptsleft);

            if(attemptsleft==0){
                System.out.println("Leave the game");
                }
             }
             sc.close();
             }
        }
    }
