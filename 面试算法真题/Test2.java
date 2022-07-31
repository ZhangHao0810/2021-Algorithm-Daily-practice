import javax.sound.midi.VoiceStatus;
import java.util.Scanner;

/**
 * @author Super-Zhang
 * @date 2021/11/2 21:14
 * <p>
 * 输入三个数A、B、C，求A的B次方对C取余的结果。
 * 例如：输入：2，3，4，结果为：0。
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        double result = Math.pow(A, B) % C;

        System.out.println(result);
    }
}
