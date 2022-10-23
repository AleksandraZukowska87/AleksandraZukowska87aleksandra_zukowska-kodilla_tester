public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price= price;
        this.year = year;

    }
    public void checkPrice (){
        if ( this.price < 600){
            System.out.println("This notebook is very cheap");


        }else if ( this.price >=600 && this.price <=1000){
            System.out.println("The price is good");
        }else {
            System.out.println("This notebook is expensive");
        }

    }
    public void checkWeight (){
        if( this.weight <150 ){
            System.out.println("jest lekkie");

        }else if ( this.weight >=150 && this.weight <= 300){
            System.out.println(" jest nie zbyt ciezkie");
        }else {
            System.out.println(" jest ciezkie");
        }


    }

}

