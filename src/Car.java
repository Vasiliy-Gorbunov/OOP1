public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null || brand.equals("")) {
            brand = "default";
        }
        if (model == null || model.equals("")) {
            model = "default";
        }
        if (productionCountry == null || productionCountry.equals("")) {
            productionCountry = "default";
        }
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        if (color == null || color.equals("")) {
            color = "белый";
        }
        if (productionYear <= 0) {
            productionYear = 2000;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    String separator() {
        return "=======================";
    }

    @Override
    public String toString() {
        return "Автомобиль: "+ brand+" "+model+"\n "+
                productionYear+" года выпуска"+"\n "+
                "Страна сборки: "+productionCountry+"\n "+
                "Цвет: "+color+"\n "+
                "Объём двигателя: "+engineVolume+" л."+"\n"+
                separator();
    }
}
