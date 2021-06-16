package MadLibs;
/**
 * 8 at least characters
 * contain at least on upper case character
 * contain at least on special character
 */

import java.util.Scanner;

public class PassWordValidator {
    private static String userName;
    private static String oldPassWord;
    private static String newPassWord;
    private static final Scanner scanner= new Scanner(System.in);
   private static boolean validated = false;


    public static void getData() {
        System.out.println("Insert User Name: ");
        userName = scanner.next();
        System.out.println("Insert old password in order to set new password");
        oldPassWord = scanner.next();
        System.out.println(" Set new password for User " + userName );
        System.out.println(" New password can not be UserName or old password " );
        System.out.println(" New password must contain a special character ");
        System.out.println(" New password must contain at least one uppercase letter ");
        System.out.println(" New password must be embodied by at least 8 characters");
        System.out.println(" Insert new password : ");
        newPassWord = scanner.next();
    }

    public static void validateNewPW(){

        boolean lenght = false;
        boolean spesChar = false;
        boolean upperCase = false;
        boolean userOldPW = false;

        for(int i = newPassWord.length(); i <=0; i--) {
            if (Character.isUpperCase(newPassWord.charAt(i))){
                upperCase = true;
            }
        }

        if (newPassWord.length() >= 8){
            lenght = true;
        }

        for(int i = newPassWord.length(); i <=0; i--){

        if(newPassWord.contentEquals("@&*%#-&£$_")){
                spesChar = true;
            }
        }

        if(newPassWord != userName && newPassWord != oldPassWord){
            userOldPW = true;
        }

        if (lenght && spesChar && upperCase && userOldPW ){
            validated = true;
        }
    }

    public static void main(String[] args) {
        getData();

        do {
            getData();
            validateNewPW();
        } while (!validated);
    }
}
