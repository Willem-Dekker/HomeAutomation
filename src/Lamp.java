public class Lamp {
    boolean aan;

    public Lamp() {
    }

    protected void zetAan(){
        this.aan = true;
    }

    protected void zetUit(){
        this.aan = false;
    }

    @Override
    public String toString() {
        return aan?"aan":"uit";
    }
}
