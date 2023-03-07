package 简单工厂模式.原始披萨项目;

/**
 * @author ZhangHao
 * @date 2019/11/11 20:51
 * @Description：
 */
public abstract class Pizza {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract  void prepare();
    public void bake(){
        System.out.println(name+" baking;");
    }
    public void cut(){
        System.out.println(name+" cutting;");
    }
    public void box(){
        System.out.println(name+" boxing;");
    }

}
