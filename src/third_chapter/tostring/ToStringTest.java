package third_chapter.tostring;

import third_chapter.PhoneNumber;

public class ToStringTest {
    public static void main(String[] args) {
        // Без переопределения toString(): second_chapter.comparing.PhoneNumber@bdc949e6

        /* С переопределением toString():
           PhoneNumber{number='79103234121', name='Bob'}
           Номер телефона: 79103234121. Название контакта: Bob
         */
        System.out.println(new PhoneNumber("79103234121", "Bob"));
    }
}
