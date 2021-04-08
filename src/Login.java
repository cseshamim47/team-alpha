package ticketer;

import java.io.Console;

public class Login
{
    Login(){
        for(;;) {
            Console console = System.console();
            String username = console.readLine("Your Username : ");
            char[] pwd = console.readPassword("Your Password : ");
            String user_one = "cseshamim47";
            String user_one_pwd = "hackedit";
            String checker = new String(pwd);
            if (user_one.equals(username) && user_one_pwd.equals(checker)) {
                System.out.println();
                System.out.println("Login Successful!!!!");
                System.out.println("Username = " + username);
                System.out.println("Password = " + checker);
                System.out.println();
                break;
            } else System.out.println("\nIncorrect Username or Password. Please try again! \n");
        }
    }

}
