
import java.util.Scanner;

public class User_rides {

    private static int pin;

    public static void main(String[] args) {
        String name;

        System.out.println("* Please enter your name sir :");
        getter_and_setter rides = new getter_and_setter();
        Scanner input = new Scanner(System.in);
        String User_name = input.next();
        System.out.println("* Please enter your pin number :");
                
        int input_pin = input.nextInt();

        if (input_pin == rides.getUser_pin()) {

            System.out.println("Thank you sir " + User_name + " Please choose your rides");
            System.out.println("1.Bike rides" + " 2.Care rides" + " 3.CNG rides");
            int user_option_select_number = input.nextInt();
            String user_selected_option;

            switch (user_option_select_number) {

                case 1:

                    System.out.println("* Please give your pick up location : ");
                    getter_and_setter location = new getter_and_setter();
                    String pick_up_location = input.next();
                    System.out.println("* Please give your destination : ");
                    getter_and_setter location2 = new getter_and_setter();
                    String destination = input.next();
                    System.out.println("* Thank you sir ");
                    break;
                case 2:
                    System.out.println("* Please give your pick up location : ");
                    getter_and_setter car_location = new getter_and_setter();
                    String pick_up_car_location = input.next();
                    System.out.println("* Please give your destination : ");
                    getter_and_setter car_location2 = new getter_and_setter();
                    String car_destination = input.next();
                    System.out.println("* Thank you sir ");
                    
                    break;
                case 3:
                    
                    
                    System.out.println("* Please give your pick up location : ");
                    getter_and_setter cng_location = new getter_and_setter();
                    String pick_up_cng_location = input.next();
                    System.out.println("* Please give your destination : ");
                    getter_and_setter cng_location2 = new getter_and_setter();
                    String cng_destination = input.next();

                    break;
            }
                    System.out.println("* Thank you sir " +User_name+ " Enjoy your rides");

            

        } else {
            System.out.println("Your pin is wrong");
        }
    }

}
