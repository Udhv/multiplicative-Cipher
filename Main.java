package Project;
import java.util.Scanner;

//This is main class .
public class Main {
    public static void main(String[] args) {
        //create using  variable : key, ch , plainText, excryptedText
        int key ,ch ;
        String plainText,encryptedText ;
        Scanner sc = new Scanner(System.in);
        System.out.println(" -: Multiplicative Cipher :-\n"+"\nKey must be 1 to 26!");
        System.out.println("*Exit For 2.*");
        //choice : only 2 exit 
        System.out.print("-> Enter Choice :");
        ch = sc.nextInt();
        if (ch==2) System.exit(0);
        while(ch != 2){
            //key is important for encrpytion & decryption. 
            System.out.print("-> Enter Key : ");
            key = sc.nextInt();
            int b = 26;
            if ((GCD.GCD(key,b)) == 1)
            {
                System.out.println("|| Key is Valid. ||");
                //PlainText to encrypt .
                System.out.print("-> \nEnter Plain Text for Encryption: ");
                sc.nextLine();
                plainText = sc.nextLine();
                System.out.println("|PlainText is Encrypting...|");
                //encrypted Text
                encryptedText = Encrypt.encrypt(plainText,key);
                System.out.println("|| Encryption is Successfully. ||");
                System.out.println("|| PlainText is : "+plainText+" -> Encrypted Text is : " + encryptedText+"||");
                System.out.println("\n*Decryption for 1.*");
                System.out.println("*Exit for 2*");
                System.out.print("->Enter Choice : ");
                //decryption choice 
                ch = sc.nextInt();
                if (ch == 2) System.exit(0);
                System.out.println("|EncryptedText is Decrypting...|");
                String decryptedText = Decrypt.decrypt(encryptedText,key);
                System.out.println("|| Decryption is SuccessFully. ||");
                System.out.println("|| Encrypted Text is "+encryptedText+". ||"); 
                System.out.println("|| Decrypted Text is "+decryptedText+". ||");
                System.out.println("|| Encrypted Text is : "+encryptedText+" -> Decrypted Text is : "+decryptedText+" ||");
                break;
            }
            else System.out.println("|->Key is Invalid !<-|");
        }
    }
}
