package CompositePattern.src.filesystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class FolderNode extends FileSystemNode{
    public int getSize()
    {
        int icount=0;
        Iterator iterator = components();
        while (iterator.hasNext())
        {
            icount+=((FileSystemNode)iterator.next()).getSize();
        }
        return icount;
    }

    public void add(FileSystemNode component)
    {
        componentList.add(component);
    }

    public void remove(FileSystemNode component)
    {
        componentList.remove(component);
    }

    public Iterator components()
    {
        return componentList.listIterator();
    }
    private List componentList = new ArrayList();
}