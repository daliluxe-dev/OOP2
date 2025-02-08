package loginsystem;
import java.util.Scanner;


public class LoginSystem {
    String correctusername="Daliluxe-dev";
    String correctpassword="123";
    
    //method used for login attempts and masking the password
    void loginAttempts(){
        Scanner BSE = new Scanner(System.in);
        //for loop allowing user to attempt login only 3 times
        for (int i=3; i>0; i--){  //login attempt will decrement each time, starting at 3 attempts
            System.out.println("Enter username: ");
            String username= BSE.nextLine(); 
            System.out.println("Enter password: ");
            String password= " ";  //empty string to store masked password        
        
        
        //masking the password
        while(true){
            char entry=BSE.next().charAt(0);  //the 'entry' variable stores the user input
            if(entry=='\n')break;  //if the users presses enter, the loop stops
            password += entry;   //take the user input stored in 'entry' and put in password
            System.out.print("*"); //mask the password with "*"
        }
        
        System.out.println();
        
        if (username.equals(correctusername) && password.equals(correctpassword)){ 
            System.out.println("Login Successful");//if the password &username the user entered is correct,this will be displayed
            return;
        }else {
            System.out.println("Invalid login" +(i-1)+ "attempts remaining");//if the password and username are incorrect,attempts will decrement
        }
       
    }
 System.out.println("Attempts failed. Access denied");//if user used all the attempts, access is denied
} 
    public static void main(String[] args) {
        //making an object called login
      LoginSystem login = new LoginSystem();
      login.loginAttempts();  //object is used to call for the method loginAttempts    
        
    }
    
}