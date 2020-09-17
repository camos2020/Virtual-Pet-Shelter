package VirtualPetShelter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VirtualPetShelterTest {
    public static void main(String[] args) {

    }

    @Test
    public void shouldSayName() {
        VirtualPet underTest = new VirtualPet();
        underTest.setName("Fido");
        assertEquals("Fido", underTest.getName());
    }

    @Test
    public void shouldSayHunger() {
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getHungerLevel();
        assertEquals(100, result);
    }

    @Test
    public void shouldSayThirst() {
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getThirstLevel();
        assertEquals(100, result);
    }

    @Test
    public void shouldSayBoredom() {
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getBoredomeLevel();
        assertEquals(100, result);
    }

    @Test
    public void shouldSaywellness() {
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getWellnessLevel();
        assertEquals(100, result);
    }

    @Test
    public void shouldSaysleepLevel() {
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getSleepLevel();
        assertEquals(100, result);
    }

}
