class player{
    String playerName;
    int level;
    int score;
    String playerClass;
    int health;
    int mana;
    String lastCheckpoint;

    public player(String playerName, int level, int score, String playerClass, int health, int mana, String lastCheckpoint ){
        this.playerName = playerName;
        this.level = level;
        this.score = score;
        this.playerClass = playerClass;
        this.health = health;
        this.mana = mana;
        this.lastCheckpoint = lastCheckpoint;
    }

    public getPlayerName(){
        this.playerName = playerName;
    }

    public getLevel(){
        this.level = level;
    }

    public  getScore(){
        this.score = score;
    }

    public getPlayerClass(){
        this.playerClass = playerClass;
    }

    public  getHealth() {
        this.health = health;
    }
    public  getMana() {
        this.mana = mana;
    }

    public getLastCheckpoint(){
        this.lastCheckpoint = lastCheckpoint;
    }

    public getAllPlayerInfo(){
        this.playerName = playerName;
        this.level = level;
        this.score = score;
        this.playerClass = playerClass;
        this.health = health;
        this.mana = mana;
        this.lastCheckpoint = lastCheckpoint;
    }
}


public class main {
    public static void main(String[] args) {

    }
}