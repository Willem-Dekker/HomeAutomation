public class DimbareLamp extends Lamp {
    int helderheid;

    public DimbareLamp() {
    }

    public void setHelderheid(int helderheid) {
        this.helderheid = helderheid;
    }

    @Override
    public String toString() {
        String output = aan?super.toString() + " met helderheid " + helderheid:super.toString();
        return output;
    }
}
