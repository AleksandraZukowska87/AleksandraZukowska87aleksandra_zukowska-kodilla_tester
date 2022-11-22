public class Color {

    public static void main(String[] args){
        String color = getColor();
        System.out.println(color);
    }
    public static String getColor(){
        while(true){
        String color  = UserDialogs.getColorValue();
        String result;
            switch (color.toLowerCase()){
                case "r":
                    result = "Red";
                    return result;
                case "b":
                    result = "Blue";
                    return result;
                case "y":
                    result = "Yellow";
                    return result;
                case "o":
                    result = "Orange";
                    return result;
                default:
                    System.out.println("Something went wrong. Try again.");
            }
        }

    }
}
