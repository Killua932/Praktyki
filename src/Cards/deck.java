package Cards;

import java.security.SecureRandom;
import java.util.ArrayList;

public class deck {

    ArrayList<card> deck;

    public deck(){

        deck = new ArrayList<>();

        String[] colors = {"Pik", "Karo", "Kier", "Trefl"};
        String znak;

        for (String color: colors) {
            for (int i = 2; i <= 14; i++) {
                switch (i) {
                    case 11:
                        znak = "J";
                        break;
                    case 12:
                        znak = "Q";
                        break;
                    case 13:
                        znak = "K";
                        break;
                    case 14:
                        znak = "A";
                        break;
                    default:
                        znak = Integer.toString(i);
                }
                card card = new card(color, i, znak);
                deck.add(card);
            }
        }
    }

    public card draw(){
        SecureRandom random = new SecureRandom();

        int index = random.nextInt(52);

        card card = deck.get(index);
        deck.remove(index);

        return card;
    }
}
