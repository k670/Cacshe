

import java.util.TreeMap;

public class Cache implements CashInterface {
    private TreeMap<Long, UserModel> AllUsers;

    public void init(long count){
        AllUsers = Repository.getAll(count);
        AllUsers.forEach((i,x)-> System.out.println(x));
    }

    public UserModel get(long id){
        return AllUsers.get(id);
    }

    public UserModel update(long id, String fn, String ln){
        return AllUsers.put(id,new UserModel(id,fn,ln));
    }

    public void showAll(){
        AllUsers.forEach((i,x)-> System.out.println(x));
    }
}
