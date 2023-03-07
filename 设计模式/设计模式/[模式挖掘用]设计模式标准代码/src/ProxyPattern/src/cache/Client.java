package ProxyPattern.src.cache;

public class Client
{
    /**
     * @link aggregation
     * @directed
     */
    private static Searcher searcher;

    public static void main(String[] args)
    {
		searcher = new Cache();

        System.out.println(searcher.doSearch("zhang"));
        System.out.println(searcher.doSearch("wang"));
        System.out.println(searcher.doSearch("Li"));

        System.out.println(searcher.doSearch("zhang"));
        System.out.println(searcher.doSearch("zhang"));
        System.out.println(searcher.doSearch("Li"));
    }

}

