package transport;

public class Car {

    private final class Key {

        private final boolean remoteLaunch;

        private final boolean keylessAccess;

        public Key(boolean remoteLaunch, boolean keylessAccess) {
            this.remoteLaunch = remoteLaunch;
            this.keylessAccess = keylessAccess;
        }
    }

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int seatNumbers;
    private boolean winterTyres;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String regNumber, int seatNumbers, boolean winterTyres) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            productionCountry = "default";
        }
        if (Double.compare(engineVolume, 0) == 0 || engineVolume < 0) {
            engineVolume = 1.5;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            color = "белый";
        }
        if (productionYear <= 0) {
            productionYear = 2000;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            transmission = "Авто";
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            bodyType = "default";
        }
        if (regNumber == null || regNumber.isEmpty() || regNumber.isBlank()) {
            regNumber = "default";
        }
        if (seatNumbers <= 0) {
            seatNumbers = 4;
        }

        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.seatNumbers = seatNumbers;
        this.winterTyres = winterTyres;
    }

    public void setActualTyre(int month) {
        if (month > 3 && month < 11) {
            winterTyres = false;
        } else {
            winterTyres = true;
        }
    }

    private String separator() {
        return "=======================";
    }

    @Override
    public String toString() {
        String tyre = "летняя";
        if (winterTyres) {
            tyre = "зимняя";
        }
        return "Автомобиль: " + brand + " " + model + "\n " +
                productionYear + " года выпуска" + "\n " +
                "Страна сборки: " + productionCountry + "\n " +
                "Цвет: " + color + "\n " +
                "Объём двигателя: " + engineVolume + " л." + "\n " +
                "Тип трансмиссии: " + transmission + "\n " +
                "Тип кузова: " + bodyType + "\n " +
                "Регистрационный номер: " + regNumber + "\n " +
                "Количество мест: " + seatNumbers + "\n " +
                "Резина: " + tyre + "\n" +
                separator();
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

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatNumbers() {
        return seatNumbers;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0) == 0 || engineVolume < 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            color = "белый";
        }
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            transmission = "Авто";
        }
        this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty() || regNumber.isBlank()) {
            regNumber = "default";
        }
        this.regNumber = regNumber;
    }

    public boolean isWinterTyres() {
        return winterTyres;
    }

    public void setWinterTyres(boolean winterTyres) {
        this.winterTyres = winterTyres;
    }
}
