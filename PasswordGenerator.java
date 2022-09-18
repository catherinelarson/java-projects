import java.util.Scanner;
import java.util.Random;
public class PasswordGenerator {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String password;
    String[] allChars ={"1","2", "3", "4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","!","@","#","$","%","&","*"};
    String[] capsLetters={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String[] specialChars={"!","@","#","$","%","&","*"};
    String[] numbers={"1","2","3", "4","5","6","7","8","9"};
    public static void main(String[] args) {
        PasswordGenerator pass = new PasswordGenerator();
        pass.generatePassword();
        System.out.println(pass.password);
    }
    public PasswordGenerator() {

    }
    public String[] genericGenerator(int passLength) {
        String[] password = new String[passLength];
        for(int i=0; i<password.length; i++) {
            int randomInt = random.nextInt(allChars.length);
            password[i]=allChars[randomInt];
        }
        return password;
    }
    public void generatePassword() {
        boolean passNotChosen=true;
        while(passNotChosen) {
        System.out.println("Hello, and thank you for using this program. Please indicate the type of password you wish to generate.");
        System.out.println("1. Standard random password.");
        System.out.println("2. Password containing at least one capital letter.");
        System.out.println("3. Password containing at least one special character.");
        System.out.println("4. Password containing at least one number.");
        System.out.println("5. Password containing one of each of these.");
        int passChoice = scanner.nextInt();
        switch (passChoice) {
            case 1:
                System.out.println("You have chosen to generate a Standard Random Password. Is this correct?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int stand = scanner.nextInt();
                if(stand==2) {
                break;}
                else {
                    passNotChosen=false;
                    boolean numNotChosen = true;
                    while(numNotChosen) {
                    System.out.println("Please input how many characters you would like for this password to be.");
                    int charNum=scanner.nextInt(); 
                    System.out.println("You have chosen "+charNum+" characters. Is this correct?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int charChoice=scanner.nextInt();
                    if(charChoice==2||charNum<1) {}
                    else{
                        numNotChosen=false;
                        String[]password= genericGenerator(charNum);
                        String pass="";
                        for(int q=0; q<password.length; q++) {
                            pass+=password[q];
                        }
                        this.password=pass;
                    }
                    
                }
            }break;
            
            case 2:
                System.out.println("You have chosen to generate a Password containing at least one capital letter. Is this correct?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int standy = scanner.nextInt();
                if(standy==2) {
                break;}
                else {
                    passNotChosen=false;
                    boolean numNotChosen = true;
                    while(numNotChosen) {
                    System.out.println("Please input how many characters you would like for this password to be.");
                    int charNum=scanner.nextInt(); 
                    System.out.println("You have chosen "+charNum+" characters. Is this correct?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int charChoice=scanner.nextInt();
                    if(charChoice==2||charNum<1) {}
                    else{
                        numNotChosen=false;
                        String[] password= genericGenerator(charNum);
                        int randomInt= random.nextInt(capsLetters.length);
                        int rando2=random.nextInt(password.length);
                        password[rando2]=capsLetters[randomInt];
                        String pass="";
                        for(int q=0; q<password.length; q++) {
                            pass+=password[q];
                        }
                        this.password=pass;
                    }
                    
                }
            }break;
            case 3:
            System.out.println("You have chosen to generate a Password containing at least one special character. Is this correct?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int a = scanner.nextInt();
            if(a==2) {
            break;}
            else {
                passNotChosen=false;
                boolean numNotChosen = true;
                while(numNotChosen) {
                System.out.println("Please input how many characters you would like for this password to be.");
                int charNum=scanner.nextInt(); 
                System.out.println("You have chosen "+charNum+" characters. Is this correct?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int charChoice=scanner.nextInt();
                if(charChoice==2||charNum<1) {}
                else{
                    numNotChosen=false;
                    String[] password= genericGenerator(charNum);
                    int randomInt= random.nextInt(specialChars.length);
                    int rando2=random.nextInt(password.length);
                    password[rando2]=specialChars[randomInt];
                    String pass="";
                    for(int q=0; q<password.length; q++) {
                        pass+=password[q];
                    }
                    this.password=pass;
                }
                
            }
        }break;
        case 4:
                System.out.println("You have chosen to generate a Password containing at least one number. Is this correct?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int e = scanner.nextInt();
                if(e==2) {
                break;}
                else {
                    passNotChosen=false;
                    boolean numNotChosen = true;
                    while(numNotChosen) {
                    System.out.println("Please input how many characters you would like for this password to be.");
                    int charNum=scanner.nextInt(); 
                    System.out.println("You have chosen "+charNum+" characters. Is this correct?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int charChoice=scanner.nextInt();
                    if(charChoice==2||charNum<1) {}
                    else{
                        numNotChosen=false;
                        String[] password= genericGenerator(charNum);
                        int randomInt= random.nextInt(numbers.length);
                        int rando2=random.nextInt(password.length);
                        password[rando2]=numbers[randomInt];
                        String pass="";
                        for(int q=0; q<password.length; q++) {
                            pass+=password[q];
                        }
                        this.password=pass;
                    }
                    
                }
            }break;
            case 5:
                System.out.println("You have chosen to generate a Password containing one each of a special character, number, and capital letter. Is this correct?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int w = scanner.nextInt();
                if(w==2) {
                break;}
                else {
                    passNotChosen=false;
                    boolean numNotChosen = true;
                    while(numNotChosen) {
                    System.out.println("Please input how many characters you would like for this password to be (Must be greater than 3).");
                    int charNum=scanner.nextInt(); 
                    System.out.println("You have chosen "+charNum+" characters. Is this correct?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int charChoice=scanner.nextInt();
                    if(charChoice==2||charNum<3) {}
                    else{
                        numNotChosen=false;
                        String[] password= genericGenerator(charNum);

                        boolean specialsNotAdded=true;
                        while(specialsNotAdded) {
                        int rando1= random.nextInt(numbers.length);
                        int rando2=random.nextInt(password.length);
                        int rando3= random.nextInt(specialChars.length);
                        int rando4=random.nextInt(password.length);
                        int rando5= random.nextInt(capsLetters.length);
                        int rando6=random.nextInt(password.length);
                        if(rando2!=rando4&&rando4!=rando6&&rando6!=rando2) {
                            specialsNotAdded=false;
                            password[rando2]=numbers[rando1];
                            password[rando4]=specialChars[rando3];
                            password[rando6]=capsLetters[rando5];
                        }
                        

                        }
                        String pass="";
                        for(int q=0; q<password.length; q++) {
                            pass+=password[q];
                        }
                        this.password=pass;
                        
                    }
                    
                }
            }break;
            default:
  
                break;
        }

    }
   }
}
