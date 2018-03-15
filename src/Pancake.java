public class Pancake {
    int howManyPancakes;
    int[] tableOfPancakes;
    public Pancake(int howManyPancakes, int[] tableOfPancakes){
        this.howManyPancakes=howManyPancakes;
        this.tableOfPancakes=tableOfPancakes;
    }

    public void flip(int high) {
        for (int i = 0; i < high; ++i) {
            tableOfPancakes[i] += tableOfPancakes[high];
            tableOfPancakes[high] = tableOfPancakes[i] - tableOfPancakes[high];
            tableOfPancakes[i] -= tableOfPancakes[high];
            --high;
        }
    }

    public void print(){
        for(Integer pancake : tableOfPancakes){
            System.out.print(pancake + " ");
        }
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
