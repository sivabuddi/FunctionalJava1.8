package creationaldesingpattern.builder.designpattern;

public class Phone {

    private String os;
    private String processor;
    private double size;
    private int battery;
    private int camera;

    public Phone(String os, String processor, double size, int battery, int camera) {
        //super();
        //super();
        this.os = os;
        this.processor = processor;
        this.size = size;
        this.battery = battery;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", size=" + size +
                ", battery=" + battery +
                ", camera=" + camera +
                '}';
    }
}
