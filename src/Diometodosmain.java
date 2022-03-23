//Exercicio Proposto a partir de metodos com cálculo de soma, divisão,
// multiplicação e subtração, comparação de data e hora e emprestimo;

/* -----Importação de classe----*/

public class Diometodosmain {
    public static void main(String[] args) {
//                  CALCULADORA
        System.out.println("EXERCICIO CALCULADORA");
        Calculadora.somar(3,6);
        Calculadora.subtrair(8,6);
        Calculadora.multiplicar(2,4);
        Calculadora.dividir(5,2.5);


//                  MENSAGEM
        Horadia.obterMensagem(5);
        Horadia.obterMensagem(3);
        Horadia.obterMensagem(13);


//                  EMPRESTIMO
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas()); //passar o parametro do método
        Emprestimo.calcular(1000,Emprestimo.getTresParcelass()); //mostrar que é possivel fazer isso
        Emprestimo.calcular(1000,5);

    }
}
