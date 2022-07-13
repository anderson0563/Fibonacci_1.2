package Principal;


/**
 * Implementacao de Fibonacci para aula
 *
 * @author      Anderson
 * @since       1.1
 */
public class Fibonacci {
    /**
     * Aplicacao que calcula o 10o termo da serie de
     * Fibonacci.
     *
     * @param args  parametro da linha de comando
     *              fornecida pelo usuario
     */
    public static void main(String[] args) {
        int n = 10;
        long ans = 0;
        long n1 = 0;
        long n2 = 1;
        for(n--; n > 0; n--){
            ans = n1 + n2;
            n1 = n2;
            n2 = ans;
        }
        System.out.println(ans);
    }
}