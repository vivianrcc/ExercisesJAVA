import java.util.Scanner;

/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int anoUsuario, mesUsuario, diaUsuario, totaldias;

        //ENTRADA DE DADOS
        System.out.println("Digite sua idade (Anos): ");
        anoUsuario = scanner.nextInt();

        System.out.println("Digite quantos meses : ");
        mesUsuario = scanner.nextInt();

        System.out.println("Digite os dias : ");
        diaUsuario = scanner.nextInt();

        //DEFININDO VALOR DAS VARIAVEIS PARA SOMA
        int calculandoAno = 365 * anoUsuario;
        int calculandoMes = 30 * mesUsuario;

        //SOMANDO VALORES PARA A SAIDA DE DADOS
        totaldias = calculandoAno + calculandoMes + diaUsuario;

        System.out.println("O total de dias é:" + totaldias);
    }

}
