import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("", "Granta", 1.7, "Жёлтый", 2015, "Россия", "Ручная", "1", "о123ее37", 6, true);
        Car audi = new Car("Audi", null, 3.0, "Чёрный", 2020, "Германия", null, "", "", 3, false);
        Car bmw = new Car("BMW", "Z8", -3.0, "Чёрный", 2021, "Германия", "", null, "a666ее66", 2, false);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "", 2018, "Южная Корея", "Авто", "2б", "р777ух77", 0, true);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", -2016, null, "Ручная", "", null, 6, true);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        hyundai.setActualTyre(6);
        System.out.println(hyundai);

        Bus icarus = new Bus("Icarus", "80", 1980, "USSR", "red");
        Bus scania = new Bus("Scania", "Bus", 2005, "Швеция", "Жёлтый");
        Bus mercedes = new Bus("Mercedes", "A1", 2020, "Германия", "Чёрный");
        System.out.println(icarus);
        System.out.println(scania);
        System.out.println(mercedes);
    }
}