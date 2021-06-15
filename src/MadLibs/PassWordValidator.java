package MadLibs;
/**
 * 8 at least characters
 * contain at least on upper case character
 * contain at least on special character
 */

import javax.swing.text.AbstractDocument;
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
        System.out.println(" Set new password for User " + userName);
        newPassWord = scanner.next();
    }

    public static boolean validateNewPW(){
        boolean validert = false;
        boolean validateLenght = false;
        boolean validateSpesChar = false;
        boolean validateUpperCase = false;
        boolean validateUserOldPW = false;

        for(int i = newPassWord.length(); i <=0; i--) {
            if (Character.isUpperCase(newPassWord.charAt(i))){
                validateUpperCase = true;
            }
        }

        if (newPassWord.length() >= 8){
            validateLenght = true;
        }

        for(int i = newPassWord.length(); i <=0; i--){

        if(newPassWord.contentEquals("@&*%#-&£$_")){
                validateSpesChar = true;
            }
        }

        if(newPassWord != userName && newPassWord != oldPassWord){
            validateUserOldPW = true;
        }

        if (validateLenght && validateSpesChar && validateUpperCase && validateUserOldPW == true){
            validert = true;
        }
        return validert;
    }

    public static void main(String[] args) {
        getData();

        do {
            getData();
            validateNewPW();
        } while (validateNewPW() == true);
    }

}
