import java.util.Scanner;

/**
 * schedule
 */
public class schedule {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); 
        
        int daysOfTheWeek;

        System.out.println("Days of Week");
        System.out.println("1. Monday \n2. Tuesday \n3. Wednesday \n4. Thursday \n5. Friday \n6. Saturday \n7. Sunday \n");

        System.out.println("Enter the choice (1-7):");
        daysOfTheWeek = keyboard.nextInt();

        switch (daysOfTheWeek) {
            case 1:
                System.out.println("\nMonday: It is back to work. \n");
                String subChoice;
                System.out.println("1. Yes, I had my breakfast \n2. No, I would like one");
                System.out.println("Choose a choice 1 or 2:");
                if (keyboard.hasNextLine()) {
                    keyboard.nextLine();
                }
                subChoice = keyboard.nextLine();

                if (subChoice.equalsIgnoreCase("1")) {
                    System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes");
                }
                else if (subChoice.equalsIgnoreCase("2")) {
                    System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
                }
                else {
                    System.out.println("No such choice available");
                }
                break;
            
            case 2:
                System.out.println("Tuesday: Which coding language should I use?\n");
                String codingLanguage;
                System.out.println("\n1. C++ \n2. Java");
                System.out.println("Choose a choice 1 or 2:");
                if (keyboard.hasNextLine()) {
                    keyboard.nextLine();
                }
                codingLanguage = keyboard.nextLine();

                if (codingLanguage.equalsIgnoreCase("1")) {
                    System.out.println("Im going to code in C++");
                }
                else if (codingLanguage.equalsIgnoreCase("2")) {
                    System.out.println("Im going to code in Java");
                }
                else {
                    System.out.println("No such choice available");
                }
                break;
            
            case 3:
                System.out.println("Wednesday: Which design should I use.....");
                String designProgram;

                System.out.println("1. Simple Design \n2. Complex Design");
                System.out.println("Choose a choice 1 or 2:");
                if (keyboard.hasNextLine()){
                    keyboard.nextLine();
                }
                designProgram = keyboard.nextLine();

                if (designProgram.equalsIgnoreCase("1")){
                    System.out.println("Im going to use Simple Design in");
                } else if (designProgram.equalsIgnoreCase("2")) {
                    System.out.println("Im going to use Complex Design");
                } else {
                    System.out.println("No such choice available");
                }
                break;
            
            case 4:
                System.out.println("Thursday: It is back to work.");
                String chooseIDE;

                System.out.println("1. IntelliJ \n2. Eclipse \n3. VS Code");
                System.out.println("Choose a choice 1 - 3:");
                if (keyboard.hasNextLine()){
                    keyboard.nextLine();
                }
                chooseIDE = keyboard.nextLine();

                if (chooseIDE.equalsIgnoreCase("1")){
                    System.out.println("Im going to use IntelliJ");
                } else if (chooseIDE.equalsIgnoreCase("2")) {
                    System.out.println("Im going to use Eclipse");
                }else if (chooseIDE.equalsIgnoreCase("3")) {
                    System.out.println("Im going to use VS Code");
                } else {
                    System.out.println("No such choice available");
                }
                break;
            
            case 5:
                System.out.println("\nFriday: Were there any errors?.....");
                String errorsFound;

                System.out.println("1. Yes \n2. No");
                System.out.println("Choose a choice 1 or 2:");
                if (keyboard.hasNextLine()){
                    keyboard.nextLine();
                }
                errorsFound = keyboard.nextLine();

                if (errorsFound.equalsIgnoreCase("1")){
                    System.out.println("Lets work on Errors");
                } else if (errorsFound.equalsIgnoreCase("2")) {
                    System.out.println("No errors were found! I wanna have fun! \n");
                    System.out.println("1. at home \n2. in a bar \n3. with friends \n4. at a nightclub");
                    System.out.println("Choose one option from 1-4 to chill at");
                    if (keyboard.hasNextLine()){
                        keyboard.nextLine();
                    }

                    int haveFun = keyboard.nextInt();

                    switch (haveFun) {
                        case 1:
                            System.out.println("Lets chill at home");
                            break;
                        case 2:
                            System.out.println("Lets chill in a bar");
                            break;
                        case 3:
                             System.out.println("Lets chill with friends");
                             break;
                        case 4:
                            System.out.println("Lets chill at a nightclub");
                            break;
                        default:
                            System.out.println("No such choice available");
                            break;
                    }
                } else {
                    System.out.println("No such choice available");
                }
                break;

            case 6:
                System.out.println("Saturday: It is holiday.");
                break;

            case 7:
                System.out.println("Sunday: It is holiday.");
                break;

            default:
                System.out.println("You need more rest! Go sleep Zombie!");
                break;
        }

        
    }
}