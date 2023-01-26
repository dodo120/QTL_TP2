import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class Question1Test {
	
	@Test
    void testEquals() {
		Personne personne = new Personne("laville","lise");
        assertEquals("laville",personne.getNom());
    }
	
	@Test
    void testNotEquals() {
		Personne personne = new Personne("laville","lise");
        assertEquals("combier",personne.getNom());
    }
	
	@Test
    void testNull() {
		Personne personne = null;
        assertNull(personne);
    }
	
	@Test
    void testNotNull() {
		Personne personne = new Personne("laville","lise");;
        assertNotNull(personne);
    }
	
	@Test
    void testTrue() {
		boolean test = true;
        assertTrue(test);
    }
	
	@Test
    void testFalse() {
		boolean test = false;
        assertFalse(test);
    }
	
	@Test
    public void testFail() {
        int expected = 2;
        int actual = 1 + 2;
        assertEquals(expected, actual);
    }
	

}
