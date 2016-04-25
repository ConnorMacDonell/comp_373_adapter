/**
 * Created by Connor on 4/25/16.
 */

//Adapter


public class MuayThaiOpponentAdapter implements JiuJitsuFighter {

    MuayThaiOpponent thaiStyle;

    public MuayThaiOpponentAdapter(MuayThaiOpponent newOpponent){
        thaiStyle = newOpponent;
    }

    @Override
    public void passGuard() {

        thaiStyle.headKick();
    }

    @Override
    public void armBar() {

        thaiStyle.liverPunch();

    }

    @Override
    public void catchPhrase() {

        thaiStyle.catchPhrase();

    }
}
