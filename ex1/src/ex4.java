import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;




class ex4{
    /**
     *
     * @param min : min selectionné par l'utilisateur
     * @param max : max selectionné par l'utilisateur
     * @return
     */
    public static int random(int min, int max) {
        Random rand = new Random();

        // Renvoie un nombre aléatoire entre min (inclus) et max (inclus)
        return rand.nextInt(max - min + 1) + min;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenue dans le programme de génération d'un tableau par un utilisateur !");

        // Étape 0 : demander la taille du tableau

        System.out.println("Sélectionner une taille de tableau ! : ");
        int tabLength = input.nextInt();
        if(tabLength == 0) { // Vérification que la longeur du tableau ne soit pas inférieur à 0 ou égal à 0
            System.out.println("Vous ne pouvez pas choisir ne taille de tableau égale ou inférieur à 0");
            return;
        }

        int [] tab = new int[tabLength];

        //System.out.println("La longeur du tableau = " + test.length); => vérification de la longeur du tableau créé par l'utilisateur

        // Étape 1 : demander le minimum
        System.out.println("Sélectionner un nombre minimal plus grand ou égal à 0 : ");
        int numberMin = input.nextInt();

        // Étape 2 : demander le maximum après saisie du minimum
        System.out.println("Sélectionner un nombre maximum plus grand que 0 avec une limite de 100 : ");
        int numberMax = input.nextInt();

        System.out.println("min : " + numberMin + " max : " + numberMax);
        System.out.println("nombre random : " + random(numberMin, numberMax));

        /*Faire une boucle qui va boucler sur la longeur de mon tableau

        faire un appelle à la fonction random qui add dans le tableau
        */

        for (int i = 0; i < tab.length; i++) {
            try {
                int randomNum = random(numberMin, numberMax);
                tab[i] = randomNum;  // On assigne directement à l'index i
            } catch (Exception error) {
                System.out.println("Une erreur est survenue : " + error.getMessage());
            }
        }

        System.out.println("mon tableau : " + Arrays.toString(tab));
    };
    }


/* => l'utilisateur choisir la longueur du tableau et incrémente letableau par lui-même
public class ex4 {
    public static void main(String[] args) {

        int arrayLength;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quelle est la taille de votre tableau ? ");
        if (sc.hasNextInt()) {
            arrayLength = sc.nextInt();

            ArrayList<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < arrayLength; i++) {
                System.out.println("Veuillez entrer le nombre à l’index " + i + " :");
                int value = sc.nextInt();
                numbers.add(value);
            }

            System.out.println("Votre tableau : " + numbers);

            for (int j = 0; j < numbers.size(); j++) {
                try {
                    if (j == 0) {
                        int valueAtIndex0 = numbers.get(j);
                        System.out.println("La valeur à l'index 0 est : " + valueAtIndex0);
                        System.out.println("La première valeur du tableau divisée par elle-même : " + (valueAtIndex0 / valueAtIndex0));
                    } else {
                        System.out.println("Valeur à l'index " + j + " : " + numbers.get(j));
                        // Division sécurisée avec try / catch
                        int result = numbers.get(j) / numbers.get(j - 1);
                        System.out.println("Valeur divisée : " + result);
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Erreur : Division par zéro impossible à l'index " + (j - 1));
                } catch (Exception e) {
                    System.out.println("Une erreur est survenue : " + e.getMessage());
                }
            }
        }
    }
}
*/