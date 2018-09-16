package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet VirtualPetOne = new VirtualPet();

		System.out.println("Welcome please name your pet.");
		VirtualPetOne.name = input.nextLine();

		while (VirtualPetOne.time < 100)
		{
			VirtualPetOne.petStatus();
			VirtualPetOne.petCommands();
			VirtualPetOne.userToDo = input.nextLine();
			VirtualPetOne.userAction();
			VirtualPetOne.tick();
			VirtualPetOne.deadPet();
			VirtualPetOne.happyPet();
		}
		input.close();
	}
}
