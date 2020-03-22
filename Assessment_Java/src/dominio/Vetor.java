//08º Dado um vetor com números repetidos, gere uma hashtable onde a chave é o número que aparece no vetor e o valor é o número de vezes que aparece.
//Exemplo: [1, 2, 3, 2, 2, 3, 3, 3, 3] resultará em: {'1': 1, '2': 3, '3': 5}. Entregue o código fonte que você escreveu incluindo-o no documento
//final em PDF. Inclua também um printscreen do seu programa em execução.

package dominio;
import java.util.Hashtable;
import java.util.Scanner;

public class Vetor {

    private int number;

    public void vetor(){

        Scanner input = new Scanner( System.in);
        Hashtable<Integer, Integer> number_list = new Hashtable <>();

        System.out.print("Quantidade de numeros: ");
        number = input.nextInt();

        int[] nota = new int[number];

        for (int i = 0; i < number; i++){
            System.out.print((i+1)+"º Número: ");
            nota[i] = input.nextInt();
        }

        for(int i = 0; i < number; ++i){

            if(!number_list.containsKey(nota[i])){
                number_list.put(nota[i],1);
            }
            else {
                number_list.compute(nota[i], (key, val)
                        -> val + 1);
            }
        }
        System.out.println(number_list);
    }
}
