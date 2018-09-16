package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet VirtualPetOne = new VirtualPet();

		System.out.println("Welcome please name your pet.");
		VirtualPetOne.name = input.nextLine();

		do {
			VirtualPetOne.petStatus();
			VirtualPetOne.petCommands();
			VirtualPetOne.userToDo = input.nextLine();
			VirtualPetOne.userAction();
			VirtualPetOne.tick();
		} while (VirtualPetOne.time < 100);
		input.close();
	}
}
