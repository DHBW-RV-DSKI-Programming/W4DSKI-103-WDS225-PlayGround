package main.java.de.dhbw.ravensburg;

abstract class Instrument {
    abstract void playSound();
}

class Gitarre extends Instrument {
    @Override
    void playSound() {
        System.out.println("Gitarre: Kling, kling!");
    }
}

class Klavier extends Instrument {
    @Override
    void playSound() {
        System.out.println("Klavier: Ding, dong!");
    }
}

class MedicalDevice {
    void deviceInfo() {
        System.out.println("Dies ist ein medizinisches Gerät.");
    }
}

class BloodPressureMonitor extends MedicalDevice {
    @Override
    void deviceInfo() {
        System.out.println("Dies ist ein Blutdruckmessgerät.");
    }

    void measure() {
        System.out.println("Messung durchgeführt: 120/80 mmHg");
    }
}

public class TaskPolymorphie {

    public static void main(String[] args) {
        System.out.println("=== Aufgabe 1: Polymorphismus ===");
        Instrument instrument1 = new Gitarre();
        Instrument instrument2 = new Klavier();

        instrument1.playSound();
        instrument2.playSound();

        System.out.println("\n=== Aufgabe 2: Medical Device ===");

        MedicalDevice device = new BloodPressureMonitor();
        device.deviceInfo();

        if (device instanceof BloodPressureMonitor) {
            System.out.println("Das Objekt ist vom Typ BloodPressureMonitor");

            BloodPressureMonitor monitor = (BloodPressureMonitor) device;
            monitor.measure();
        }

        Object[] objects = new Object[] {
                instrument1,
                instrument2,
                device
        };
    }

}
