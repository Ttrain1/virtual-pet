package virtualPetTest;

import org.junit.Assert;
import org.junit.Test;

import virtualPet.VirtualPet;

public class VirtualPetTest {

	@Test

	public void shouldAddtoHunger() {
		// arrange
		int initaialHunger = 80;
		VirtualPet underTest = new VirtualPet();
		// act
		int hungerAdd = 30;
		underTest.feed();
		// assert
		int expectedhunger = initaialHunger + hungerAdd;
		Assert.assertEquals(expectedhunger, underTest.feed());
	}
	
	@Test
	
	public void shoudSubtract() {
		int initaialThirst = 51;
		VirtualPet underTest = new VirtualPet();
		int subtractThirst = 5;
		int expectedThirst = initaialThirst - subtractThirst;
		Assert.assertEquals(expectedThirst, underTest.tick());
		
	}
	
	
}
