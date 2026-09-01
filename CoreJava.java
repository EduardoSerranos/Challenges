
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

















    }
}

