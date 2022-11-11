import java.util.Random;

public class RandomNumbers {
    private int total = 0;
    private int smallest = 50;
    private int biggest = 0;

    public RandomNumbers(){

    }

    public void generateRandom(){
        Random random = new Random();
        do {
            int rand = random.nextInt(31);
            this.total += rand;
            if (rand < this.smallest){
                this.smallest = rand;
            }
            if (rand > this.biggest){
                this.biggest = rand;
            }
        }while(this.total <= 5000);

    }
    public int getSmallest(){
        return this.smallest;
    }
    public int getBiggest(){
        return this.biggest;
    }
    public int getTotal(){
        return this.total;
    }
}
