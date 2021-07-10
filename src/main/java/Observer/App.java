package Observer;

public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer binario = new BinaryObserver(subject);
        Observer octal = new OctalObserver(subject);
        Observer Hexa = new HexaObserver(subject);

        System.out.println("Mostar numero: 13");
        subject.setNumber(13);
        System.out.println("\nMostar numero: 60");
        subject.setNumber(60);


    }
}
