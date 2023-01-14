package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int productionYear, String productionCountry, String color) {
        super(brand, model, productionYear, productionCountry, color);
    }

    public String toString() {
        return "Автобус: " + getBrand() + " " + getModel() + "\n " +
                getProductionYear() + " года выпуска" + "\n " +
                "Страна сборки: " + getProductionCountry() + "\n " +
                "Цвет: " + getColor()+"\n"+
                separator();
    }

    private String separator() {
        return "=======================";
    }
}
