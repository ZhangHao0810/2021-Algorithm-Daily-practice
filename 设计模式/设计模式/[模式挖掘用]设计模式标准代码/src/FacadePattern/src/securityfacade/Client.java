package FacadePattern.src.securityfacade;

public class Client
{
    /**
     * @link aggregation
     * @directed
     */
    private static SecurityFacade security=new SecurityFacade();

    public static void main(String[] args)
    {
		security.activate();
    }
}

