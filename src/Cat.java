public class Cat {
    private String name;
    private String colour;

    private int weight;


    public String getName() {
        return name;
    }
    public String getColour() {
        return colour;
    }
    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Можно давать нежирные кисломолочные продукты  " +
                "мясные субпродукты , рыбу , овощи (кабачки, тыкву, огурцы)");
    }

}


