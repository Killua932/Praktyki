package moneta;

import java.security.SecureRandom;

public class moneta {

    public static int losowanie(){
//obiekt generatora
        SecureRandom random = new SecureRandom();
//losuj miedzy dwoma intami
        int a = random.nextInt(2);
//zwroc a
        return a;


    }

    public static void main(String[] args) {
//int losowania
        int a =losowanie();
//sprawdzanie wartosci ktora wylosowalo
        if(a==1){
//pokazuje orzel
            System.out.print("Orzeł");
        }
// inaczej wywola reszke
        else {
//wyswietlanie reszka
            System.out.print("Reszka");
        }



    }
}


