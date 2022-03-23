

public class Emprestimo {

    public  static int getDuasParcelas(){
        return 2;
    }
    public  static int getTresParcelass(){
        return 3;
    }
    public  static double getTaxaDuasParcelass(){
        return 0.3;
    }
    public  static double getTaxaTresParcelass(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){
        if(parcelas == 2){
            double valorFinal = valor + (valor*getTaxaDuasParcelass());
            System.out.println("Valor do empréstimo para 2 parcelas: "+valorFinal);
        }
        else if(parcelas == 3){
            double valorFinal = valor + (valor*getTaxaTresParcelass());
            System.out.println("Valor de empréstimo para 3 parcelas: "+valorFinal);
        }
        else{
            System.out.println("Quantidade de parcelas não aceitas");
        }
    }

}
