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
    private static boolean validated;
    private static final Scanner scanner= new Scanner(System.in);



    public static void getData() {
        System.out.println("Insert User Name: ");
        userName = scanner.next();
        System.out.println("Insert old password in order to set new password");
        oldPassWord = scanner.next();
        System.out.println(" Set new password for User " + userName );
        System.out.println(" New password can not be UserName or old password " );
        System.out.println(" New password must contain a special character : @ & * % # - & £ $ _");
        System.out.println(" New password must contain at least one uppercase letter ");
        System.out.println(" New password must be embodied of at least 8 characters");
        System.out.println(" Insert new password : ");
        newPassWord = scanner.next();
    }

    public static void validateNewPW() {

        boolean lenght = false;
        boolean spesChar = false;
        boolean upperCase = false;
        boolean oldPW = false;
        boolean usrName = false;
        String xChar = ("@&*%#-&£$_");

        if (newPassWord != oldPassWord) {
            oldPW = true;
        }

        if (newPassWord != userName) {
            usrName = true;
        }

        for (int i = newPassWord.length(); i <= 0; i--) {
            if (Character.isUpperCase(newPassWord.charAt(i))) {
                upperCase = true;
            }
        }

        if (newPassWord.length() >= 8) {
            lenght = true;
        }

        for (int i = newPassWord.length(); i <= 0; i--) {

            for (int j = xChar.length(); j <= 0; j--) {
                if (newPassWord.charAt(i) == xChar.charAt(j)) {
                    spesChar = true;
                }
            }

            if (lenght && spesChar && upperCase && oldPW && usrName) {
                validated = true;
            }
        }
    }

    public static void main(String[] args) {

        while (!validated){
            getData();
            validateNewPW();
            if(validated){
                System.out.println(" The new password is set");
            }else {
                System.out.println(" New password not approved, repeat the password setting procedure");
            }
        }
    }
}
