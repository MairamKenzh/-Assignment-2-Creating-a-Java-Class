public class Plant {
    private String name;
    private String species;
    private double height;
    private boolean isIndoor;

    public Plant(String name, String species, double height, boolean isIndoor) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.isIndoor = isIndoor;
    }

    public Plant() {
        this.name = "";
        this.species = "";
        this.height = 0.0;
        this.isIndoor = false;
    }

    public void displayInfo() {
        System.out.println("Plant Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Species: " + this.species);
        System.out.println("Height: " + this.height + " cm");
        System.out.println("Indoor plant: " + (this.isIndoor ? "Yes" : "No"));
    }

    public void grow(double growthAmount) {
        this.height += growthAmount;
        System.out.println(this.name + " has grown by " + growthAmount + " cm.");
    }

    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Plant plant2 = new Plant("Aloe Vera", "Aloe", 35.5, true);

        plant1.displayInfo();
        plant2.displayInfo();

        plant2.grow(5.0);
        plant2.displayInfo();
    }
}
