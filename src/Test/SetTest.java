package Test;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Super-Zhang
 * @date 2021-05-13 16:53
 */
public class SetTest {
    public static void main(String[] args) {
        // set 无序不重复。 测试。
        Set<List<Integer>> tes=new HashSet<>();

        tes.add((Arrays.asList(2,1,3)));
        tes.add((Arrays.asList(1,2,3)));
        tes.add((Arrays.asList(1,2,3)));

        System.out.println(tes.toString());
    }


}
