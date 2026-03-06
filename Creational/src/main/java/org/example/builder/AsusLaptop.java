package org.example.builder;

public class AsusLaptop{
    private int id;
    private String type;
    private String color;
    private double prise;

    public AsusLaptop(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.color = builder.color;
        this.prise = builder.prise;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getPrise() {
        return prise;
    }

    public static class Builder {
        private int id;
        private String type;
        private String color;
        private double prise;

        public Builder setId(int id){
            this.id = id;
            return this;
        }

        public Builder setType(String type){
            this.type = type;
            return this;
        }

        public Builder setColor(String color){
            this.color = color;
            return this;
        }

        public Builder setPrise(double prise){
            this.prise = prise;
            return this;
        }

        public AsusLaptop build(){
            return new AsusLaptop(this);
        }
    }

}
