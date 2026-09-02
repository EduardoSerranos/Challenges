
class CoreJava {
    public static void main(String[] args) {

        
    //Challenge Hello World
    System.out.println("Hello World");

    // Challenge Printing Output
    int age = 23;
    double height = 5.8;
    String name = "Eduardo";
    System.out.println(name + ", Age: "+ age + ", Height: "+ height);

    //Challenge Operators
    int a = 20;
    int b = 10;
    System.out.println("Addition: " + (a + b));
    System.out.println("Subtraction: " + (a - b));
    System.out.println("Multiplication: " + (a * b));
    System.out.println("Division: " + (a / b));
    if (a > b){
        System.out.println("Is a greater than b? true");
    }
    if (a > b && b > 0){
        System.out.println("Is a > b and b > 0? true");
    }

    //Challenge Control Flow
    int score = 75;
    if (score >=50){
        System.out.println("Passed");
    } else {
        System.out.println("Failed");
    }

    if (score >= 90){
        System.out.println("Grade: A");
    } else if (score < 90 && score >= 75){
        System.out.println("Grade: B");
    } else if (score < 75 && score >= 60){
        System.out.println("Grade: C");
    } else{
        System.out.println("Grade: D");
    }

//Challenge Loops
    String output = "";
    for (int i = 1; i <= 5; i++){
        output += i + " ";
    }
    System.out.println("For Loop: " + output);

    String output2 = "";
    int i = 1;
    while (i <= 5){
        output += i + " ";
        i++;
    }
    System.out.println("While Loop: " + output2); 

    String output3 = "";
    int j = 1;
    do {
        output3 += j + " ";
        j++;
    } while (j <= 5);
    System.out.println("Do-While Loop: " + output3);

//Challenge Calculator

    double num1 = 7;
    double num2 = 3;
    char operator = '+';
    boolean y = true;
    while(y == true){
        if (operator == '+'){
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-'){
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*'){
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/' && num2 != 0){
            System.out.println("Result: " + (num1 / num2));
        } else {
            System.out.println("Invalid operator");
        }
        y = false;
        System.out.println("Thank you for using the calculator.");
    }
    
    //Challenge calculate 5 test scores:

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 5 test scores: 1:");
    int score1 = sc.nextInt();
    System.out.print("2:");
    int score2 = sc.nextInt();
    System.out.print("3:");
    int score3 = sc.nextInt();
    System.out.print("4:");
    int score4 = sc.nextInt();
    System.out.print("5:");
    int score5 = sc.nextInt();

    System.out.println("If the 5 test scores are: " + score1 + ", " + score2 + ", " + score3 + ", " + score4 + ", " + score5);
    System.out.println("Then:");
    System.out.println("");
    System.out.println("Total: " + (score1 + score2 + score3 + score4 + score5));
    System.out.println("Average: " + ((score1 + score2 + score3 + score4 + score5) / 5));
    System.out.println("Highest: " + Math.max(Math.max(Math.max(Math.max(score1, score2), score3), score4), score5));
    System.out.println("Lowest: " + Math.min(Math.min(Math.min(Math.min(score1, score2), score3), score4), score5));

    System.out.println("Your values were:");

    int[] scores = {score1, score2, score3, score4, score5};

    for(int k = 0; k < scores.length; k++){
        if(scores[k] >= 90){
            System.out.println(k + " - A");
        } else if (scores[k] < 90 && scores[k] >= 75){
            System.out.println(k + " - B");
        } else if (scores[k] < 75 && scores[k] >= 60){
            System.out.println(k + " - C");
        } else if (scores[k] < 60 && scores[k] >= 50){
            System.out.println(k + " - D");
        } else {
            System.out.println(k + " - F");
        }
    }
    sc.close();

    //Challenge - REPL

    Scanner sc = new Scanner(System.in);
    System.out.println("1. Check Balance 2. Deposit 3. Withdraw 4. Exit");
    if (sc.hasNextInt()){
        int choice = sc.nextInt();
        int balance = 0;
        switch (choice){
            case 1:
                System.out.println("Your balance is: " + balance);
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                int deposit = sc.nextInt();
            case 3:
                System.out.print("Enter amount to withdraw: ");
                int withdraw = sc.nextInt();
            case 4:
                System.out.println("Thank you for using our Banking system.");
                break;

        }
    }

    
    






    }
}

