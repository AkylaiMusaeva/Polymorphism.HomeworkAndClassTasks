package theoryTask2;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal();
        voice(animal);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        Butterfly butterfly=new Butterfly();
        butterfly.fly();
        voice(butterfly);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        Snake snake=new Snake();
        voice(snake);
        snake.bite();
    }
        public static void voice(Animal animal){
            animal.talk();
        }
}
