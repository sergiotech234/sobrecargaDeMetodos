public class impresora {

    public void imprimir(int numero){
        System.out.println("Entero: " +numero);
    }

    public void imprimir(Double numero){
        System.out.println("Decimal: " +numero);
    }

    public void imprimir(String texto){
        System.out.println("Texto: " +texto);
    }

    public void imprimir(String texto,int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(texto);
        }
    }
}