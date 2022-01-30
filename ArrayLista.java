package Domaci2712;

import java.util.ArrayList;

public class ArrayLista {
    public static void main(String[] args) {

        ArrayList<String> sport = new ArrayList<>();

        sport.add("Fudbal");
        sport.add("Tenis");
        sport.add("Kosarka");
        sport.add("Odbojka");
        sport.add("Vaterpolo");
        sport.add("Rukomet");
        sport.add("Skijanje");
        sport.add("Boks");

        System.out.println(sport.get(3));

        sport.set(1,"Biciklizam");
        System.out.println(sport.get(1));

        sport.remove(5);
        System.out.println(sport);

        System.out.println("Velicina liste je: " + sport.size() + "\n");

        System.out.println("Elemetni liste su: ");
        for(int i = 0; i < sport.size(); i++){
            System.out.println(sport.get(i));
        }
        System.out.println();


        System.out.println("Drugi nacin: ");
        for(String s : sport){
            System.out.println(s);
        }


    }
}
