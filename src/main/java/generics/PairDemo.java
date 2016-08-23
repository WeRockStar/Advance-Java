package generics;


public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(3, 4);
        System.out.println(pair);
        pair = pair.swap();
        System.out.println(pair);
        Pair<Integer> pair2 = new Pair<>(5, 10);
        System.out.println(pair2);
        Pair.swap(pair2);
        System.out.println(pair2);
    }
}
