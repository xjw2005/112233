import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args){

//
//        System.out.println(arrayInt2[0]);
//        arrayInt[0] = 999;
//        System.out.println(arrayInt2[0]);
//
//        try {
//            Integer i = Integer.valueOf("abc");
//        }catch (NumberFormatException e){
//            e.printStackTrace();
//        }
//
//
        List<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(1);

        Collections.sort(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}