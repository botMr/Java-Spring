package beans;

public class Person {
    private Pet pet;

    public Person(Pet pet){
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Привет питомец!");
        pet.say();
    }

    public void whereDog(){
        System.out.println("Где мой пёс?");
    }

}

