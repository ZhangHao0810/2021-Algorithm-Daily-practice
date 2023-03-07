package SingletonPattern.src.demo3.ver1;

public class Client
{
    private static KeyGenerator keygen;

    public static void main(String[] args)
    {
        keygen = KeyGenerator.getInstance();

        System.out.println("key = " + keygen.getNextKey());
        System.out.println("key = " + keygen.getNextKey());
        System.out.println("key = " + keygen.getNextKey());
    }

}