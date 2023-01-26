import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class CalculatriceTest {

	@Test
    void testCalculatriceAddition() {
		Calculatrice calculatrice = new Calculatrice();
        assertThat(2,is(equalTo(calculatrice.addition(1, 1))));
    }
	
	@Test
    void testCalculatriceSoustraction() {
		Calculatrice calculatrice = new Calculatrice();
		assertThat(2,is(equalTo(calculatrice.soustraction(4, 2))));
    }
	
	@Test
    void testCalculatriceMultiplication() {
		Calculatrice calculatrice = new Calculatrice();
        assertThat(1581930.0,is(equalTo(calculatrice.multiplication(434, 3645))));
    }
	
	@Test
    void testCalculatriceDivision() {
		Calculatrice calculatrice = new Calculatrice();
		assertThat(10.0,is(equalTo(calculatrice.division(42,4))));
    }
	
	@Test
    void testCalculatriceCalcul() {
		Calculatrice calculatrice = new Calculatrice();
		assertThat(46.0,is(equalTo(calculatrice.calcul(42,4,"+"))));
    }
}
