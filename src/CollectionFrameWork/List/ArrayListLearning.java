package CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        List <Integer> array = new ArrayList<>();
        array.add(2);// 1 add elements into a arrayList
        array.add(2000);
        array.add(1,26);

        System.out.println(array);// 2 display elements

        List <Integer> newList = new ArrayList<>();
        newList.add(12);
        newList.add(2000);
        newList.add(1,26);
        newList.add(2030);

        array.addAll(newList);// 3 copy all the elements of an arrayList into another arrayList
        System.out.println(array);

        System.out.println(array.get(6));// 4 getting an element by the index of the element

        array.remove(6);// 5 removing an element by the index
        System.out.println(array);

        newList.remove(Integer.valueOf(2000));// 6 removing the element by it's value
        System.out.println(newList);

        newList.clear();
        System.out.println(newList);// 7 clears all the elements from an ArrayList and makes it empty

        array.set(2,2001); //  8 change an element in a particular position
        System.out.println(array);

        System.out.println(array.contains(26)); // to verify whether a list contains an element with O(n)

        // iterating through a ArrayList

        for(int i=0;i<array.size();i++){// for loop
            System.out.println("for loop"+array.get(i));
        }
        System.out.println();
        for (Integer iterator : array) {// for each loop
            System.out.println("for each loop"+iterator);
        }
        System.out.println();
        Iterator<Integer> it = array.iterator() ;
        while(it.hasNext()){ // While loop
            System.out.println("Iterator "+it.next());
        }
    }
}
