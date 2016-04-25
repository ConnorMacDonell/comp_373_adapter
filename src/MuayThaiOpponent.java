import java.util.Random;

/**
 * Created by Connor on 4/25/16.
 */

//Adaptee
public class MuayThaiOpponent {

    Random generator = new Random();

    public void headKick(){

        int kickAttempt = generator.nextInt(10) +1;

        if (kickAttempt == 10){
            System.out.println("Headkick successful, you have been knocked out.");
        }
        else{
            System.out.println("Headkick dodged.");
        }
    }

    public void liverPunch(){
        int punchAttempt = generator.nextInt(5) +1;

        if (punchAttempt == 5){
            System.out.println("Liver punch successful, you have been knocked out.");
        }
        else{
            System.out.println("Liver punch blocked.");
        }
    }

    public void catchPhrase(){
        System.out.println("Take two of these and lie down!");
    }
}
