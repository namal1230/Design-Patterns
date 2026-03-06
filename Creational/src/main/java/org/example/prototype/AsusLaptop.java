package org.example.prototype;

public class AsusLaptop implements Prototype {
    private int id;
    private String type;
    private String color;
    private double prise;

    public AsusLaptop() {
    }

    public AsusLaptop(int id, String type, String color, double prise) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.prise = prise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }


    @Override
    public AsusLaptop clone() {
        return new AsusLaptop(this.id,this.type,this.color,this.prise);
    }
}
