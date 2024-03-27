import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class calculadorajunitteste{
	
@Test

public void SomarDoisNumerosPositivos(){
    calculadora calc = new calculadora();
    
    //Cenário de teste 1: soma de dois valores
    int soma = calc.somar(5,6);
    assertEquals(11,soma);
  //Cenário de teste 2: soma de dois valores sendo um zero
    soma = calc.somar(7,0);
    assertEquals(7,soma);
  //Cenário de teste 3: soma de dois valores sendo que ambos são zero
    soma = calc.somar(0,0);
    assertEquals(0,soma);
  //Cenário de teste 4: soma de dois valores sendo um negativo
    soma = calc.somar(5,-2);
    assertEquals(3,soma);
  //Cenário de teste 5: subtação de dois valores
    int subtrair = calc.subtrair(4,6);
    assertEquals(-2,subtrair);
  //Cenário de teste 6: subtração de dois valores sendo um zero
    subtrair = calc.subtrair(8,0);
    assertEquals(8,subtrair);
  //Cenário de teste 7: subtração de dois valores sendo que ambos são zero
    subtrair = calc.subtrair(0,0);
    assertEquals(0,subtrair);
  //Cenário de teste 8: subtração de dois valores sendo um negativo
    subtrair = calc.subtrair(8,-1);
    assertEquals(9,subtrair);
  //Cenário de teste 9: multiplicação de dois valores
    int multiplicar = calc.multiplicar(2,5);
    assertEquals(10,multiplicar);
  //Cenário de teste 10: multiplicação de dois valores sendo um zero
    multiplicar = calc.multiplicar(3,0);
    assertEquals(0,multiplicar);
  //Cenário de teste 11: multiplicação de dois valores sendo que ambos são zero
    multiplicar = calc.multiplicar(0,0);
    assertEquals(0,multiplicar);
  //Cenário de teste 12: multiplicação de dois valores sendo um negativo
    multiplicar = calc.multiplicar(6,-1);
    assertEquals(-6,multiplicar);
  //Cenário de teste 13: divisão de dois valores
    int dividir = calc.dividir(8,4);
    assertEquals(2,dividir);
  //Cenário de teste 14: divisão de dois valores sendo um zero
    dividir = calc.dividir(6,0);
    assertEquals(0,dividir);
  //Cenário de teste 15: divisão de dois valores sendo que ambos são zero
    dividir = calc.dividir(0,0);
    assertEquals(0,dividir);
  //Cenário de teste 16: divisão de dois valores sendo um negativo
    dividir = calc.dividir(9,-1);
    assertEquals(-9,dividir);
    
}
}
	