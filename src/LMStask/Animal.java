package LMStask;

public class Animal {
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public Animal(){

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void live(){
        System.out.println(name + " is eating");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

}
