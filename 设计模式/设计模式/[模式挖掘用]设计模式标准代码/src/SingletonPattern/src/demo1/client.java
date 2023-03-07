package SingletonPattern.src.demo1;

public class client {

    public client() {
    }
    public static void main(String[] args) {
        EagerSingleton singleton=EagerSingleton.getInstance();
        System.out.println(singleton.helloWorld());//

        LazySingleton lsingleton=LazySingleton.getInstance();
        System.out.println(lsingleton.helloWorld());//
    }
}