package dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadFile {

    public void Resposta() {

        try {
            FileReader reader = new FileReader("./number.txt");
            BufferedReader buffe = new BufferedReader(reader);
            ArrayList listNumber = new ArrayList();

            String line;

            while ((line = buffe.readLine()) != null) {
                System.out.println("------------- Antes -------------");
                System.out.println(line);
                String number[] = line.split(","); // Lẽ um número a cada vírgular

                for (int i = 0; i < number.length; i++) {
                    listNumber.add(Integer.valueOf(number[i])); // Transformar String em Integer e colocar no vetor
                }
            }

            Collections.sort(listNumber); // Ordena o vetor

            System.out.println("------------- Depois -------------");
            for (Object counter : listNumber) {
                System.out.print(counter + ",");
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
