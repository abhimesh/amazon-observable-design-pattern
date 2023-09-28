import java.util.ArrayList;
import java.util.List;

public class iphonestockobservalble implements  observable{
    int stockcount;
    List<observer> user;
    iphonestockobservalble()
    {
        user=new ArrayList<>();
    }

    @Override
    public void notifys() {
        for(int i=0;i<user.size();i++)
        {
            user.get(i).notifys();
        }
    }
    @Override
    public void addUser(observer observer)
    {
        user.add(observer);
    }
    @Override
    public void removeuser(observer observer)
    {
        user.remove(observer);
    }
    public int getStockcount() {
        return stockcount;
    }

    public void setStockcount(int stockcount) {
        if(this.stockcount==0)
        {notifys();}
        this.stockcount=stockcount;
    }
}
