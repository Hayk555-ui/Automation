package Auto;

public class Autoclass {

    private String mark;
    private int speed;
    private int maxLimit;
    private String petHamaranish;
    private boolean stateEngine;

    Autoclass(String mark, int speed, String petHamaranish, boolean stateEngine){
        this.mark = mark;
        this.speed = speed;
        this.petHamaranish = petHamaranish;
        this.stateEngine = stateEngine;
        maxLimit = 160;
    }

    public int getSpeed() {
        return speed;

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAcceleration(){
        return speed;
    }

    public void setAcceleretion(int speed1){
        if (stateEngine == false){
            System.out.println("You can't accelerate, cause the ignition is off!" );
            speed1 = 0;
        }else
        speed = speed + speed1;
    }

    public double getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(double maxLimit) {
        if (maxLimit>160)
            System.out.println("The car can't go faster");

    }

    public String getPetHamaranish() {
        return petHamaranish;
    }

    public void setPetHamaranish(String petHamaranish) {
        this.petHamaranish = petHamaranish;
    }

    public boolean isStateEngine(){
        if (stateEngine) {
            System.out.println("First start the engine!");
        }
        return stateEngine;
    }

}
