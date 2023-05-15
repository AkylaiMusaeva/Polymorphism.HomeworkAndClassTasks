package theoryTask;
/**Создайте класс Person с методом
 walk.
 Создайте 3 класса наследника которые называются
 Programmer, Dancer и Singer. Эти классы должны
 переопределить метод walk от родительского
 класса но реализация метода должна отличатся от
 реализации в родительком классе.
 Создайте массив положите туда одного
 программиста, танцора и певца. Заставьте всех
 людей из массива ходить*/

import javax.naming.ldap.LdapName;

public class Main {
    public static void main(String[] args) {
        Person[]people={new Programmer("emma"),
                new Dancer("aiza"),
                new Singer("rm")};
        for(Person person:people){
            if (person.getClass().equals(Dancer.class)){
                person.getInfo(12,"is dancing");
            }else if(person.getClass().equals(Programmer.class)){
                person.getInfo(13,"is coding ");
            }else {
                person.getInfo(14,"is singing");
            }

        }
    }
}