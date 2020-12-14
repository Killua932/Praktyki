package kostka;

import java.security.SecureRandom;

public class kostka {
    int n;
    SecureRandom random;

    public kostka(int n){
        this.n=n;
        random = new SecureRandom();
    }

    public int roll(){

        return this.random.nextInt(n) +1;
    }
}
