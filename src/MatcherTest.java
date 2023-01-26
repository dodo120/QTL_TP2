import org.junit.jupiter.api.Test;
import static org.hamcrest.BaseMatcher.*;

import static org.hamcrest.MatcherAssert.assertThat;

public class MatcherTest {
	
	@Test
	public void givenBean_whenHasValue_thenCorrect() {
	    Personne person = new Personne("combier", "clément");
	    assertThat(person, hasPropertygg("nom",is("combier")));
	}

}
