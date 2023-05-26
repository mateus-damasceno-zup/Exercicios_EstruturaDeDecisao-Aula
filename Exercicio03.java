import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Irei fazer 5 perguntas sobre um crime!!\n" +
                "Responda com (S) para Sim ou (N) para Não: ");

        System.out.println("Telefonou para a vítima?" );
            String tel = sc.next();
        System.out.println("Esteve no local do crime?");
            String local = sc.next();
        System.out.println("Mora perto da vítima?");
            String vitima = sc.next();
        System.out.println("Devia para a vítima?");
            String devedor = sc.next();
        System.out.println("Já trabalhou com a vítima?");
            String trabalho = sc.next();
            int cont=0;

            if(tel.equalsIgnoreCase("S")){
                cont++;
            }
            if (local.equalsIgnoreCase("S")) {
                cont++;
            }
            if (vitima.equalsIgnoreCase("S")) {
                cont++;
            }
            if (devedor.equalsIgnoreCase("S")) {
                cont++;
            }
            if (trabalho.equalsIgnoreCase("S")) {
                cont++;
            }
        //System.out.println(cont);
            switch (cont){

                case 0:
                    System.out.println("Inocente");
                    break;
                case 1:
                    System.out.println("Suspeita");
                    break;
                case 2:
                    System.out.println("Suspeita");
                    break;
                case 3:
                    System.out.println("Cúmplice");
                    break;
                case 4:
                    System.out.println("Cúmplice");
                    break;
                case 5:
                    System.out.println("Culpado");
                    break;

            }

  //          if (cont <=0){
  //              System.out.println("inocente");
  //          }else if (cont <=2) {
  //              System.out.println("suspeita");
  //          }else if (cont <=4){
   //             System.out.println("Cúmplice");
    //        }else{
  //              System.out.println("culpado");
  //      }

    }
}
