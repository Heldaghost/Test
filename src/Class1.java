import java.util.Objects;

public class Class1 {
    public static void Aloha()
    {
        System.out.println("Darova");
    }
    private String name;
    private int age;
    private int id;
    private int height;

    public Class1(String name, int age, int id, int height) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Class1)) return false;
        Class1 class1 = (Class1) o;
        return age == class1.age &&
                height == class1.height &&
                name.equals(class1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    @Override
    public String toString() {
        return "Class1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", height=" + height +
                '}';
    }

    public void Mess()
    {

        System.out.println("Govnische");
    }

}
