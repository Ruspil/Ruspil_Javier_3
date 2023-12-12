
public class Compteur_Argents {
	//TODO Auto-generated method stub{
	
	// CONSTANTE EN MAJUSCULE avec  private static final
	
    private static final int[] VALEURS = { 10000, 5000, 2500, 1000, 500, 200, 100, 50, 25, 10, 5 }; // en sous donc ils ont toute été * 100 plus facile a séparer 
    private static final int NB_TYPES = VALEURS.length;

    public int[][] decomposerArgent(double montant) {
        int[][] decomposition = new int[NB_TYPES][2];

        for (int i = 0; i < NB_TYPES; i++) { //boucle qui divise le montant pour trouver chacune des pièces/billets
            decomposition[i][0] = (int) (montant / VALEURS[i]);
            montant = montant % VALEURS[i]; 
            decomposition[i][1] = VALEURS[i]; // stocker la valeurs dans décomposition
        }
        
        return decomposition; // Retourner la décomposition
    }
}
