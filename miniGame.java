package miniGame;
import java.util.Scanner;
public class miniGame {

	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		int numero = 0;
		int aleatorio = (int)(1+Math.random()*(100 -1));
		int i = 0;
		System.out.println(aleatorio);
		
		
		while (numero!=aleatorio) {
			if(i==0) {
				i++;
				System.out.println("Entre com um Número de 1 á 100;");
				numero = tecla.nextInt();
			}
			if(numero<aleatorio) {
				System.out.println("O número Sorteado é maior que "+ numero);
				System.out.println("Entre com um outro Número :");
				numero = tecla.nextInt();
			}
			else if (numero>aleatorio) {
				System.out.println("O Número Sorteado e menor que  "+ numero);
				System.out.println("Entre Com um outro Número");
				numero = tecla.nextInt();			}
		}
		if(numero == aleatorio) {
			System.out.println("Parabéns vovoce acertou o Número sorteado foi " + numero);
		}
		
		
		

	}

}
