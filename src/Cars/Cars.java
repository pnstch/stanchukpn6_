package Cars;


public enum Cars {

    LADA(200, 2000000, "Vesta", Colours.BLACK, Marks.SEDAN),
    HYUNDAI(250, 1800000, "Solaris", Colours.GREY, Marks.SEDAN),
    KIA(220, 2000000, "Rio", Colours.WHITE, Marks.SEDAN),
    SUBARU(180, 1000000, "Outback", Colours.BLACK, Marks.SEDAN),
    TOYOTA(150, 1000000, "Forenza", Colours.BLACK, Marks.JEEP);

    Cars(int maxSpeed, int cost, String model, Colours colours, Marks marks) {
        this.maxSpeed = maxSpeed;
        this.cost = cost;
        this.model = model;
        this.colours = colours;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "task2.Cars{" +
                "maxSpeed=" + maxSpeed +
                ", cost=" + cost +
                ", model='" + model + '\'' +
                ", colours=" + colours +
                ", marks=" + marks +
                '}';
    }

    public int getCost() {
        return cost;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private int maxSpeed;
    private int cost;
    private String model;
    private Colours colours;
    private Marks marks;
}