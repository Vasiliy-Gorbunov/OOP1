package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry) {
        this(brand, model, productionYear, productionCountry, "белый", 100);
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color) {
        this(brand, model, productionYear, productionCountry, color, 100);
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        if (productionYear <= 0) {
            productionYear = 2000;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            productionCountry = "default";
        }
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            color = "белый";
        }
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 100;
        }
        this.maxSpeed = maxSpeed;
    }
}
