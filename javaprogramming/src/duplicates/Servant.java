package duplicates;

import java.util.Objects;

public class Servant {

    int servantId;



    public void setServantId(int servantId) {
        this.servantId = servantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servant servant = (Servant) o;
        return servantId == servant.servantId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(servantId);
    }

    @Override
    public String toString() {
        return "Servant{" +
                "servantId=" + servantId +
                '}';
    }
}
