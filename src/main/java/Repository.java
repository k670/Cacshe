
import java.util.TreeMap;
import java.util.stream.Stream;

public class Repository {
    public static TreeMap<Long,UserModel> getAll(long count){

        TreeMap<Long,UserModel> res = new TreeMap<>();
       Stream.iterate(new UserModel(0,"fn0","ln0"),x-> new UserModel(++x.id,"fn"+x.id,"ln"+x.id)).limit(count).forEach((n)->{if(!res.containsKey(n.id)){res.put(n.id,n);}});
        //stream.forEach(System.out::println);
        return res;
    }
}
