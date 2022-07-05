package HomeWork04;
public class Car {
    public double vol;
    public double rest;
    public double cons;


    public Car(double vol, double rest, double cons) {
        this.vol = vol;
        this.rest = rest;
        this.cons = cons;
    }

    public double full(double vol, double rest) {
        return vol - rest;
    }

    public double remaining(double rest, double cons, double N) {
        return rest - ((cons / 100) * N);
    }

    public double refueling(double rest, double cons, double N) {
        return (cons / 100) * N - rest;
    }
}
