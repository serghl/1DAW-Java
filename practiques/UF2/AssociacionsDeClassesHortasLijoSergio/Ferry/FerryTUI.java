/*
 * FerryTUI.java
 * 
 *
 */

import java.util.HashSet;

public class FerryTUI {
    
    public static void main(String[] args) {
        
        Lorry l1 = new Lorry("125",150,2);
        Lorry l2 = new Lorry("130",200,3);
        Lorry l3 = new Lorry("135",100,2);
        Lorry l4 = new Lorry("140",150,3);
        Lorry l5 = new Lorry("145",400,6);        
        Ferry f1 = new Ferry("5555","Balearia","Puerto de Barcelona",100,15,990);
        
        System.out.println("Añadimos lorry1");
        f1.board(l1);
        System.out.println("---------------");
        System.out.println("Añadimos lorry2");
        f1.board(l2);
        System.out.println("---------------");
        System.out.println("Precio peajes colectados");
        System.out.println(f1.collectedTolls());
        System.out.println("---------------");
        System.out.println("Carga total del barco");
        System.out.println(f1.totalWeight());
        System.out.println("---------------");
        System.out.println("Añadimos lorry3");
        f1.board(l3);
        System.out.println("---------------");
        System.out.println("Añadimos lorry4");
        f1.board(l4);
        System.out.println("---------------");
        System.out.println("Añadimos lorry5");
        f1.board(l5);
        System.out.println("---------------");
        System.out.println("Precio peajes colectados");
        System.out.println(f1.collectedTolls());
        System.out.println("---------------");
        System.out.println("Carga total del barco");
        System.out.println(f1.totalWeight());
        System.out.println("---------------");
        System.out.println("Info del Ferry");
        System.out.println(f1);
        System.out.println("---------------");
        System.out.println("N-ésima posicion");
        System.out.println(f1.lorryInPosition(3));        
        System.out.println("Lista normal de barcos");
        f1.showBoardedLorries();
        System.out.println("Sort By Toll Price");
        f1.sortPrice();
    }
}

