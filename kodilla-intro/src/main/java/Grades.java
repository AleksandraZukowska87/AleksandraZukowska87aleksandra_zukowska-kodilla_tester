public class Grades {
    private int[] grades;
    private int size;
    public Grades(){
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int getLast(){
        return this.grades[this.size-1];
    }
    public int getAverage(){
        int total = 0;

        for (int i = 0; i <this.size; i++){
            total += this.grades[i];
        }
        total = total / this.size;
        return total;
    }
}
