package oop;


public class StoreNumber {
    private boolean[] numbers = new boolean[100];

    public void store(int num) {
        numbers[num] = true;
    }

    public boolean isStored(int num) {
        return numbers[num];
    }

    public static void main(String[] args) {
        StoreNumber sn = new StoreNumber();
        StoreNumber sn2 = new StoreNumber();
        System.out.println("hasCode : " + sn.hashCode());
        System.out.println(sn.isStored(2));
        sn.store(2);
        System.out.println("hasCode : " + sn2.hashCode());
        System.out.println(sn.isStored(2));
        System.out.println(sn.isStored(3));
        sn.store(3);
        System.out.println(sn.isStored(3));
    }
}
