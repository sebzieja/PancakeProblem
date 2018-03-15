public class Main {

    public static void main(String[] args){
        int[] data = {3, 1, 2};

        Pancake test = new Pancake(3, data);
        test.print();
        test.flip(2);
        test.print();
    }
}
