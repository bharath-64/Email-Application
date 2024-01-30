import java.util.*;

public class EmailApp {
    static HashMap<String,Account> h=new HashMap<>();
    public static void MainFrame(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Gmail Application");
        int ch;
        System.out.println("1.LOGIN                             2.NEW USER?                             3.EXIT");
        ch=sc.nextInt();
        if(ch==1){
            Authenticate();
        }
        else if(ch==2){
            createAccount();
        }
        else if(ch==3){
            return;
        }
        MainFrame();
    }
    public static void Login(Account a){
        
        Scanner sc=new Scanner(System.in);
        
            System.out.println("1.Inbox\n2.Send an Email\n3.Exit");
            int ch;
            ch=sc.nextInt();
            if(ch==1){
                System.out.println(a.mails);
            }
            else if(ch==2){
                System.out.println();
            }
            else{
                return;
            }
            Login(a);
        
        
    }
    public static void Authenticate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n\n\t\t\tLOGIN");
        String mailid,password;
        System.out.println("Enter your valid mail id");
        mailid=sc.nextLine();
        System.out.println("Enter your password");
        password=sc.nextLine();
        if(h.containsKey(mailid)){
            String orgpass=h.get(mailid).Password;
            if(orgpass.equals(password)){
                Login(h.get(mailid));
            }
            else{
                System.out.println("Incorrect password");
            }
        }
        else{
            System.out.println("Entered Email doesn't exists");
        }
        
    }
    public static void createAccount(){
        Account temp=new Account();
        h.put("temp.id", temp);
    }
    public static void main(String args[]){
        h.put("bharath@gmail.com", new Account("bharath", "kumar", "1234", "9885629980"));
        MainFrame();
    }
}
