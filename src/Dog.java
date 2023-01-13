public class Dog {
    private String name;
    private String colour;
    private String breed;
    private int weight;

    public String getName() {
        return name;
    }
    public String getColour() {
        return colour;
    }
    public String getBreed() {
        return breed;
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
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void run() {
        System.out.println("Они бегают 48км/ч");
    }

    public void protect() {
        System.out.println("Она одинаково хорошо может служить собакой-компаньоном," +
                " охранной, защитной, служебной и караульной собакой." );

    }

}


