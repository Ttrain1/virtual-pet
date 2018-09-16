package virtualPet;

public class VirtualPet {
	public int hunger = 50;
	public int thirst = 50;
	public int happyness = 20;
	public String name;
	public int time = 0;
	public String userToDo;

	public int feed() {
		hunger += 30;
		thirst -= 5;
		happyness += 5;

		return (hunger);
	}

	public int water() {
		thirst += 40;

		return (thirst);
	}

	public int play() {
		hunger -= 30;
		thirst -= 30;
		happyness += 20;

		return (happyness);
	}

	public int tick() {
		time++;
		hunger -= 5;
		thirst -= 5;
		return (time + thirst);
	}

	public void userAction() {
		if (userToDo.equalsIgnoreCase("feed")) {
			feed();
			System.out.println("You Feed, " + name);
		} else if (userToDo.equalsIgnoreCase("water")) {
			water();
			System.out.println("You Water, " + name);
		} else if (userToDo.equalsIgnoreCase("play")) {
			play();
			System.out.println("You Play with, " + name);
		} else {
			System.out.println("You neglect, " + name);
		}
	}

	public void petStatus() {
		System.out.println("Turn, " + time);
		System.out.println(name);
		System.out.println("Hunger: " + hunger);
		System.out.println("Thirst: " + thirst);
		System.out.println("Happyness: " + happyness);
	}

	public void petCommands() {
		System.out.println("");
		System.out.println("What would you like to do?");
		System.out.println("1, Feed");
		System.out.println("2, Water");
		System.out.println("3, Play");
		System.out.println("4, Do Nothing");
	}

	public void deadPet() {
		if (hunger <= 0) {
			System.out.println("Great you let " + name + " die.");
			System.exit(0);
		} else if (thirst <= 0) {
			System.out.println("Great you let " + name + " die.");
			System.exit(0);
		}
	}

	public void happyPet() {
		if (happyness >= 100) {
			System.out.println("Congratulations your pet loves you.");
			System.out.println("You Win!");
			System.exit(0);
		}
	}
}