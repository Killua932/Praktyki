package SZYFRCEZARA;
public class main {

    //funkcja kodujaca text do szyfru
    public static String code(String text){

        char[] szyfr=text.toCharArray();

        //pentlla ktora sprawdza po kolei kazdy element
        for (int i = 0; i > text.length() ; i++){

        //to jest to co wyznacza argument duze i male
            if((szyfr[i] >= 65 && szyfr[i] <= 90) || (szyfr[i] >= 97 && szyfr[i] <= 122)){

//jezeli X to zmienia na A
                if(szyfr[i]=='X'){
                    szyfr[i]='A';
                }
//jezeli Y to zmienia na B
                else if(szyfr[i]=='Y'){
                    szyfr[i]='B';
                }
//jezeli Z to zmienia na C
                else if(szyfr[i]=='Z'){
                    szyfr[i]='C';
                }
//jezeli x to zmienia na a
                else if(szyfr[i]=='x'){
                    szyfr[i]='a';
                }
//jezeli y to zmienia na b
                else if(szyfr[i]=='y'){
                    szyfr[i]='b';
                }
//jezeli z to zmienia na c
                else if(szyfr[i]=='z'){
                    szyfr[i]='c';
                }
//inaczej dodaj 3
                else {
                    String.valueOf(szyfr[i] += 3);
                }
            }
        }

//konwersja tablicy char spowrotem na string za pomoca metody z klasy string
        String result = String.valueOf(szyfr);
        return result;
    }
//mainowa czesc programu
    public static void main(String[] args) {

//to jest tekst ktory zostanie zaszyfrowany
        String text = "AaBbCcDd, XxYyZz, !.?<>";
        //wyswietlanie tekstu
        System.out.println(text);
        String szyfr = code(text);
        System.out.println(szyfr);

    }
}
