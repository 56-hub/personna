package exercice.personnage;
public class Personnage {
    public String tourner(int nbr) {
        if (nbr == 0)
            return "NORD";
        else if (nbr == 1)
            return "EST";
        else if (nbr == 2) // Ajout pour gérer le cas 2
            return "SUD";
     //   else if (nbr == 3) // Ajout pour gérer le cas 3
       //    return "OUEST";
        return "";
    }
}
