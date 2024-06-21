import java.util.*;
 
public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
    
            System.out.print("enter subject 1 marks(out of 100):");
              int sub1=sc.nextInt();
              System.out.print("enter subject 2 marks(out of 100):");
              int sub2=sc.nextInt();
              System.out.print("enter subject 3 marks(out of 100):");
              int sub3=sc.nextInt();
              System.out.print("enter subject 4 marks(out of 100):");
              int sub4=sc.nextInt();
              System.out.print("enter subject 5 marks(out of 100):");
              int sub5=sc.nextInt();
              System.out.print("enter subject 6 marks(out of 100):");
              int sub6=sc.nextInt();

              sum=sub1+sub2+sub3+sub4+sub5+sub6;
        System.out.println("Sum of marks obtained in all subjects:"+sum);
        float avg=(sum/6);
        System.out.println("Average percentage:"+avg+ "%");
        if(avg>90)
        System.out.println("You got A+ Grade");
        else if(avg>=70 && avg<=90)
        System.out.println("You got A Grade");
        else if(avg>=60 && avg<=70)
        System.out.println("You got B Grade");
        else if(avg>35 && avg<60)
        System.out.println("You are Passed");
        else
        System.out.println("You are Failed");


        
    }
}
