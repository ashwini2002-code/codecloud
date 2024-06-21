import java.util.Random;
import java.util.*;
public class task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int attempt=1;
        int ch=1;
        Random rand=new Random();

        int randNo=rand.nextInt(100);
        do{
            System.out.println("enter user define number:");
        int no=sc.nextInt();
        System.out.println("random no is:"+randNo);
        if(randNo==no)
        {
            System.out.println("Correct...!!");
            break;
        }
        else if(randNo>no){
            System.out.println("too low...!!");
        }

        else if(randNo<no)
        {
            System.out.println("too high...!!");
        }
        attempt++;
        System.out.println("you have only three chances(enter 1 for next attempt):");
         ch=sc.nextInt();
         

        
    }while( ch==1 && attempt<=3);
   
    }
}
