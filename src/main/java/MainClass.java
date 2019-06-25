
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;

public class MainClass {
    public static  void main(String[] args) {
        CashHash c = new CashHash();
        c.init(10000);
        System.out.println(" !!!  "+c.get(9998));
        c.update(9996,"qwe","rty");
        c.showAll();

    }
}
