/* Exercicio de sobrecarga de métodos
Sobrecarga é a modificação da mudança de parametros
utilizando o mesmo nome do método*/


public class Quadrilatero {
    public static void area(double lado){
        System.out.println("Area do quadrado: "+lado*lado);
    }

    public static void area(double lado1, double lado2){
        System.out.println("Area do retângulo: "+lado1 * lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Area do trapézio: "+(baseMaior + baseMenor)*altura/2);
    }
    public static void area(float diagonal1, float diagonal2){  // neste caso a mudança ficou igual ao segundo, sendo necessário alterar para float
        System.out.println("Area do losango: "+(diagonal1 * diagonal2)/2);
    }
}
