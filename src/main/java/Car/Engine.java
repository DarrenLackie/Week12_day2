package Car;

public class Engine {

    EngineType engineType;
    private double size;
    private int horsepower;

    public Engine(EngineType engineType, double size, int horsepower) {
        this.engineType = engineType;
        this.size = size;
        this.horsepower = horsepower;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public double getSize() {
        return size;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
