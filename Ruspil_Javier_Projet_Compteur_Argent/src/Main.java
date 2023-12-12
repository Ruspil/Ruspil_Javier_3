import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	//TODO Auto-generated method stub{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le montant : ");
        double montant = scanner.nextDouble();

        Compteur_Argents decomposeur = new Compteur_Argents();
        AffichageDuResultat afficheur = new AffichageDuResultat();
        afficheur.afficherResultat(decomposeur.decomposerArgent(montant * 100));  // Convertir en sous

        scanner.close();
    }
}
