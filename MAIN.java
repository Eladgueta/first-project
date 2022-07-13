import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {


Scanner scanner = new Scanner(System.in);

/*




        carjava elad = new carjava();


        System.out.println("elad car ");
        System.out.println(elad.hp);
        System.out.println(elad.make);
        System.out.println(elad.model);
        System.out.println(elad.numberofweels);
        System.out.println(elad.year);

        carjava daniel = new carjava();


        System.out.println("daniel car ");
        System.out.println(daniel.hp);
        System.out.println(daniel.make);
        System.out.println(daniel.model);
        System.out.println(daniel.numberofweels);
        System.out.println(daniel.year);

*/

        /*
        animal elad = new animal("jony ", 5 , "jon", "how how ", "white");
        System.out.println(elad.age);
        System.out.println(elad.name);
        System.out.println(elad.nickname);
        System.out.println(elad.sound);
        System.out.println(elad.color);

        animal hodi = new animal("ron", 4 , "ronron" , "how how " , "brown");
        System.out.println(hodi);



*/
        Person gueta = new Person("BLC","BLC",1.80,75,"BRO");

        System.out.println(gueta);

        System.out.println("please enter your skin color");
        String skinColor = scanner.next();
        System.out.println("please enter your hair color");
        String hairColor = scanner.next();
        System.out.println("please enter your height");
        double height = scanner.nextDouble();
        System.out.println("please enter your weight");
       double weight = scanner.nextDouble();
        System.out.println("please enter your eyes color ");
        String eyesColor = scanner.next();

        Person ROTEM = new Person(skinColor,hairColor,height,weight,eyesColor);
        System.out.println(ROTEM);
/*
        Person[] guetafamily = new Person[1];
        Person[0] = new Person();
        Person [1] = new Person();

*/


    }



}
