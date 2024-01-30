import java.util.*;
public class Account{
    String firstName="",lastName="";
    String Password="";
    String PhoneNo="";
    String type="@gmail.com";
    String mails="\t\t\t\\tWelcome to the Inbox\n \t\tYour message will be appeared here";
    Scanner sc=new Scanner(System.in);
    String id;
    Account(){
        System.out.println("Welcome to the Email Application");
        System.out.println("Enter your First name:");
        firstName=sc.nextLine();
        System.out.println("Enter your Last name:");
        lastName=sc.nextLine();
        System.out.println("Enter your Mobile Number");
        PhoneNo=sc.nextLine();
        System.out.println("If you belong to any company or a school, please enter your domain name");
        type=sc.nextLine();
        type="@".concat(type);
        System.out.println("Do you want us to Generate the automated Password for higher security\n1.Yes\n2.No\n");
        int ch=sc.nextInt();
        if(ch==1){
            this.Password=passwordgenerator();
        }
        else{
            Password=sc.nextLine();
            Password=sc.nextLine();
        }
        id=firstName.concat(lastName.concat(type));
        System.out.println("Account Created Successfully\n Your user id is : "+id+"\n Your password is : "+Password);
    }
    Account(String fs,String ls,String pass,String ph){
        this.firstName=fs;
        this.lastName=ls;
        this.Password=pass;
        this.PhoneNo=ph;
        
    }
    public String passwordgenerator(){
        char pass[]=new char[10];
        String set="ABCDEFGHIJKLMNOPQRSTUVWXYXabcdefghijklmnoppqrstuvwxyz@1234567890!#$%^&*()_+=";
        for(int i=0;i<10;i++){
            int temp=(int)(Math.random()*set.length());
            pass[i]=set.charAt(temp);
        }
        return new String(pass);
    }
}