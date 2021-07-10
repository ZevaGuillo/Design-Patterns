package Observer;

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println( "Hexadecimal: " + Integer.toHexString( subject.getNumber() ).toUpperCase() );
    }
}
