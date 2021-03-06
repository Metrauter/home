package classworks.lesson6;

public class Phone {
    private String number;
    private String model;
    private double weight;
    private static int count = 0;

    Phone(String model, String number, double weight) {
        this(model, number);
        this.weight = weight;
    }

    public Phone(String m, String n) {
        model = m;
        number = n;
        count++;
    }

    public Phone() {
        count++;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.number = number;

    }

    static int getCountInstance() {
        return count;
    }

    void receiveCall(String name, String number) {
        System.out.println("Name: " + name + "Number: " + number);
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void sendMessage(String... numbers) {
        System.out.println("Message sent to: ");
        for (String n : numbers) {
            System.out.println(n);
        }
    }
}
