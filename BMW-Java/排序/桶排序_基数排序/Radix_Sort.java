package 排序.桶排序_基数排序;

import java.util.Arrays;

/**
 * @author Super-Zhang
 * @date 2021-04-07 10:56
 *
 * 基数排序 可以不经过关键字的比较。牛。
 * 根据待排序数字的位数来做。
 */
public class Radix_Sort {

    public static void main(String[] args) {
        int[] array = {3, 2, 3, 2, 5, 333, 45566, 2345678, 78, 990, 12, 432, 56};

        radixSort(array, 10, 7);
        System.out.println("  "+Arrays.toString(array));
    }

    /**
     *
     * @param array
     * @param radix 桶的个数。比如 排的是10进制数，则个数为10，排的是小写英文字母 桶的个数就是26
     * @param distance 桶内元素的最高位数。 ex：353，21，最高位数是三位。
     */
    private static void radixSort(int[] array, int radix, int distance) {
        //array为待排序数组，此处拿array当桶
        //radix，代表基数 就是桶的个数。 同代表排序元素的位数 十进制 就是10个
        int length = array.length;
        int[] temp = new int[length];//用于暂存元素
        int[] count = new int[radix];//用于记录每个桶内元素的数量
        int divide = 1;
        //i表示第几位，0代表个位，1代表十位，2代表百位
        for (int i = 0; i < distance; i++) {
            //  将array中的元素完全复制到temp数组中
            System.arraycopy(array, 0,temp, 0, length);
            // 重置count数组，防止上次循环的数据影响,开始统计下一个关键字
            Arrays.fill(count, 0);
            // 计算每个待排序数据的子关键字
            //分别统计第j位是0,1,2,3,4,5,6,7,8,9的数量, 此循环用来统计每个桶中的数据的数量
            for (int j = 0; j < length; j++) {
                int tempKey = (temp[j]/divide)%radix; //tempKey是桶号。
                count[tempKey]++; //进桶，该桶号桶内元素数量+1，进了第一个元素数就是1，所以相当于元素的下标是1
            }
            //利用count[i]来确定放置数据的位置
            for (int j = 1; j < radix; j++) {
                count [j] = count[j] + count[j-1]; //执行完此循环之后的count[j]就是第i个桶右边界的位置
//                count[0] 表示 0号桶中的元素个数。  如果把元素拿出来当数组的话，
//                count[1] 表示 0 号桶和 1号 桶内总共的元素个数。
//                所以要是想拿到1 号 桶的最后一个元素 从数组里体现的话， 就是 arr[count[1]-1]  相当于 arr[length-1]
            }
            //个人觉的运用计数排序实现计数排序的重点在下面这个方法
            // 按子关键字对指定的数据进行排序,利用循环把数据装入各个桶中，
            // 注意是从后往前装,这里是重点，一定要好好理解
            for (int j = length - 1; j >= 0; j--) {
                int tempKey = (temp[j]/divide)%radix; //tempKey是桶号。
                count[tempKey]--;//确定 tempKey 号 桶的最后一个元素的索引。
                // 因为拿到每个桶最后一个元素的索引更方便。所以是从后向前遍历temp
                array[count[tempKey]] = temp[j];
//关于顺序问题：
// 因为桶号的排序是自然排序，根据位数放进桶里，所以最终的排序和桶号相同也是自然排序了。（桶内不排序）
            }

            divide = divide * radix;
        }

    }

}  

