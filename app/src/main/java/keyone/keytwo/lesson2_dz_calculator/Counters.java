package keyone.keytwo.lesson2_dz_calculator;

import java.io.Serializable;

public class Counters implements Serializable {


    // счетчики

    private int counter_1;
    private int counter_2;
    private int counter_3;
    private int counter_4;
    private int counter_5;
    private int counter_6;
    private int counter_7;
    private int counter_8;
    private int counter_9;
    private int counter_0;
    private int counter_zp;
    private int counter_plus;
    private int counter_minus;
    private int counter_umnogenie;
    private int counter_delenie;
    private int counter_ravno;

    // обработка кнопок в активити
    public Counters() {
        counter_1 = 0;
        counter_2 = 0;
        counter_3 = 0;
        counter_4 = 0;
        counter_5 = 0;
        counter_6 = 0;
        counter_7 = 0;
        counter_8 = 0;
        counter_9 = 0;
        counter_0 = 0;
        counter_zp = 0;
        counter_plus = 0;
        counter_minus = 0;
        counter_delenie = 0;
        counter_ravno = 0;
    }

    public int getCounter_1() {
        return counter_1;
    }

    public int getCounter_2() {
        return counter_2;
    }

    public int getCounter_3() {
        return counter_3;
    }

    public int getCounter_4() {
        return counter_4;
    }

    public int getCounter_5() {
        return counter_5;
    }

    public int getCounter_6() {
        return counter_6;
    }

    public int getCounter_7() {
        return counter_7;
    }

    public int getCounter_8() {
        return counter_8;
    }

    public int getCounter_9() {
        return counter_9;
    }

    public int getCounter_0() {
        return counter_0;
    }

    public int getCounter_zp() {
        return counter_zp;
    }

    public int getCounter_plus() {
        return counter_plus;
    }

    public int getCounter_minus() {
        return counter_minus;
    }

    public int getCounter_delenie() {
        return counter_delenie;
    }

    public int getCounter_ravno() {
        return counter_ravno;
    }

    public int getCounter_umnogenie() { return counter_umnogenie; }


    public void increaseCounter_1 () {
        counter_1++;
    }
    public void increaseCounter_2 () { counter_2++; }
    public void increaseCounter_3 () { counter_3++; }
    public void increaseCounter_4 () { counter_4++; }
    public void increaseCounter_5 () { counter_5++; }
    public void increaseCounter_6 () { counter_6++; }
    public void increaseCounter_7 () { counter_7++; }
    public void increaseCounter_8 () { counter_8++; }
    public void increaseCounter_9 () { counter_9++; }
    public void increaseCounter_0 () { counter_0++; }
    public void increaseCounter_zp () { counter_zp++; }
    public void increaseCounter_umnogenie () { counter_umnogenie++; }
    public void increaseCounter_delenie () { counter_delenie++; }
    public void increaseCounter_plus () { counter_plus++; }
    public void increaseCounter_minus () { counter_minus++; }
    public void increaseCounter_ravno () { counter_ravno++; }


}
