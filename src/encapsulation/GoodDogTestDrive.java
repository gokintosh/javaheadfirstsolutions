package encapsulation;

public class GoodDogTestDrive {

    public static void main(String[] args) {
        GoodDog dog1=new GoodDog();
        dog1.setSize(45);
        GoodDog dog2=new GoodDog();
        dog2.setSize(67);


        System.out.println("Dog 1 has size: "+dog1.getSize());
        System.out.println("Dog 2 has size: "+dog2.getSize());

        dog1.bark();
        dog2.bark();


    }
}
