package CompositePattern.src.drawingtransparent;

public class Rectangle extends Graphics
{
    public void draw()
    {
        System.out.println("Rectangle draw");
    }

    public void add(Graphics g)
    {
        //do nothing
    }

    public void remove(Graphics g)
    {
        //do nothing
    }

    public Graphics getChild(int i)
    {
        return null;
    }
}

