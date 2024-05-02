package GenericsAndCollectionPart2;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Address{
    private int PlotNo;
    private String at;
    private String post;

    public Address(int plotNo, String at, String post) {
        PlotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Address{" +
                "PlotNo=" + PlotNo +
                ", at='" + at + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}

public class Q7 {
    public static void main(String[] args) {
        /*
        Write a java code that comprises of a class Address,
        having member variable plot no, at, post and required
        parameterised constructor. Create a Tree map having key
        as name of a person and value as address. Insert required
        key and value in the created tree map and use an iterator
        to display it.
         */
        Map<String,Address> tree = new TreeMap<>();
        tree.put("koshali",new Address(123,"Cuttack","F/23"));
        tree.put("komal",new Address(456,"Bhubneswar","G/24"));

        //Iterator to display it
        Set set = tree.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry map = (Map.Entry)it.next();
            System.out.println("Key :"+map.getKey());
            System.out.println(map.getValue());
        }



    }
}
