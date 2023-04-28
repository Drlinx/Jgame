package team;

import java.util.ArrayList;

public class Player {
    ArrayList<Mon> members = new ArrayList<>();
    String name;
    int ai;
    Type t;

    public Player(String name, int ai){
        this.ai = ai;
        this.name = name;
    }
}
