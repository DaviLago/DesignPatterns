package Model;

import java.util.Observable;

public class Modelo extends Observable {

    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;

    public Modelo() {
        this.num1 = 0;
        this.num2 = 0;
        this.num3 = 0;
        this.num4 = 0;
        this.num5 = 0;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
        setChanged();
        notifyObservers();

    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
        setChanged();
        notifyObservers();
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
        setChanged();
        notifyObservers();
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
        setChanged();
        notifyObservers();
    }

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
        setChanged();
        notifyObservers();
    }
}
