package lesson_1;

public class Human implements Irun, Ijamp {
    @Override
    public void heEvttn() {
        System.out.println(CREATURE +": человек, бежит 500м, потом переходит на шаг");

    }
    @Override
    public void heСan() {
        System.out.println(CREATURE1 +": человек, прыгает в длину 5м, в высоту 2м");

    }

}
