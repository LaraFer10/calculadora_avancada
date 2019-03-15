
package calculadora;




public class CalcSimples {
    public int operacao(String x){
        int num1 = 0, num2 = 0;
        
            if("+".equals(x)){
                int soma = num1+num2;
                return soma;
            }else{
                if("-".equals(x)){
                     int sub = num1-num2;
                     return sub;
                }else{
                    if("/".equals(x)){
                        int div = num1/num2;
                        return div;
                    }else{
                        if(x.equals("*")){
                            int mult = num1*num2;
                            return mult;
                        }
                    }
                }
            } 
        return 0;
  
    }
}
