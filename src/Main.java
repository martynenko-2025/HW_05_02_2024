public class Main {
    public static void main(String[] args) {
        Person[] people ={
                new Person("Jack",20),
                new Person("Nick",18),
                new Person("Lena",31),
                new Person("Svetlana",28),
                new Person("Ron",21),
                new Person("Mark",29),
        };
        PersonArrayHandler handler = new PersonArrayHandler(people);
        System.out.println(handler);
        System.out.println("Самый старший: " + handler.get(handler.indexOfMaxAgePerson()));

        Person person = handler.get(4);
        System.out.println(person);


        System.out.println(handler.isPersonExists(new Person("Ron", 21)) ? " нашли" : "не нашли");
        System.out.println(handler.isPersonExists(handler.get(4)) ? " нашли" : "не нашли");
        System.out.println(handler.isPersonExists(people[4]) ? " нашли" : "не нашли");


    }
}

/*
Давайте немного вспомним массивы:


Создайте класс Person(String name, int age). Создайте класс PersonArrayHandler, с единственным полем Person[] array.  Сам массив может задаваться в конструкторе. Реализуйте несколько методов:
toString() (Arrays.toString не используем!)
int indexOfMaxAgePerson() - метод, который вернет index самого взрослого Person. Предположим, что возраст у всех Person разный, повторов нет.
int indexOfMaxAgePerson(int index) - метод, который вернет index самого взрослого Person, начиная с заданного index Предположим, что возраст у всех Person разный, повторов нет.
boolean isPersonExists(Person person) - метод, который есть ли заданный Person в нашем массиве
boolean isPersonExists(Person[] person) - метод, который есть ли все Person из массива Person[] person  в нашем массиве
[По желанию]*  List  retainAll(Person[] person ) Формирует ArrayList из всех Person,  которые входят и в переданный массив и в наш массив

 */
