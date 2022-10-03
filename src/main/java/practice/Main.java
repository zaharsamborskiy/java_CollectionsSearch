package practice;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        CoolNumbers coolNumbers = new CoolNumbers();

        System.out.println(coolNumbers.bruteForceSearchInList(CoolNumbers.generateCoolNumbers(), "А111ВВ15"));
        System.out.println(coolNumbers.binarySearchInList(CoolNumbers.generateCoolNumbers(), "А111ВВ15"));
        System.out.println(coolNumbers.searchInHashSet(new HashSet<>(), "А112АВ190"));
        System.out.println(coolNumbers.searchInTreeSet(new TreeSet<>(), "А112АВ190"));

    }
}
