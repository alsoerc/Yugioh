package Models;

public class Magic extends Card{

    public Magic(String name, String  color, String text) {
        this.name = name;
        this.color = color;
        this.text = text;
    }

    public String getName(){return this.name;}

    public String getColor(){return this.color;}

    public String getText(){return this.text;}

    @Override
    public String toString() {
        return "Magic{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
