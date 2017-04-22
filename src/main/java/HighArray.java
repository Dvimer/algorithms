/**
 * Created by dvime_000 on 22.04.2017.
 */
public class HighArray {
    private int[] array;
    private int count;

    public HighArray(int size) {
        array = new int[size];
        count = 0;
    }

    public boolean find(int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return true;
            }
        }
        return false;
    }

    public void insert(int value) {
        array[count] = value;
        count++;
    }

    public boolean delete(int value) {
        for (int i = 0; i < count; i++) {
            if (array[i] == value) {
                for (int j = i; j < count; j++) {
                    array[j] = array[j + 1];
                    count--;
                    return true;
                }
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }

    public int getCount() {
        return count;
    }
}
