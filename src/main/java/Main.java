/**
 * Created by dvime_000 on 22.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        HighArray highArray = new HighArray(100);
        highArray.insert(100);
        highArray.insert(98);
        highArray.insert(32);
        highArray.insert(234);
        highArray.insert(36);

        highArray.display();

        highArray.delete(98);
        System.out.println("");

        highArray.display();
    }
}
