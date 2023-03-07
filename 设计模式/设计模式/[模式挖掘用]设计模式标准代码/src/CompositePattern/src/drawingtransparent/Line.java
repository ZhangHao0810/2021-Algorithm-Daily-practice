package CompositePattern.src.drawingtransparent;

public class Line extends Graphics
{
    public void draw()
    {
        System.out.println("Line draw");
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

