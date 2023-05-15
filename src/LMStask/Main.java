package LMStask;
/**Animal деген класс тузунуз жана бир метод кошунуз.
 Анын 3 наследнигин тузунуз.
 Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
 Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
 instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
 чыгарыныз.
 Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз.

 Создайте класс Animal с одним методом которые есть 3 наследника такие как
 Shark, с методом attack(), Turtle с методом swim(), Eagle с методом fly().
 Создайте массив используя Animal и положите туда всех наследников.
 Используя instanceOf и getClass() вызовите свои методы животных из массива Animal.
 Для каждого объекта по отдельности создайте массив и разделите животных из Animal massiva и положите в свои массивы.*/
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Animal []animals={new Shark("Shark"),new Turtle("Turtle"),new Eagle("Eagle"),
                          new Shark("Shark2"),new Turtle("Turtle2"),new Eagle("Eagle2")};
        Shark[]sharks=new Shark[2];
        Turtle [] turtles=new Turtle[2];
        Eagle[]eagles=new Eagle[2];
        for(Animal animal:animals){
//            if (animal.getClass().equals(Shark.class)) {//c 20 строчки до 26 вызов метода с использованием getClass()
//                ((Shark) animal).attack();
//            }else if (animal.getClass().equals(Turtle.class)){
//                ((Turtle) animal).swim();
//            }else if (animal.getClass().equals(Eagle.class)){
//                ((Eagle) animal).fly();
//            }
//            if(animal instanceof Shark){
//
//            }


            if(animal instanceof Shark) {//С 30 строчки по 38 вызов методов каждого класса с использованием instance of
                Shark shark=new Shark("Shark1");
                shark.attack();
                sharks[0]=shark;
                System.out.println("------------------------");
            }else if (animal instanceof Turtle){
                Turtle turtle=new Turtle("Turtle1");
                turtle.swim();
                turtles[0]=turtle;
                System.out.println("------------------------");
            }else if(animal instanceof Eagle){
                Eagle eagle=new Eagle("Eagle1");
                eagle.fly();
                eagles[0]=eagle;
                System.out.println("------------------------");
            }





        }System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));

    }
}
