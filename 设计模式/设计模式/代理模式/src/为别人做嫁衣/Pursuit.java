package 为别人做嫁衣;

/**
 * @author ZhangHao
 * @date 2019/11/19 14:32
 * @Description： 追求者类,王学峰
 */
public class Pursuit implements IGiveGift {

    String name= "王学峰";

    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName()+","+name+"送你洋小孩!");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName()+","+name+"送你月季发发!");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName()+","+name+"送你亲手包好的洋黑便便!");
    }
}
