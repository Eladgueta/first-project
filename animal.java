public class animal {

    String name ;
    int age ;
    String nickname ;
    String sound ;
    String color ;

    @Override
    public String toString() {
        return "animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                ", sound='" + sound + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public animal(String name, int age, String nickname, String sound, String color) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
        this.sound = sound;
        this.color = color;




    }
}
