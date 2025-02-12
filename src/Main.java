import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Semaforo semaforo1 = new Semaforo("rojo");
            String continuar;
            String reset = "\u001B[0m";
            boolean hc = true;
            do {
                semaforo1.mostrarEstado();
                System.out.println(reset + "1. Dar paso a verticales");
                System.out.println("2. Dar paso a horizontales");
                System.out.println("3. Apagar Semaforos");
                System.out.println("Ingrese el numero de la opcion deseada: ");
                int estSemaforo = sc.nextInt();
                switch (estSemaforo){
                    case 1:
                        if(semaforo1.getEstado()== "rojo"){
                        semaforo1.setEstado("amarillo");
                        semaforo1.mostrarEstado();
                        semaforo1.setEstado("verde");}
                        break;
                    case 2:
                        if(semaforo1.getEstado()=="verde"){
                        semaforo1.setEstado("amarillo");
                        semaforo1.mostrarEstado();

                        semaforo1.setEstado("rojo");
                        }
                        break;
                    case 3:
                        hc = false;
                        break;
                }
            } while (hc);
            sc.close();
            System.out.println("Apagando semaforos...");
            System.out.println("Bye :)");
        }
}

