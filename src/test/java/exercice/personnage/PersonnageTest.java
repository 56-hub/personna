package exercice.personnage;

import exercice.personnage.Personnage;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonnageTest {
    @Test
    void tourner_0_devrait_retourne_NORD() {
        // GIVEN
        Personnage personnage = new Personnage();
        String expec = "NORD";
        // WHEN
        String ort = personnage.tourner(0);
        // THEN
        assertThat(ort).isEqualTo(expec);
    }

    @Test
    void tourner_1_retourne_EST() {
        // GIVEN
        Personnage personnage = new Personnage();
        String expec = "EST";
        // WHEN
        String ort = personnage.tourner(1);
        // THEN
        assertThat(ort).isEqualTo("EST");
    }
    @Test
    void tourner_2_retourne_SUD() {
        // GIVEN
        Personnage personnage = new Personnage();
        String expec = "SUD";
        // WHEN
        String ort = personnage.tourner(2);
        // THEN
        assertThat(ort).isEqualTo("SUD");
    }
    @Test
    void tourner_3_retourne_OUEST() {
        // GIVEN
        Personnage personnage = new Personnage();
        String expec = "OUEST";
        // WHEN
        String ort = personnage.tourner(3);
        // THEN
        assertThat(ort).isEqualTo("OUEST");
    }

}

