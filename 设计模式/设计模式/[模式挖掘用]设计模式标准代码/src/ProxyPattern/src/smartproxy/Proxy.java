package ProxyPattern.src.smartproxy;

public class Proxy implements Searcher
{
    /**
     * @link aggregation
     * @directed
     */
    private RealSearcher searcher;

    public Proxy()
    {
		searcher = new RealSearcher();
    }

    public String doSearch(String userId, String keyValue)
    {
        if (isAdmin(userId)){
	        String result = searcher.doSearch("Admin", keyValue);
            return result;
        }else if(isUser(userId)){
            String result = searcher.doSearch("User", keyValue);
            return result;
        }else{
            return null;
        }
    }

    private boolean isGuest(String strUsr){
        return strUsr.equals("guest");
    }

    private boolean isUser(String strUsr){
        return strUsr.equals("user");
    }

    private boolean isAdmin(String strUsr){
        return strUsr.equals("admin");
    }

}
