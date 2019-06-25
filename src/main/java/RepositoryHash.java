import java.util.HashMap;
import java.util.TreeMap;
import java.util.stream.Stream;

public class RepositoryHash {

    public static HashMap<Long,UserModel> getAll(long count){
        //tree
        HashMap<Long,UserModel> res = new HashMap<>();
        Stream.iterate(new UserModel(0,"fn0","ln0"), x-> new UserModel(x.id+1,"fn"+x.id,"ln"+x.id)).limit(count).forEach((n)->{if(!res.containsKey(n.id)){res.put(n.id,n);}});
        //stream.forEach(System.out::println);
        return res;
    }
}
