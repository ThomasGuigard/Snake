package main.java.Entity;

import java.util.concurrent.ThreadLocalRandom;


/**
 * Created by Olivier on 29/06/2017.
 */

public class Food {

    private int positionX;
    private int positionY;
    private boolean isAte;

    public Food() {
        positionX = ThreadLocalRandom.current().nextInt(0, 19+ 1);
        positionY = ThreadLocalRandom.current().nextInt(0, 19+ 1);
        isAte = false;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public boolean isAte() {
        return isAte;
    }

    public void setAte(boolean ate) {
        isAte = ate;
    }
}
