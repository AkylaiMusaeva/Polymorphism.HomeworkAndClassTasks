package theoryTask;

public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void getInfo(int age,String action){
        System.out.println(name+" "+age+" "+action);
    }
}
