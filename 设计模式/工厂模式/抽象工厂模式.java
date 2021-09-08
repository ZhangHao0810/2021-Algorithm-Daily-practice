/**
 * @author Super-Zhang
 * @date 2021-09-03 11:20
 * 在这个模式中的工厂类不单单可以创建一个对象，而是可以创建一组对象。这是和工厂方法最大的不同点。
 */
public class 抽象工厂模式 {
}

interface OperationController {
    void control();
}

interface UIController {
    void display();
}

//Android：
class AndroidOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("AndroidOperationController");
    }
}

class AndroidUIController implements UIController {
    @Override
    public void display() {
        System.out.println("AndroidInterfaceController");
    }
}

//IOS：
class IosOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("IosOperationController");
    }
}
class IosUIController implements UIController {
    @Override
    public void display() {
        System.out.println("IosInterfaceController");
    }
}

//抽象工厂
interface SystemFactory {
    OperationController createOperationController();
    UIController createInterfaceController();
}

// 具体的工厂类
class AndroidFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }
    @Override
    public UIController createInterfaceController() {
        return new AndroidUIController();
    }
}

class IosFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new IosOperationController();
    }
    @Override
    public UIController createInterfaceController() {
        return new IosUIController();
    }
}