package org.example;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateSorter dateSorter = new DateSorter();
        Collection<LocalDate> sortedDate;
        List<LocalDate> unsortedDate = new java.util.ArrayList<>(List.of(
                LocalDate.of(2004, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3)));
        sortedDate = dateSorter.sortDates(unsortedDate);
        System.out.println(sortedDate);
    }
}