
import java.util.*;

/**
 * @author Super-Zhang
 * @date 2021-05-13 16:17
 * <p>
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *  不重复的三元组，1，-1，0； 和 0，1，-1； 是不重复的。因为对应的a b c 的值不同！
 *  所以只要保证不出现重复的 list 即可。 用Set实现。
 */
public class 三数之和 {

    /**
     * 和为零，所以肯定有正 有负。
     * 一开始可以先选择一个数，然后再去找另外两个数，这样只要找到两个数且和为第一个选择的数的相反数就行了。
     * 也就是说需要枚举 a 和 b ，将 c 的存入 map 即可。
     * <p>
     * 先将原数组进行排序，然后再遍历排序后的数组，
     * 这样就可以使用双指针以线性时间复杂度来遍历所有满足题意的两个数组合。
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum2(int[] nums) {
        if (nums == null)
            return null;

        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;//已经循环到正数了，总和为0，可以break了
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (nums[i] + nums[left] + nums[right] > 0)
                    right--;
                else
                    left++;
            }
        }

        List<List<Integer>> anns = new ArrayList<>();
        anns.addAll(ans);
        return anns;
    }
}
