import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Folha de Pagamento\n\n");
        System.out.println("insira o valor da sua hora: ");
        double precoHora = sc.nextDouble();
        System.out.println("Insira quantas horas no mes voce trabalhou");
        double horas = sc.nextDouble();


        int iRDesconto=0;
        double salarioBruto = precoHora * horas;

        if (salarioBruto <=900.00 && salarioBruto >0){
            iRDesconto=0;
          
        }else if (salarioBruto <=1500){
            iRDesconto=5;

        }else if (salarioBruto <=2500.00){
            iRDesconto=10;

        }else if(salarioBruto > 2500.00){
            iRDesconto=20;

        }else{
            System.out.println("salario invalido");

        }
        System.out.println(iRDesconto);
        double iR = salarioBruto *  ((double)iRDesconto / 100);
        System.out.println(iR);
        double fgts=salarioBruto *0.11;
        double inss = salarioBruto *0.10;
        double salarioLiquido = salarioBruto - iR -inss;
        double totalDescontos = inss + iR;

        System.out.println("=====Extrato=======");
        System.out.println("Salario Bruto: ("+ horas +" * "+precoHora +") : R$"+salarioBruto);
        System.out.println("(-) IR ("+ iRDesconto+"%)                 : R$"+ iR);
        System.out.println("(-) INSS (10%)               : R$"+ inss);
        System.out.println("FGTS (11%)                   : R$"+ fgts);
        System.out.println("Total Descontos:             : R$"+ totalDescontos);
        System.out.println("Salario Liquido:             : R$"+ salarioLiquido);



    }
}
