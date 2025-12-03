public class Exercise4_2 {

    // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {          // 1
        zippo("rattle", 13);                          // 2
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);                    // 6
        zippo("ping", -5);                            // 7
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {                               // 9
            System.out.println(quince + " zoop");     // 10
        } else {
            System.out.println("ik");                 // 3
            baffle(quince);                           // 4
            System.out.println("boo-wa-ha-ha");       // 11
        }
    }
}


baffle metoduna ilk gönderilen blimp parametresi → "rattle".

ik
rattle
ping zoop
boo-wa-ha-ha
