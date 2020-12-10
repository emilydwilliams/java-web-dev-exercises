package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator coneComparator = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        System.out.println("Before sorting: ");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + ": " + flavor.getAllergens().size() + " allergens");
        }
        flavors.sort(comparator);
        System.out.println("\nAfter sorting: ");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + ": " + flavor.getAllergens().size() + " allergens");
        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("\nBefore sorting: ");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + cone.getCost());
        }
        cones.sort(coneComparator);
        System.out.println("\nAfter sorting: ");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + cone.getCost());
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
