public class Fish {
    private String breed;
    private double weight;
    private double length;
    public String getBreed() {
        return breed;
    }
    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Основной пищей являются полихеты, ракообразные и двустворки. " +
                "Молодые (1–2 года) особи кормятся креветками и прочими мелкими рачками.");
    }
    public void speedFish(){
        System.out.println("Скорость маленьких рыбок - от 2 до 12 километров в час. " +
                "Чем больше размеры рыб, тем больше, как правило, их скорость.");
    }

}
