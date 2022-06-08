package HomeWork04;
public class Main {
    public static void main(String[] args) {
        Car car = new Car(50.0, 20.0, 10.0);
        double refueling = 0.0;
        double r = 0.0;
        double zeroRest = car.rest;
        double price = 50.0;
        // Одесса - Кривое Озеро 178,5 км
        car.rest = car.remaining(car.rest, car.cons, 178.5);
        refueling = car.refueling(car.rest, car.cons, 156.0);
        r = refueling;
        double r1 = r;
        System.out.println("Остаток топлива в Кривое Озеро: " + car.rest);
        System.out.println("Дозаправка в Кривое озеро: " + r);
        // Кривое Озеро - Жашков 156,0 км
        car.rest = car.remaining(car.rest, car.cons, 156.0) + refueling ;
        refueling = car.refueling(car.rest, car.cons, 148.2);
        r = refueling;
        double r2 = r;
        System.out.println("Остаток топлив в Жашков: " + car.rest);
        System.out.println("Дозаправка в Жашков: " + r);
        // Жашков - Киев 148,2 км
        car.rest = car.remaining(car.rest, car.cons, 148.2) + refueling;
        System.out.println("Остаток топлив в Киев: " + car.rest);
        System.out.println();
        // Одесса - Киев 476,0 км
        System.out.println("Итого дозаправлено: " + (r1+r2) + "  " + "за " + ((r1+r2)*price) + " грн.");
        System.out.println("Стоимость всей поездки: " + (zeroRest+(r1+r2))*price + " грн.");
    }
}
