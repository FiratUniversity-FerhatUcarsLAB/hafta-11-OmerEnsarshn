public class Exercise4_6_Multadd {

    // a * b + c işlemini yapan metot
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // x * e^(-x) + (1 - e^(-x)) ifadesini hesaplayan metot
    public static double expSum(double x) {
        return x * Math.exp(-x) + (1 - Math.exp(-x));
    }

    public static void main(String[] args) {
        // multadd testleri
        double result1 = multadd(1.0, 2.0, 3.0);
        System.out.println("multadd(1.0, 2.0, 3.0) = " + result1);

        // sin(pi/4) + cos(pi/4)/2 ifadesi multadd ile
        double sinCos = multadd(Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4));
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + sinCos);

        // log(10) + log(20) ifadesi multadd ile
        double logSum = multadd(Math.log(10), 1, Math.log(20)); // a*b + c → a*1 + c = a + c
        System.out.println("log(10) + log(20) = " + logSum);

        // expSum testleri
        double x = 2.0;
        double expResult = expSum(x);
        System.out.println("expSum(2.0) = " + expResult);
    }
}
