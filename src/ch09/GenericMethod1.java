package ch09;

public class GenericMethod1 {

    public static void main(String[] args) {
        Integer[] iArr = {1,2,3,4,5};
        String[] sArr = {"a","b","c"};

        test(iArr);
        System.out.println(getLast(iArr));


    }
    public static <T> void test(T[] iArr) {
        for (T t : iArr) {
            System.out.println(t);
        }
    }
    public static <T> T getLast(T[] arr) {
        return arr[arr.length - 1];
    }
}
