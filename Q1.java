package GenericsAndCollectionPart2;
class  Pair<K,V>{
    private K key;
    private V value;

    Pair(K key,V value){
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    public String toString(){
        return "Key :"+key+"; Value :"+value;
    }
}
public class Q1 {
    public static void main(String[] args) {
        /*
        Create a generic class Pair<K,V> with private variables key and value.
        The class Pair should define a parameterised constructor and getter and setter
        methods for these attributes. After addition of objects, the main class should
        retrieve and print the pair of key and value.
         */
        Pair<Integer,String> obj = new Pair<>(41,"Koshali Nayak");
        System.out.println(obj.toString());
    }
}
