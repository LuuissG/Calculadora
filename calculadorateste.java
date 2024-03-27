

public class calculadorateste {

	public static void main(String[] args) {
        calculadora calc = new calculadora();
        
        //Cenário de teste 1: soma de dois valores
        int soma = calc.somar(4, 2);
        System.out.println(soma);
        //Neste cenário espera-se o valor 6

        
        //Cenário de teste 2: soma de dois valores sendo um zero
        soma = calc.somar(7, 0);
        System.out.println(soma);
        //Neste cenário espera-se o valor 7

        
        //Cenário de teste 3: soma de dois valores sendo que ambos são zero
        soma = calc.somar(0, 0);
        System.out.println(soma);
        //Neste cenário espera-se o valor 0

        
        //Cenário de teste 4: soma de dois valores sendo um negativo
        soma = calc.somar(5, -2);
        System.out.println(soma);
        //Neste cenário espera-se o valor 3

                
        //Cenário de teste 5: subtração de dois valores
        int subtracao = calc.subtrair(4, 6);
        System.out.println(subtracao);
        //Neste cenário espera-se o valor -2

        
        //Cenário de teste 6: subtração de dois valores sendo um zero
        subtracao = calc.subtrair(8, 0);
        System.out.println(subtracao);
        //Neste cenário espera-se o valor 8

        
        //Cenário de teste 7: subtração de dois valores sendo que ambos são zero
        subtracao = calc.subtrair(0, 0);
        System.out.println(subtracao);
        //Neste cenário espera-se o valor 0

        
        //Cenário de teste 8: subtração de dois valores sendo um negativo
        subtracao = calc.subtrair(8, -1);
        System.out.println(subtracao);
        //Neste cenário espera-se o valor 9

        //Cenário de teste 9: multiplicação de dois valores
        int multiplicar = calc.multiplicar(2, 5);
        System.out.println(multiplicar);
        //Neste cenário espera-se o valor 10
        
        
        //Cenário de teste 10: multiplicação de dois valores sendo um zero
        multiplicar = calc.multiplicar(3, 0);
        System.out.println(multiplicar);
        //Neste cenário espera-se o valor 0

        
        //Cenário de teste 11: multiplicação de dois valores sendo que ambos são zero
        multiplicar = calc.multiplicar(0, 0);
        System.out.println(multiplicar);
        //Neste cenário espera-se o valor 0

        
        //Cenário de teste 12: multiplicação de dois valores sendo um negativo
        multiplicar = calc.multiplicar(6, -1);
        System.out.println(multiplicar);
        //Neste cenário espera-se o valor -6

        
        //Cenário de teste 13: divisão de dois valores
        int dividir = calc.dividir(8, 4);
        System.out.println(dividir);
        //Neste cenário espera-se o valor 2

        
        //Cenário de teste 14: divisão de dois valores sendo um zero
        try {
			dividir = calc.dividir(6, 0);
			System.out.println(dividir);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao dividir por 0");
			e.printStackTrace();
		}
        //Neste cenário não é possível realizar divisão por 0
        
        //Cenário de teste 15: divisão de dois valores sendo que ambos são zero
        try {
        dividir = calc.dividir(0, 0);
        System.out.println(dividir);
		} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Erro ao dividir por 0");
		e.printStackTrace();
        //Neste cenário não é possível realizar divisão por 0

        
        //Cenário de teste 16: divisão de dois valores endo um negativo
        dividir = calc.dividir(9, -1);
        System.out.println(dividir);
        //Neste cenário espera-se o valor -9
    }
	}
}

