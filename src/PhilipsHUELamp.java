public class PhilipsHUELamp extends DimbareLamp {
    int red,green,blue;

    public PhilipsHUELamp() {
    }

    public void setKleur(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public String toString() {
        String output = aan?super.toString() + " en RGB kleur (" + this.red + "," +this.green+ "," +this.blue+")":super.toString();
        return output;
    }
}
