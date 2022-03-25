package lesson_1;

public class Main {
    public static void main(String[] args) {
        Irun malecat = new MaleCat();
        Irun human = new Human();
        Irun robot = new Robot();
        Irun [] masExist = {malecat, human, robot};
        for (int i=0; i < masExist.length; i++){
            masExist[i].heСan();
        }
        for (int i=0; i < masExist.length; i++) masExist[i].heEvttn();
    }

}
