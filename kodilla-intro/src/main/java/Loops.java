public class Loops {
    public static void main(String [] args){
        //for (int i = 0; i <= 10; i++) {
           // System.out.println(i);
        //}
        //String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        //for (int i = 0; i < names.length; i++){
         //   System.out.println(names[i]);
       // }

        //for (int i = names.length -1;i>= 0; i--){
            //System.out.println(names[i]);

        //}

        int [] numbers = new int[7];
        numbers [0] = 7;
        numbers [1] =234;
        numbers [2] =25;
        numbers [3] =10;
        numbers [4] =15;
        numbers [5] =28;
        numbers [6] =13;

        int result = sumOfElements(numbers);
        System.out.println(result);





        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        for ( int i=0; i< names.length; i ++){
            System.out.println(names[i]);
        }
        for( int i  = names.length -1; i>=0 ; i --){
            System.out.println(names[i]);
        }




    }
    public static int sumOfElements(int[] numbers){
        int result = 0;

        for ( int i =0; i< numbers.length; i++){
            int number = numbers[i];
            result = result + number;
        }
        return result;
    }

}

