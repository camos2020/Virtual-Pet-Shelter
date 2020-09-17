package VirtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {


        String userPetChoice;
        Scanner input = new Scanner(System.in);

        VirtualPetShelter myShelter = new VirtualPetShelter();
        System.out.println("Which pet do you choose?");
        userPetChoice = input.nextLine();
        System.out.println("You choose ");


        myShelter.tick();



    }
}
