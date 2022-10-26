package creationaldesingpattern.builder.designpattern1;

public class TestBuildPattern {


    public static void main(String[] args) {

        Computer computer= new Computer.ComputerBuilder("500 GB", "2 GB").setGraphicsCardEnabled(false).setBluetoothEnabled(true).build();
        System.out.println(computer.getHDD());
        System.out.println(computer.getRAM());
        System.out.println(computer.isGraphicsCardEnabled());
        System.out.println(computer.isBluetoothEnabled());


    }
}
