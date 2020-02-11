public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("Hello world!!!");
        System.out.println("Hello, Alina!");
        Class1 obj = new Class1("Masha", 16,1,190);
        obj.Mess();
        Class1.Aloha();
        obj.Aloha();
        Class1 Sasha = new Class1("Sasha",20,2,196);
        System.out.println(obj.toString());
        System.out.println(Sasha.toString());
        System.out.println("Освоил гит!");
    }
}
