package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.PrisonCell;

public class MainFour {
    public static void main(String[] args) {
        PrisonCell Cell1 = new PrisonCell(1);
        Cell1.addPrisoner("De Neus");
        System.out.println(Cell1.getInhabitants().toString());
    }
}
