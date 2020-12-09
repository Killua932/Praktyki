package Cards;

public class card {

    private String color;
    private int value;
    private String znak;

    public card(String color, int value, String znak) {
        this.color = color;
        this.value = value;
        this.znak = znak;
    }

    public String toString(){
        return  this.znak + " " + " " + this.color;
    }


    public String getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    public String getZnak() {
        return znak;
    }
}
