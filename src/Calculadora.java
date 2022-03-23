
/*Classe para utilização de métodos;*/

public class Calculadora {
    public static void somar(double a, double b)
    {
        double resultado = a + b;
        System.out.println("A soma de "+a+" + "+b+" = "+resultado);
    }
    public static void subtrair(double a, double b)
    {
        double resultado =  a-b;
        System.out.println("A subtração de "+a+" -"+b+" = "+resultado);
    }
    public static void dividir(double a, double b)
    {
        double resultado =  a/b;
        System.out.println("A divisão de "+a+" / "+b+" = "+resultado);
    }
    public static void multiplicar(double a, double b)
    {
        double resultado =  a*b;
        System.out.println("A divisão de "+a+" * "+b+" = "+resultado);
    }

}
