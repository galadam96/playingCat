public class playingCat {
    public static void main(String[] args) {
        System.out.printf("%b",isCatPlaying(true,10));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean isPlaying = false;

        if(summer){
            if(temperature >= 25 && temperature <= 45){
                isPlaying = true;
            }
        }
        else {
            if(temperature >= 25 && temperature <= 35){
                isPlaying = true;
            }
        }


        return isPlaying;
    }
}
