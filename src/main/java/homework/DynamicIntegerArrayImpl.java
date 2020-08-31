package homework;

public class DynamicIntegerArrayImpl implements DynamicIntegerArray {
    private final int MIN_SIZE = 5;

    private int[] arr;
    private int size;
    private int capacity;

    DynamicIntegerArrayImpl(){
        capacity = 2 * MIN_SIZE + 1;
        arr = new int[capacity];
    }

    DynamicIntegerArrayImpl(int size){
        capacity = 2 * size + 1;
        arr = new int[capacity];
        this.size = size;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Going out of bounds");
        }
        return arr[index];
    }

    @Override
    public void add(int value) {
        if (size >= capacity) {
            capacity = 2 * capacity + 1;
            int[] tmp = arr;
            arr = new int[capacity];
            System.arraycopy(tmp, 0, arr, 0, size);
        }
        arr[size++] = value;
    }

    @Override
    public int size() {
        return size;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; i++){
            s.append(arr[i] + " ");
        }
        return s.toString();
    }
}
