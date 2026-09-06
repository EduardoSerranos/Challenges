/////////////////////////////////////////////////////////
// Daily Challenge 9/3/2026
/////////////////////////////////////////////////////////
import java.util.Scanner;

class DailyChallenges {
    public static void main(String[] args) {

        //REPL App Challenge

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the REPL App! Please select an option from the menu below:");
        System.out.println("1.Help 2.Add 3.Subtract 4.Multiply 5.Divide 6.Random 7.Reverse 8.Quit");
        if(sc.hasNextInt()){
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Available commands: Add, Substract, Multiply, Divide, Random, Reverse, Quit");
                    break;
                case 2:
                    System.out.print("First number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Second number: ");
                    int num2 = sc.nextInt();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 3:
                    System.out.print("First number: ");
                    int num3 = sc.nextInt();
                    System.out.print("Second number: ");
                    int num4 = sc.nextInt();
                    System.out.println("Result: " + (num3 - num4));
                    break;
                case 4:
                    System.out.print("First number: ");
                    int num5 = sc.nextInt();
                    System.out.print("Second number: ");
                    int num6 = sc.nextInt();
                    System.out.println("Result: " + (num5 * num6));
                    break;
                case 5:
                    System.out.print("First number: ");
                    int num7 = sc.nextInt();
                    System.out.print("Second number: ");
                    int num8 = sc.nextInt();
                    if (num8 != 0) {
                        System.out.println("Result: " + (num7 / num8));
                    } else {
                        System.out.println("Error: Can not divide by zero.");
                    }
                    break;
                case 6:
                    int randomNum = (int)(Math.random() * 100) + 1;
                    System.out.println("Random number: " + randomNum);
                    break;
                case 7:
                    System.out.print("Enter a string to reverse: ");
                    String input = sc.next();
                    String reversed = new StringBuilder(input).reverse().toString();
                    System.out.println("Reversed string: " + reversed);
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
            }
        }
        sc.close();

        // Password Validator Challenge
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("The password must: ");
        System.out.println("");
        System.out.println("Be at least 8 characters");
        System.out.println("Contain at least one uppercase letter");
        System.out.println("Contain at least one lowercase letter");
        System.out.println("Contain at least one number");
        System.out.println("Output: ");
        if(scanner.hasNextLine()){
            String password = scanner.nextLine();
            if (password.length() < 8) {
                System.out.println("Password rejected: ");
                System.out.println("- Must contain at least 8 characters.");
            } else if (!password.matches(".*[A-Z].*")) {
                System.out.println("Password rejected: ");
                System.out.println("- Must contain at least one uppercase letter.");
            } else if (!password.matches(".*[a-z].*")) {
                System.out.println("Password rejected: ");
                System.out.println("- Must contain at least one lowercase letter.");
            } else if (!password.matches(".*\\d.*")) {
                System.out.println("Password rejected: ");
                System.out.println("- Must contain at least one number.");
            } else {
                System.out.println("Password accepted!");
            }
        }
        scanner.close();
        // Word Analyzer Challenge

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc2.nextLine();
        System.out.println("");
        System.out.println("Characters: " + word.length());
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowels++;
            } 
            if (Character.isDigit(c)) {
                digits++;
            }
            if (Character.isWhitespace(c)) {
                spaces++;
            }
            else {
                consonants++;
            }

        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        sc2.close();

    }
}