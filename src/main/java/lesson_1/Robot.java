package lesson_1;

public class Robot implements Irun, Ijamp {
    @Override

    public void heEvttn() {
        System.out.println(CREATURE + ": робот, бегать не может,- только передвигается");

    }
    @Override
    public void heСan() {
        System.out.println(CREATURE1 + ": робот, не прыгает совсем");
    }
}
