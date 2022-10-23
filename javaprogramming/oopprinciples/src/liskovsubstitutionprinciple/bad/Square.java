package liskovsubstitutionprinciple.bad;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(int width, int height) {
        super(width, height);
    }

    public Square(int size){
        width=height=size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

}
