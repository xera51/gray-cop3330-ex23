/*
 *  UCF COP3330 Summer 2021 Exercise 23 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        myApp.carTroubleshooter();
    }

    public void carTroubleshooter() {
        if(yesNoToBool("Is the car silent when you turn the key? ")) {
            if(yesNoToBool("Are the battery terminals corroded? ")) {
                displayResult("Clean terminals and try starting again.");
            } else {
                displayResult("Replace cables and try again.");
            }
        } else {
            if(yesNoToBool("Does the car make a slicking noise? ")) {
                displayResult("Replace the battery.");
            } else {
                if(yesNoToBool("Does the car crank up but fail to start? ")) {
                    displayResult("Check spark plug connections.");
                } else {
                    if(yesNoToBool("Does the engine start and then die? ")) {
                        if(yesNoToBool("Does you car have fuel injection? ")) {
                            displayResult("Get it in for service.");
                        } else {
                            displayResult("Check to ensure the choke is opening and closing.");
                        }
                    } else {
                        displayResult("This should not be possible.");
                    }
                }
            }
        }
    }

    // any answer besides 'y' is treated as false
    private static boolean yesNoToBool(String question) {
        System.out.print(question);
        char response = in.nextLine().charAt(0);

        return response == 'y';
    }

    private static void displayResult(String result) {
        System.out.println(result);
        System.exit(0);
    }
}
