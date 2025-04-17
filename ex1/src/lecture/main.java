package lecture;
import java.nio.file.*;
import java.io.IOException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

//ex 5
/*public class main {
    public static void main(String[] args){
        try {
            byte[] bytes  = Files.readAllBytes(Paths.get("src/testLecture.json"));
            String contenu = new String(bytes);
            System.out.println("Contenu brut : ");
            System.out.println(contenu);

            String target = "Bonjour";
            int count = 0;
            int index = 0;

            while((index = contenu.indexOf(target, index)) != -1){
                count++;
                index += target.length();
            }

            System.out.println("Le string '" + target + "' a été trouvé " + count + " fois.");

            if(contenu.contains("Bonjour")){
                System.out.println("Trouvé dans le Json");
            }
        }catch (IOException error){
            error.printStackTrace();
        }
    }
}
*/

// ex 6
public class main {
    public static void main(String[] args) {
        // Dictionnaire pour stocker la fréquence de chaque caractère
        Map<Character, Integer> compteur = new HashMap<>();

        try {
            FileReader reader = new FileReader("src/testLecture.json");
            int caractere;

            while ((caractere = reader.read()) != -1) {
                char c = (char) caractere;

                // Mise à jour du compteur
                compteur.put(c, compteur.getOrDefault(c, 0) + 1);
            }

            reader.close();

            // Affichage des résultats
            for (Map.Entry<Character, Integer> entry : compteur.entrySet()) {
                System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}