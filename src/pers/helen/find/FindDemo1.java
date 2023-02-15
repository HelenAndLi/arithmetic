package pers.helen.find;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class FindDemo1 {

    public static void main(String[] args){
        int[] arr = new int[]{5, 543, 4, 2, 65, 89, 53, 2535};
        TreeSet<Integer> tree = new TreeSet<>(Integer::compareTo);
        for(int i : arr){
            tree.add(i);
            if(tree.size() > 100)
                tree.pollFirst();
        }
        new ArrayList<>(tree);
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(9);
        //
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("1st:"+iterator.next());
        }
        while(iterator.hasNext()){
            System.out.println("2nd:"+iterator.next());
        }
    }
}
