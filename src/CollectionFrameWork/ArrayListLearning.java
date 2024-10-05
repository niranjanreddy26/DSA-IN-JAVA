package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        List <Integer> array = new ArrayList<>();
        array.add(2);// 1 add elements into a arrayList
        array.add(26);
        array.add(2000);

        System.out.println(array);// 2 display elements

        List <Integer> newList = new ArrayList<>();
        newList.add(12);
        newList.add(26);
        newList.add(2000);
        newList.add(2030);

        array.addAll(newList);// 3 copy all the elements of an arrayList into another arrayList
        System.out.println(array);

        System.out.println(array.get(6));// 4 getting an element by the index of the element

        array.remove(6);// 5 removing an element by the index
        System.out.println(array);

        newList.remove(Integer.valueOf(2000));// 6 removing the element by it's value
        System.out.println(newList);

        newList.clear();
        System.out.println(newList);// clears all the elements from an ArrayList and makes it empty
    }
}
