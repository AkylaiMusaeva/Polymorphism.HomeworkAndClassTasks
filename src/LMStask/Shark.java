package LMStask;

public class Shark extends Animal{
    public Shark (String name){
        super(name);
    }
    public void attack(){
        System.out.println(getName() +" is attacking ");
    }
    @Override
    public void live(){
        super.live();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
