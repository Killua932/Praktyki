package Cards;

public class main {
    public static void main(String[] args) {

        deck deck = new deck();

//        for (Card c: deck.deck){
//            System.out.println(c);
//        }


        System.out.println(deck.deck.size());
        card card = deck.draw();
        System.out.println(deck.deck.size());
        System.out.println(card);
    }
}