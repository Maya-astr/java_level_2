package lesson_1;

public class MaleCat implements Irun, Ijamp {
    @Override

    public void heEvttn() {
        System.out.println(CREATURE + ": кот, бегает и днем, и ночью");

    }
    @Override
    public void heСan() {
        System.out.println(CREATURE1 + ": кот, прыгает в высоту на 1,5 метра, а в длину на 3м");
    }
}


