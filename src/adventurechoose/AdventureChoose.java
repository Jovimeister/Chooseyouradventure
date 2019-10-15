/*
 * Jovan Gradojevic
 * 
 * and open the template in the editor.
 */
package adventurechoose;
import java.util.Scanner;
/**
 *
 * @author jovan
 */
public class AdventureChoose {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); 
        String responsel; 
        String response2; 
        String response3; 
        
        System. out.println("You have just begun grade 9 and must get to math class. You have entered the school. Where do you go?(Left/Right)"); 
        responsel = keyedInput.nextLine(); 
        if (responsel.equals("Left")) {
        System.out.println("You sprint left and see two open doors, but you don't now which one is to your classroom.(Left/Right)");
        response3 = keyedInput.nextLine();
        if (response3.equals("Right")) {
        System.out.println("You made it. You are on time!");
        } else if (response3.equals("Left")) {
        System.out.println("You enter the wrong class and are stuck during announcements.");
        }
        } else if (responsel.equals("Right")){
        System.out.println("You enter the science hallway.");
        System.out.println("You run down the hall and see and staircase. Do you go up or down.(Up/Down)");
        response2 = keyedInput.nextLine();
        if (response2.equals("Up")) {
        System.out.println("You are too late, the teacher catches you and forces you to listen to the announcements.");
        } else if (response2.equals("Down")) {
        System.out.println("You slip and die!");
        }
        }
    }
}
