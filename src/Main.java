public class Main {

    public static void main(String[] args){
        int[] data = {7, 6, 5, 4, 1, 3, 2, 8};

        Pancake test = new Pancake(data);
        test.sort();
        test.print();
    }
}
