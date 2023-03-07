package 为别人做嫁衣;

/**
 * @author ZhangHao
 * @date 2019/11/19 14:38
 * @Description： 代理类, 傻逼高中时代的我
 */
public class Proxy implements IGiveGift{

    Pursuit wangXiFeng;

    public Proxy(SchoolGirl mm) {
        wangXiFeng = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        wangXiFeng.giveDolls();
    }

    @Override
    public void giveFlowers() {
        wangXiFeng.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        wangXiFeng.giveChocolate();
    }
}
