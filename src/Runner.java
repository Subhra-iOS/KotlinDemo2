/**
 *
 * Created by Subhra
 */

interface HumanRace1{

    void think();
}
public class Runner {

    public static void main(String[] args){

        int result = Root.maxOut(30,100);
        System.out.println(result);

        int amount = Root.calcAmount(70);
        System.out.println(amount);

        /**
         * Anonymous inner class in java
         */
        HumanRace1 programer1 = new HumanRace1() {
            @Override
            public void think() {
                System.out.println("We think virtually....");
            };
        };

        programer1.think();

        ClassA.show(); //To call a static method from kotlin
    }
}
