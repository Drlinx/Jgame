package team;

import java.util.ArrayList;

public class Mon {
    ArrayList<Move> Moves = new ArrayList<Move>();
    String name; 
    String status = "Normal";
    int ID;
    int hp;
    int def;
    int speed;

    public Mon(){

    }

    public void TakeDamage(int x){
        this.hp -= x;
    }

    /**
     * @brief updates the status of the mon to knocked out.
     */
    void UpdateStatus(){
        status = "KO";
    }

    /**
     * @brief Updates the status of a mon to a specified status
     * @param NewStatus New status.
     */
    void UpdateStatus(String NewStatus){
        if(status.compareTo("KO") != 0){
            status = NewStatus;
        }
    }

    int IsStatus(){
      if(status.compareTo("KO") == 0){
        return -1;
      } else {
        return 0;
      }
    }
}
