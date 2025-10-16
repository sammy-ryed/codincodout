
// File: NotificationService.java
interface Notifier {
    void send(String message);
}

public class Service {
    public void triggerAlert() {
        Notifier notifier = new Notifier() {
            public void send(String message) {
                System.out.println("ALERT: " + message);
            }
        };
        notifier.send("System Overload!");
    }

    public static void main(String[] args) {
        new Service().triggerAlert();
    }
}
