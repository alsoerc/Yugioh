package Models;

public class Trap extends Card {

    public Trap(String name, String  color, String text) {
        this.name = name;
        this.color = color;
        this.text = text;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){return this.color;}

    public String getText(){return this.text;}




    @Override
    public String toString() {
        return "Trap{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
