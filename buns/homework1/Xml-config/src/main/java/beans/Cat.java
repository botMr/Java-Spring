package beans;

public class Cat implements Pet{
    private String name;
    @Override
    public void say(){
        System.out.println("Мяу-мяу");
    }
}
