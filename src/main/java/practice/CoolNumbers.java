package practice;

import org.checkerframework.checker.units.qual.A;

import java.util.*;

public class CoolNumbers {


    public static List<String> generateCoolNumbers() {
        HashSet<String> list = new HashSet<>();
        String[] letter = {"А","В","Е","К","М","Н","О","Р","С","Т","У","Х"};
        // одинаковые буквы
//        for (int reg = 1; reg < 199; reg++) {
//            for (String x : letter){
//                for (int i = 1; i < 999; i++){
//                    list.add(String.format("%s%d%s%s%d",x,i,x,x,reg));
//                }
//            }
        // одинаковые номера
        for (String x : letter){
            for (String y : letter){
                for (String z : letter){
                    for (int i = 111; i < 999; i +=111){
                        for (int reg = 10; reg < 199; reg++){
                            list.add(String.format("%s%d%s%s%d",x,i,y,z,reg));
                        }
                    }
                }
            }
        }
        return new ArrayList<>(list);
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        List<String> listForArray = new ArrayList<>(list);
        Collections.sort(listForArray);
        for (String s : listForArray) {
            if (s.contains(number)){
                return true;
            }
        }
            return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        List<String> list = new ArrayList<>(sortedList);
        Collections.sort(list);
        int index = Collections.binarySearch(list, number);
        if (index < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        for (String s : hashSet) {
            if (s.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        for (String s : treeSet) {
            if (s.equals(number)){
                return true;
            }
        }
        return false;
    }

}
