import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

 class DictionaryExample {
    public static void main(String[] args)
    {
        Dictionary<String, Integer> dict= new Hashtable<>();
        dict.put("Alice", 25);
        dict.put("Bob", 30);
        dict.put("Charlie", 35);

        System.out.println(dict.get("Bob")); // 30

        int oldValue = dict.put("Charlie", 40);
        System.out.println(oldValue); // 35

        dict.remove("Alice");

        System.out.println(dict.size()); // 2

        Enumeration<String> k = dict.keys();
        while (k.hasMoreElements()) {
            String key = k.nextElement();
            System.out.println("Key: " + key + ", Value: "
                    + dict.get(key));
        }
    }
}
