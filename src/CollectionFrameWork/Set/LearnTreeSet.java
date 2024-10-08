package CollectionFrameWork.Set;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> set= new TreeSet<>();// This data structure stores the elements in a tree structure and in sorted order. In time complexity O{logn)
        set.add(11);// adding an element into a set
        set.add(66);
        set.add(77);
        set.add(44);
        set.add(22);
        set.add(33);
        set.add(55);

        System.out.println(set);
        System.out.println(set.contains(55));// checks for an element if it contains
        set.remove(55);// used to removing an element into a set
        System.out.println(set.contains(55));
        System.out.println(set);
        System.out.println(set.isEmpty());// returns boolean value true if set is empty
        System.out.println(set.size());// returns the size of the set
        set.clear();// removes the elements from the set
        System.out.println(set.isEmpty());
    }
}
