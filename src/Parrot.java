public class Parrot {
    private String name;
    private String colour;
    private String breed;

    public String getName() {
        return name;
    }
    public String getColour() {
        return colour;
    }
    public String getBreed() {
        return breed;
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

    public void repeat(){
        System.out.println("\nОни способны воспроизводить мелодию телефона, звук дверного звонка.," +
                "\nЕсли проявить терпение и заниматься с птицей," +
                "\n она научится не только произносить отдельные слова и фразы, " +
                "\nно и повторять предложения в нужной последовательности.");
    }

    public void fly(){
        System.out.println("Летают по прямой линии," +
                " развивая скорость до 56 км/ч. В воздухе пара летит близко друг к другу, " +
                "практически соприкасаясь крыльями. ");
    }
}


