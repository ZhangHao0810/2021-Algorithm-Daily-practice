package ProxyPattern.src.cache;

class RealSearcher implements Searcher
{
    public RealSearcher()
    {
    }

    public String doSearch(String keyValue)
    {
        //��������ݿ��ж�ȡ
        String sql = "SELECT * FROM data_table WHERE key_col = '" + keyValue + "'";

        return keyValue+"keyValue";
    }
}
