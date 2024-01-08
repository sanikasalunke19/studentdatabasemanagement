package studentdatabaseapp;
import java.util.Scanner;
public class Studentdatabaseapp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER HOW MANY STUDENTS:");
        int st=sc.nextInt();
        student s[]=new student[st];

        for(int i=0;i<st;i++){
        s[i]=new student();    
        s[i].enroll();
        s[i].payment();
        
        }
        for(int i=0;i<st;i++){
        System.out.println(s[i].showInfo());
        }
    }
}