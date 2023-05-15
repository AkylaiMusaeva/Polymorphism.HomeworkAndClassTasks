package LMStask;

public class Turtle extends Animal{
    public Turtle(String name){
        super(name);
    }
    public void swim(){
        System.out.println(getName() +" is swimming");
    }
    @Override
    public void live() {
        super.live();
    }
}
