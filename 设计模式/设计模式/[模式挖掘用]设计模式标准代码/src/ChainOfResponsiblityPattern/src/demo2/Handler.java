package ChainOfResponsiblityPattern.src.demo2;

public abstract class Handler
{
    /**
     * @link aggregation
     * @supplierCardinality 0..1
     */
    protected Handler handler;

    public abstract void handleRequest();

    public void addHandler(Handler handler)
    {
        this.handler = handler;
    }

    public Handler getHandler()
    {
        return handler;
    }
}
