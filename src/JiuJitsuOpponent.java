/**
 * Created by Connor on 4/25/16.
 */

import java.util.Random;

public class JiuJitsuOpponent implements JiuJitsuFighter {

    Random generator = new Random();

    @Override
    public void passGuard(){
        int passAttempt = generator.nextInt(5) + 1;
        if (passAttempt == 5){
            System.out.println("Guard passed.");
        }
        else System.out.println("Guard maintained.");
    }

    @Override
    public void armBar(){
        int armBarAttempt = generator.nextInt(2) +1;
        if(armBarAttempt == 2){
            System.out.println("Armbar successful, you have lost.");
        }
        else{
            System.out.println("Armbar defended.");
        }
    }

    @Override
    public void catchPhrase(){
        System.out.println("Porra!");
    }
}
