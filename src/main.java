/**
 * Created by Connor on 4/25/16.
 */

//main method for testing

public class main {
    public static void main(String[] args){

        JiuJitsuOpponent RoyceGracie = new JiuJitsuOpponent();

        MuayThaiOpponent JohnWayneParr = new MuayThaiOpponent();

        JiuJitsuFighter muayThaiAdapter = new MuayThaiOpponentAdapter(JohnWayneParr);

        System.out.println("Muay Thai Fight");

        JohnWayneParr.catchPhrase();
        JohnWayneParr.headKick();
        JohnWayneParr.liverPunch();

        System.out.println("Jiu Jitsu Fight");

        RoyceGracie.passGuard();
        RoyceGracie.armBar();
        RoyceGracie.catchPhrase();

        System.out.println("Muay Thai Fight with Adapter");

        muayThaiAdapter.catchPhrase();
        muayThaiAdapter.armBar();
        muayThaiAdapter.passGuard();
    }
}
