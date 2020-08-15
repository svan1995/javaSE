package com.csf.enum_learning;

public class App01 {
    public static void main(String[] args) {
        Weekday[] values = Weekday.values();
        for(Weekday weekday : values){
            System.out.println(weekday);
        }

        for(WeekdayTwo w : WeekdayTwo.values()){
            System.out.println(w + "-" + w.ordinal() + "-" + w.getIndex());
        }
    }


}

enum Weekday{
    SUN, MON, TUS, WED, THU, FRI, SAT;
}

enum WeekdayTwo{
    MON(1), TUS(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);

    private int index;

    private WeekdayTwo(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
