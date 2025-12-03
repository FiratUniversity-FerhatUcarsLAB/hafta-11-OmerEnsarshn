public class main {


        public static void printAmerican(String day, int date, String month, int year) {
            System.out.println(day + ", " + month + " " + date + ", " + year);
        }

        public static void printEuropean(String day, int date, String month, int year) {
            System.out.println(date + " " + month + " " + year + ", " + day);
        }

        public static void main(String[] args) {

            // Hardcoded example (PDF'deki örnek)
            String day = "Monday";
            String month = "July";
            int date = 22;
            int year = 2019;

            printAmerican(day, date, month, year);
            printEuropean(day, date, month, year);

            // ---------------------
            // OPTIONAL: Kullanıcıdan giriş alan versiyon
            // İstersen sadece burayı kullanırsın
            // ---------------------
        /*
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter day: ");
        String uDay = sc.nextLine();

        System.out.print("Enter month: ");
        String uMonth = sc.nextLine();

        System.out.print("Enter date: ");
        int uDate = sc.nextInt();

        System.out.print("Enter year: ");
        int uYear = sc.nextInt();

        System.out.println("American Format:");
        printAmerican(uDay, uDate, uMonth, uYear);

        System.out.println("European Format:");
        printEuropean(uDay, uDate, uMonth, uYear);
        */
        }
    

}
