package builder.designpattern;

// Builder DP: Creating an object step by step and a method to finally get the object instance.
public class PhoneBuilder {

    private String os;
    private String processor;
    private double size;
    private int battery;
    private int camera;


    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setSize(double size) {
        this.size = size;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,processor,size,battery,camera);
    }


}
