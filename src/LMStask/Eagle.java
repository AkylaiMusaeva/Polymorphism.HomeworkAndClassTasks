package LMStask;

public class Eagle extends Animal{
    public Eagle(String name){
        super(name);
    }
    public void fly(){
        System.out.println(getName()+" is flying");
    }
    @Override
    public void live() {
        super.live();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
