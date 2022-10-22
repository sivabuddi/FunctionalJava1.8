package creationaldesingpattern.factorydp;

public abstract  class Computer {

    public abstract String getRAM();
    public abstract String getCpu();
    public abstract String getHdd();


    @Override
    public String toString() {
        return "RAM = "+this.getRAM()+ "CPU = "+this.getCpu() + " HDD = "+this.getHdd();
    }


}
