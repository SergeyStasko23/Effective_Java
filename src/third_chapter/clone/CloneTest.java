package third_chapter.clone;

import third_chapter.LastOwner;
import third_chapter.PhoneNumber;

import java.util.Arrays;

public class CloneTest {
    public static void main(String[] args) {
        // 1
        PhoneNumber bobNumber = new PhoneNumber("89996667788", "Bob");
        PhoneNumber clonedBobNumber = bobNumber.clone();
        checkCloneObject(bobNumber, clonedBobNumber);

        // 2
        PhoneNumber erikaNumber = new PhoneNumber("89996667788", "Erika", Arrays.asList(new LastOwner("George"), new LastOwner("Michael")));
        PhoneNumber clonedErikaNumber = erikaNumber.clone();
        checkCloneObject(erikaNumber, clonedErikaNumber);
    }

    private static void checkCloneObject(PhoneNumber original, PhoneNumber clone) {
        if (original != clone && original.getClass() == clone.getClass() && original.equals(clone)) {
            System.out.println("Клон верный");
        }
    }
}
