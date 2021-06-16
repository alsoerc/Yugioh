package Models;

public class Monster extends Card{

    private int attack;
    private int defense;

    public Monster(String name, String color, String text, int attack, int defense){
        this.name = name;
        this.color = color;
        this.text = text;
        this.attack = attack;
        this.defense = defense;
    }

    public Monster() {

    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public int getAttack(){
        return this.attack;
    }

    public void setDefense(int defense){
        this.defense = defense;
    }

    public int getDefense(){
        return this.defense;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public boolean attackCard(int rivalDefense){
        return this.getAttack() > rivalDefense;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", text='" + text + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }

}
