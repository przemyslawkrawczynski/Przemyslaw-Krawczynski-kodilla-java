package board;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Place {
    private int x, y;
    private int value = -1;
    private List<Integer> notExpectedValue = new ArrayList<>();
    private boolean hasValue = false;

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Place(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return x == place.x &&
                y == place.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


    public void setValue(int value) {
        this.value = value;
        addValueToNotExpectedList(value);
        hasValue = true;

    }

    public void wrongSet() {
        value = -1;
        hasValue = false;
    }

    public String getPosition() {
        return "" + x + y;
    }

    public String getValue() {
        if (value != -1) {
            return Integer.toString(value);
        } else {
            return " ";
        }
    }

    public boolean hasValue() {
        return hasValue;
    }

    public void addValueToNotExpectedList(int value) {
        notExpectedValue.add(value);
    }

    public void removeValueAfterWrongSet(int value) {

        for (int i=0; i<notExpectedValue.size(); i++) {
            if (value == notExpectedValue.get(i)) {
                notExpectedValue.remove(notExpectedValue.get(i));
            }
        }

    }

}
