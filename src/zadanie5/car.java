package zadanie5;

public class car {
    private String model;
    private float pojemnoscsilnika;

    public car(String model, float pojemnoscsilnika) {
        this.model = model;
        this.pojemnoscsilnika = pojemnoscsilnika;


    }
    public String getModel() {
        return "Model " + model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
