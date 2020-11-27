package cwiczenie1;

public class zadanie2napraktykach{
    public static void main(String[] args) {

        //Zadanie: Posortuj tablice liczb całkowitych
        int[] tab = {4,2,5,76,8,2,14,234,346,32,1};
        int[] wynik = new int[tab.length];

        //Przechodzimy po każdym elemencie tablicy wyników
        for (int j=0; j<wynik.length; j++) {
            int temp = tab[0];
            int lokalizacja = 0;
            //pętla przechodząca po wszystkich elementach tablicy
            for (int i = 0; i<tab.length; i++){
                //Porównaj przechowywaną zmienną z kolejnym miejscem w tablicy
                if(temp > tab[i]){
                    temp = tab[i];
                    lokalizacja = i;

                }

            }
            //Wpisujemy do konkretnego miejsca w tablicy naszą wartość
            wynik[j] = temp;
            tab[lokalizacja] = Integer.MAX_VALUE;

            //Wpisujemy tablice wyników
            System.out.print(wynik[j] + ", ");
        }
    }
}