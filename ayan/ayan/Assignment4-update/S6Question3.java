import org.omg.CORBA.ARG_OUT;

class Winamp {
    final void play() {
        System.out.println("First gen play");
    }
}

class WinampNextgen extends Winamp {
    void play() {
        System.out.println("nextgen play");
    }
}

public class S6Question3 {
    public static void main(String[] args) {
        WinampNextgen obj = new WinampNextgen();
        obj.play();
    }
}

// play() in WinampNextgen cannot override play() in Winamp
// void play() {
// ^
// overridden method is final