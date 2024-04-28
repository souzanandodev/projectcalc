package controle;
import enums.EnumOperacao;

//Criar regras de negocio a ser usado na calculadora

public class CalculadoraController {
    private Double total;
    private int per;
    
    public CalculadoraController(){
        total = 0.0;
        per = 0;
    }
    
    public Double realizaOperacao(EnumOperacao operacao, Double valor){
        if (total == 0){
            total = valor;
        }
        else if(operacao.equals(EnumOperacao.SOMA)){
            total += valor;
        } else if(operacao.equals(EnumOperacao.SUBTRACAO)){
            total -= valor;
        } else if(operacao.equals(EnumOperacao.MULTIPLICACAO)){
            total *= valor;
        } else if(operacao.equals(EnumOperacao.DIVISAO)){
            total /= valor;
        } else if(operacao.equals(EnumOperacao.PORCENTAGEM_ADD)){
            total += total * valor / 100.0;
        } else if(operacao.equals(EnumOperacao.PORCENTAGEM_SUB)){
            total -= total * valor / 100.0;
        }
        return total;
    }
    
    public Double getTotal(){
        return this.total;
    }
    public void zerar(){
       total = 0.0;
    }
    
}
