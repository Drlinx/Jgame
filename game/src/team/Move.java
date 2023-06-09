package team;
import java.util.Random;


public class Move {
    String Name;
    
    int damage;
    // Bounds: 0-100
    int accuracy;
    int uses;
    int type;

    // Defualt critical hit info
    int CD = 2;
    int CR = 1;

    public Move(){

    }

    public int Use(int Uatk, int Odef){

        //Out of uses?
        if (uses <= 0){
            return 0;
        }
        uses--;

        Random rng = new Random();
        int x = rng.nextInt(100);
        if(x < CR){
            return DmgCalc(CD, Uatk, Odef);
        } else if (x < accuracy){
            return DmgCalc(1, Uatk, Odef);
        } else {
            return 0;
        }
    }

    /**
     * @brief Damage calculation equation.
     * @param C Critical hit damage
     * @param Uatk User Attack
     * @param Odef Opponent defense
     * @return The damage the mon will take.
     */
    public int DmgCalc(int C, int Uatk, int Odef){
        int x = damage * Uatk * C * 3;
        x /= Odef * 2;
        return x;
    }
}
