public class Person {


    String skinColor ;
    String hairColor ;
    double height ;
    double weight ;
    String EyesColor ;


    public Person(String skinColor, String hairColor, double height, double weight, String eyesColor) {
        System.out.println("hey , this is your details :");
        this.skinColor = skinColor;
        this.hairColor = hairColor;
        this.height = height;
        this.weight = weight;
        EyesColor = eyesColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "skinColor='" + skinColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", EyesColor='" + EyesColor + '\'' +
                '}';
    }
}
