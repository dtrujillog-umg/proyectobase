/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata;

/**
 *
 * @author Diego Trujillo
 */
public class Automata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int[] input = {1,1,1,0,1,0};
		int inicio = 1;
		int finalizar = 1;
		int actual = inicio;

		boolean fin = false;

		int contador = 0;
		while(fin==false)
		{
			if(contador > input.length-1)
			{
				fin = true;
				break;
			}
			if(actual==1)
			{
				if(input[contador]==1)
				{
					actual=1;
				}
				if(input[contador]==0)
				{
					actual=2;
				}
				contador++;
				continue;
			}
			if(actual==2)
			{
				if(input[contador]==1)
				{
					actual=2;
				}
				if(input[contador]==0)
				{
					actual=1;
				}
				contador++;
				continue;
			}
		}

		if(actual==finalizar)
		{
			System.out.println("La cadena es acpetada");
		}
		else
		{
			System.out.println("La cadena no es aceptada");
		}

	}    }
    

