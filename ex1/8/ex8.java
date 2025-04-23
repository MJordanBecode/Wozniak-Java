import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * @de
 */
class Emergency{

    String date;
    int cardiology, radiology, visitors, emergency, neurology;

    //creation of the constructor

        public Emergency(String date, int cardiology, int radiology, int visitors, int emergency, int neurology){
            this.date = date;
            this.cardiology = cardiology;
            this.radiology = radiology;
            this.visitors = visitors;
            this.emergency = emergency;
            this.neurology = neurology;
        }

        //Get all tab :

        public String getDate(){
            return date;
        }
        public int getCardiology(){
            return cardiology;
        }
        public int getRadiology(){
            return radiology;
        }
        public int getVisitors(){
            return visitors;
        }
        public int getEmergency(){
            return emergency;
        }
        public int getNeurology(){
            return neurology;
        }

        public String toCsv(){
            return "\n================= [ Emergency Stats ] =================\n" +
                    "📅 Date: " + date + "\n"
                    + "❤️ Cardiology: " + cardiology + "\n"
                    + "🩻 Radiology: " + radiology + "\n"
                    + "👥 Visitors: " + visitors + "\n"
                    + "🚨 Emergency: " + emergency + "\n"
                    + "🧠 Neurology: " + neurology + "\n" +
                    "====================================================\n";
        }
}

class readFile{
        String filePath = "ex1/8/emergency.csv";
    public void displayCsvLines(){
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            //Ignore la première ligne de (l'en-tête)
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] EmergencyData = line.split(",");

                if(EmergencyData.length >= 6){
                    String date = EmergencyData[0];
                    int cardiology = Integer.parseInt(EmergencyData[1]);
                    int radiology = Integer.parseInt(EmergencyData[2]);
                    int visitors = Integer.parseInt(EmergencyData[3]);
                    int emergency = Integer.parseInt(EmergencyData[4]);
                    int neurology = Integer.parseInt(EmergencyData[5]);

                    Emergency info = new Emergency(date, cardiology, radiology, visitors, emergency, neurology);
                    System.out.println(info.toCsv());
                }
            }
        } catch (IOException error){
            System.out.println(error);}
    }

    public void writeToFile(){
        /*Créer un tableau qui va récupérer mes valeurs [sous formes de tableau d'objet donc, key:value]*/

        String{} test;
    }
}


public class ex8{

    public static <object> void main (String[] args) {
        //display toutes les data de mon fichier CSV
        System.out.println("Hello World");
        readFile test = new readFile();
        test.displayCsvLines();

        //Attend la réponse de l'utilisateur pour appeler la fonction qui va écrire dans le fichier
        char response;
        System.out.println("Voullez-vous écrire un rapport ? (Saississez 'y' ou 'n' )\n");
        Scanner sc = new Scanner(System.in);
        response = sc.next().charAt(0);

        if(response == 'y'){

            Map<String, Object> emergencyData = new HashMap<>();
            System.out.println("");
        }



    }
}