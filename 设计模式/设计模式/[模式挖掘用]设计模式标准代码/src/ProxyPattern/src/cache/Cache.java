package ProxyPattern.src.cache;

import java.util.HashMap;
public class Cache implements Searcher
{
    /**
     * @link aggregation
     * @directed
     */
    private RealSearcher searcher;
    private HashMap cacheMap=null;


    public Cache()
    {
		searcher = new RealSearcher();
        cacheMap=new HashMap();
    }

    public String doSearch(String keyValue)
    {
        if(cacheMap.get(keyValue)!=null)
            return (String)cacheMap.get(keyValue);
        else{
            String result = searcher.doSearch( keyValue);
            cacheMap.put(keyValue,result);
            return result;
        }
    }
}
