/*
Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
 */
public class Exercise02 {

    public static void main(String[] args) {

        //Defindo os valores para calcular a media

        int num1 , num2, num3, num4, num5, num6;
        num1 = 8;
        num2 = 9;
        num3 = 7;
        num4 = 4;
        num5 = 5;
        num6 = 6;

        //calculando a média aritmética dos números 8,9 e 7

        int mediaaritmetrica = (num1 + num2 + num3) / 3;
        System.out.println("A media de 8, 9, 7 é:" + mediaaritmetrica);

        //calculando a média dos números  4,5 e 6

        int mediaaritmetrica2 = (num4 + num5 + num6) / 3;
        System.out.println("A media de 4, 5, 6 é:" + mediaaritmetrica2);

        //Somando as duas medias e calculando a media da soma

        int somadasmedias = mediaaritmetrica + mediaaritmetrica2;
        System.out.println("A soma das medias  é:" + somadasmedias);

        int media =  somadasmedias /2;
        System.out.println("A media da soma é:" + media);

    }
}