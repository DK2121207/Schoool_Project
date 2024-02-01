public class Person {
    private String name;
    private int age, weight;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String nameGetter() {
        return this.name;
    }
    public int ageGetter() {
        return this.age;
    }
    public int weigthGetter() {
        return this.weight;
    }
}