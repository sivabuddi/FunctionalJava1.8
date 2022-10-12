import java.util.Objects;

public class Student {
    int stdid;
    public Student(int stdid){
        stdid=this.stdid;
    }


    public int getStdid() {
        return stdid;
    }


    @Override
    public boolean equals ( Object obj )
    {
        if ( obj == this ) return true;
        if ( obj == null || obj.getClass() != this.getClass() ) return false;
        Student that = ( Student ) obj;
        return Objects.equals( this.stdid , that.stdid);

    }

    @Override
    public String toString() {
        return "Student [id=" + stdid + ",]";
    }

    @Override
    public int hashCode() {
        return this.stdid;
    }
}
