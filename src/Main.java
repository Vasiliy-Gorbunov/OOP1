public class Main {
    public static void main(String[] args) {
        Car lada = new Car("", "Granta", 1.7, "Жёлтый", 2015, "Россия");
        Car audi = new Car("Audi", null, 3.0, "Чёрный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", -3.0, "Чёрный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", -2016, null);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}