import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


class Player {
    String playerName;
    int level;
    int score;
    String playerClass;
    int health;
    int mana;
    String lastCheckpoint;

    public Player(String playerName, int level, int score, String playerClass, int health, int mana, String lastCheckpoint) {
        this.playerName = playerName;
        this.level = level;
        this.score = score;
        this.playerClass = playerClass;
        this.health = health;
        this.mana = mana;
        this.lastCheckpoint = lastCheckpoint;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public int getLevel() {
        return this.level;
    }

    public int getScore() {
        return this.score;
    }

    public String getPlayerClass() {
        return this.playerClass;
    }

    public int getHealth() {
        return this.health;
    }

    public int getMana() {
        return this.mana;
    }

    public String getLastCheckpoint() {
        return this.lastCheckpoint;
    }

    public String getAllPlayerInfo() {
        return "\n================= [ PLAYER STATS ] =================\n" +
                "👤 Name           : " + playerName + "\n" +
                "🎮 Class          : " + playerClass + "\n" +
                "⭐ Level          : " + level + "\n" +
                "🏆 Score          : " + score + "\n" +
                "❤️ Health         : " + health + "\n" +
                "🔮 Mana           : " + mana + "\n" +
                "📍 Last Checkpoint: " + lastCheckpoint + "\n" +
                "====================================================\n";
    }

}

class FileReaderUtil {
        public void displayCsvLines() {
            System.out.print("PlayerName:  je teste ");
            String filePath = "ex1/7/tab.csv";

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;

                // Ignore la première ligne (l’en-tête)
                reader.readLine();

                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");

                    if (data.length >= 7) {
                        String playerName = data[0];
                        int level = Integer.parseInt(data[1]);
                        int score = Integer.parseInt(data[2]);
                        String playerClass = data[3];
                        int health = Integer.parseInt(data[4]);
                        int mana = Integer.parseInt(data[5]);
                        String lastCheckpoint = data[6];

                        Player p = new Player(playerName, level, score, playerClass, health, mana, lastCheckpoint);
                        System.out.println(p.getAllPlayerInfo());
                    }
                }
            } catch (IOException error) {
                error.printStackTrace();
            }

        }

}

public class main {
    public static void main(String[] args) {

        FileReaderUtil util = new FileReaderUtil();
        util.displayCsvLines();


    }
}
