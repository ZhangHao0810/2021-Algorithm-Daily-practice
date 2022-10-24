import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Super-Zhang
 * @date 2021-08-03 14:23
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class JZ13调整数组顺序使奇数位于偶数前面 {

    /**
     * 关于集合转数组:
     * 想要从集合中得到 基本类型 数组，需要额外进行一次集合遍历！！！！
     * 包装类和String不必二次遍历！
     */

    public int[] reOrderArray (int[] array) {

        //O(2n)=O(n)

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oldList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                oldList.add(array[i]);
            else
                evenList.add(array[i]);
        }

        oldList.addAll(evenList);

        int[] result = new int[array.length];
        int x = 0;
        Iterator it = oldList.iterator();
        while (it.hasNext()) {
            result[x] = (int) it.next();
            x++;
        }

        return result;
    }
}
