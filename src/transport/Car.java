package transport;

public class Car extends Transport {

    private final class Key {

        private final boolean remoteLaunch;

        private final boolean keylessAccess;

        public Key(boolean remoteLaunch, boolean keylessAccess) {
            this.remoteLaunch = remoteLaunch;
            this.keylessAccess = keylessAccess;
        }
    }


    private double engineVolume;


    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int seatNumbers;
    private boolean winterTyres;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String regNumber, int seatNumbers, boolean winterTyres) {
        super(brand, model, productionYear, productionCountry, color);
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            bodyType = "default";
        }
        if (seatNumbers <= 0) {
            seatNumbers = 4;
        }
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        this.bodyType = bodyType;
        setRegNumber(regNumber);
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
        return "Автомобиль: " + getBrand() + " " + getModel() + "\n " +
                getProductionYear() + " года выпуска" + "\n " +
                "Страна сборки: " + getProductionCountry() + "\n " +
                "Цвет: " + getColor() + "\n " +
                "Объём двигателя: " + engineVolume + " л." + "\n " +
                "Тип трансмиссии: " + transmission + "\n " +
                "Тип кузова: " + bodyType + "\n " +
                "Регистрационный номер: " + regNumber + "\n " +
                "Количество мест: " + seatNumbers + "\n " +
                "Резина: " + tyre + "\n" +
                separator();
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
