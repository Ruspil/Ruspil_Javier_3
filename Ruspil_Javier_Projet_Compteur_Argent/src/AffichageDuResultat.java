
public class AffichageDuResultat {
	//TODO Auto-generated method stub{
	
	// CONSTANTE EN MAJUSCULE avec  private static final
	
    private static final int[] BILLETS = { 100, 50, 25, 10, 5 };
    private static final int[] PIECES = { 200, 100, 50, 25, 10, 5 };

    public void afficherResultat(int[][] decomposition) { // boucle qui affiche le nombre de billets/pièces en chiffre
        System.out.println("\nBillets : "); //Titre /n sauter de ligne
        for (int i = 0; i < BILLETS.length; i++) {
            System.out.println("Billets de " + BILLETS[i] + " $ : " + decomposition[i][0]);
        }

        System.out.println("\nPièces : "); //Titre /n sauter de ligne
        for (int i = 0; i < PIECES.length; i++) {
            System.out.println("Pièces de " + (double) PIECES[i] / 100 + " $ : " + decomposition[i + BILLETS.length][0]);
        }
    }
}