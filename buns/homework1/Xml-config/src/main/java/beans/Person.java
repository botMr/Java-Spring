package beans;

public class Person {
    private Pet pet;
    private String name;
    private String surname;
    private int age;

    public Person(Pet pet){
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Привет мой питомец!");
        pet.say();
    }
}
