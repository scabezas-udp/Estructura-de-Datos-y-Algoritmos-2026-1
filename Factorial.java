public class Factorial {

    public static int getFactorial(int _num){
        int retorno = 1;
        for (int i = 2; i <= _num; i++) {
            // System.out.println("[" + i +"]");
            retorno *= i; // retorno = retorno * i
            // retorno = 1 * 1
        }
        return retorno;
    }
    
    public static int getFactorialRecursivo(int _num){
        // System.out.println("Num!: " + _num);
        // caso base
        if (_num <= 1){
            return 1;
        }
        // llamar de forma recursiva
        return _num * getFactorialRecursivo(_num - 1);
    }


    public static void main(String[] args) {
        System.out.println("Calcular el Factorial");
        int numero = 5;
        System.out.println("Factorial de " + numero + ": " + getFactorial(numero));
        System.out.println("FR de " + numero + "!: " + getFactorialRecursivo(numero));
    }
}
