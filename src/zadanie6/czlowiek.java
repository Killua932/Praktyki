package zadanie6;

public class czlowiek {

    private float wzrost;
    private float waga;
    private String imie;
    private String nazwisko;

    public czlowiek(float wzrost, float waga, String imie, String nazwisko) {
        this.wzrost = wzrost;
        this.waga = waga;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public float getWzrost() {
        return wzrost;
    }

    public float getWaga() {
        return waga;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

}
