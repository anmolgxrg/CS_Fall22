package datastructures.tsk.test;


abstract class Animal {
    String name;

    abstract String sound();

    abstract String movement();

    Animal(String a) {
        this.name = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

class owl extends Animal {

    int age;

    owl(String name, int a) {
        super(name);
        age=a;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    String sound() {
        return "hoots";
    }

    @Override
    String movement() {
        return "Flys";
    }

    @Override
    public String toString() {
        return this.getClass().getName()+","+sound()+","+movement();
    }
}

class frog extends Animal {

    int age;

    frog(String name, int a) {
        super(name);
        age=a;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    String sound() {
        return "Ribbits";
    }

    @Override
    String movement() {
        return "Jumps";
    }

    @Override
    public String toString() {
        return sound()+","+movement();
    }
}

class donkey extends Animal {

    int age;

    donkey(String name, int a) {
        super(name);
        age=a;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    String sound() {
        return "hee-haw";
    }

    @Override
    String movement() {
        return "Walks";
    }

    @Override
    public String toString() {
        return sound()+","+movement();
    }
}

public class qone {

    public static void main(String[] args) {

        owl aa = new owl("owl", 55);

        System.out.println(aa);

    }

}
