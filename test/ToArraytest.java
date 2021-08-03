import java.util.ArrayList;

/**
 * @author Super-Zhang
 * @date 2021-07-16 12:04
 */
public class ToArraytest {
//
    public static void main(String[] args ) {
        ArrayList list=new ArrayList();

        Integer x=1;

        list.add(x);
        Integer[]  arr = new Integer[list.size()];
        System.out.println(list.toArray(arr));

    }


    public ArrayList<Integer> test(int i){
        return  null;
    }
}
