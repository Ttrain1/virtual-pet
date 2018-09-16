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

		return (hunger + thirst + happyness);
	}

	public int water() {
		thirst += 40;

		return (hunger + thirst + happyness);
	}

	public int play() {
		hunger -= 30;
		thirst -= 30;
		happyness += 20;

		return (hunger + thirst + happyness);
	}

	public int tick() {
		time++;
		hunger -= 5;
		thirst -= 10;
		return (time + hunger + thirst);
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
	
	public void petStatus( ) {
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
}