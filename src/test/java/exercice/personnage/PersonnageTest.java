package exercice.personnage;

import exercice.personnage.Personnage;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonnageTest {
    @Test
    void tourner_0_devrait_retourne_NORD() {
        // GIVEN
        Personnage personnage = new Personnage();
        // WHEN
        String orientation = personnage.tourner(0);
        // THEN
        assertThat(orientation).isEqualTo("NORD");
    }
}

