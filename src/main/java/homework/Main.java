package homework;

public class Main {
    public static void main(String[] args){
        DynamicIntegerArrayImpl arr = new DynamicIntegerArrayImpl();

        int size = 15;

        for (int i = 0; i < size; i++){
            arr.add(i);
        }

        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.get(5));
        //System.out.println(arr.get(-1));
    }
}
