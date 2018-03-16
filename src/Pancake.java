public class Pancake {
    private int[] tableOfPancakes;
    private boolean sorted = false;
    private int step=0;
    public Pancake(int[] tableOfPancakes){
        this.tableOfPancakes=tableOfPancakes;
    }

    public void flip(int high) {
        System.out.println("Step " + step);
        print();
        ++step;
        for (int i = 0; i < high; ++i) {
            tableOfPancakes[i] += tableOfPancakes[high];
            tableOfPancakes[high] = tableOfPancakes[i] - tableOfPancakes[high];
            tableOfPancakes[i] -= tableOfPancakes[high];
            --high;
        }
    }
    private int findHighest(int high){
        int highest = 0;
        int indexOfHighest = 0;
        try {
            for (int i = 0; i <= high; i++) {
                if (tableOfPancakes[i] > highest) {
                    highest = tableOfPancakes[i];
                    indexOfHighest = i;
                }
            }
        }
        catch (NullPointerException e){
            System.out.println("High = " +high+" is bigger than lenght of tableOfPancakes = " + tableOfPancakes.length);
        }
        return indexOfHighest;
    }

    private void sort(int high){
        if (high == 0){
            sorted = true;
            return;
        }
        int indexOfHighest = findHighest(high);
        if(indexOfHighest==0){
            flip(high);
            sort(--high);
            return;
        }
        flip(indexOfHighest);
        flip(high);
        sort(--high);
    }
    public void sort(){
        sort(tableOfPancakes.length - 1);
    }

    public void print(){
        System.out.print("[ ");
        for(Integer pancake : tableOfPancakes){
            System.out.print(pancake + " ");
        }
        System.out.print("]");
        System.out.println();
    }
    public int[] getTableOfPancakes(){
        return tableOfPancakes;
    }

//    public void sortPancakes(){
//        boolean sorted=false;
//        int highest;
//        int localizationOfHighest;
//        while(!sorted){
//            for(int i=0;i<tableOfPancakes.length;i++){
//
//            }
//        }
//    }
//
}
