import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======Bomba de Combustivel=====");
        System.out.println("digite quantos litros foi vendido");
        double litros = sc.nextDouble();
        System.out.println("Digite A-Alcool \n    G-Gasolina ");
        String combustivel = sc.next();

        double desconto=0;
        double precoLitro=0;

        if (combustivel.equalsIgnoreCase("A")){
            precoLitro=1.90;
            if (litros >0 && litros <=20){
                desconto=3;
            } else if (litros >20) {
                desconto=5;
            }else{
                System.out.println("erro!!!");
                System.out.close();
            }

        } else if (combustivel.equalsIgnoreCase("G")) {
            precoLitro=2.50;
            if (litros >0 && litros <=20){
                desconto=4;
            } else if (litros >20) {
                desconto=6;
            }else{
                System.out.println("erro!!!!");
                System.out.close();
            }
        }else{
            System.out.println("entrada invalida");
            System.out.close();
        }

        double valorDesconto = desconto/100;
        double precoSemDesconto = precoLitro * litros;
        double precoComDesconto = precoSemDesconto - (precoSemDesconto * valorDesconto);


        System.out.println("tipo de combustivel: " + combustivel.toUpperCase());
        System.out.println("Preço Litro: "+precoLitro);
        System.out.println("% do desconto "+ desconto);
        System.out.println("preço sem desconto: "+precoSemDesconto);
        System.out.println("preço com desconto: "+ precoComDesconto);
    }
}
