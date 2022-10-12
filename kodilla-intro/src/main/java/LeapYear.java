public class LeapYear {

    public static void main(String[] args) {
        int year = 2032;
        if(isLeapYear(year)){
            System.out.println("Jest przestepny");
        }else{
            System.out.println("Nie jest przestepny");
        }
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year % 4 == 0) {
            if (year % 100 ==0){
                if (year % 400 ==0){
                    //przestepny
                    result = true;
                }else{
                    //nie przestepny
                    result= false;
                }
            }else{
                //przestepny
                result= true;
            }
        } else {
            // nie przestepny
            result = false;
        }
        return result; // wysylamy wynik
    }
}

