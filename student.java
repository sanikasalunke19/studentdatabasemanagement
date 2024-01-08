package studentdatabaseapp;
import java.util.Scanner;
import java.util.Random;
public class student{

   private String firstname;
   private String lastname;
   private String gradyear; 
   private String studentid;
   private int courses=0;
   private int balance=0;
   private int cost=600;

    public student(){ //constructor
       Scanner sc=new Scanner(System.in);
       System.out.println("enter student first name:");
       firstname=sc.next();
       System.out.println("enter student last name:");
       lastname=sc.next();
       System.out.println("1:1st year\n2:2nd year\n3:3rd year\n4:4th year\nenter graduation year:");
       gradyear=sc.next();


       studentid=gradyear+setID();
      
    }
    private String setID(){   //generate id
       Random r=new Random();
       
       return Integer.toString(r.nextInt(1000,9999));

  }

  public void enroll(){
   Scanner sc=new Scanner(System.in);
   String course;
   int choice;
   do{
      System.out.println("1:HISTORY\n2:ENGLISH\n3:PHYSICS\n4:CHEMISTRY\n5:QUIT\nENTER YOUR CHOICE!");
      choice=sc.nextInt();

      if(choice!=5){
         courses++;
         balance=balance+cost;
      }   
      else
        break;   
      
      
   }while(choice!=5);
  
  }

  public void viewbalance(){
     System.out.println("YOUR BALANCE IS:"+balance);
  }

  public void payment(){
     viewbalance(); 
     System.out.println("How much do you want to pay?");
     Scanner sc=new Scanner(System.in);
     int pay=sc.nextInt();
     balance=balance-pay;
     System.out.println("Thankyou for the payment of Rs."+pay);
     System.out.print("Pending amount:");
     viewbalance();
  } 

  public String showInfo(){
    return "NAME:"+firstname+" "+lastname+"\nGRADE:"+gradyear+"\nID"+studentid+"\nCOURSES:"+courses+"\nBALANCE:"+balance;
  }
}