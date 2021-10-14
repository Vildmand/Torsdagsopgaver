import java.util.ArrayList;

class DogKennel {
    public static void main(String[] args) {
        //TODO:
        // lav en ny hund
        Dog myDog = new Dog("Woof", true);
        // Dog myDog = new Dog("woodie",);
        // sæt en ejer
        myDog.setOwner("Henning");
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        myDog.setOffSpring("woodiesnoopie");
        myDog.setOffSpring("woodiesfido");
        myDog.setOffSpring("Woofie");
        myDog.setOffSpring("Woofono");


        // print alle hvalpe
        ArrayList<String> dogs = myDog.getOffSpring();
        for (String myDogs : dogs) {
            System.out.println(myDog);
        }

        // print ejeren
        System.out.println("min hund er ejet af " + myDog.getOwner());
        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        boolean resString = myDog.feedDog();
        System.out.println(resString);
    }

}