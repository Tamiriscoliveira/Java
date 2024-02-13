public class Calculadora {
   int dobrarNumero(int numero){
       return  numero * 2;
   }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);
    }
}
