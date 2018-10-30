package fileOperation.reading;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderMain {
    public static void main (String[] args) throws IOException {
        String path = "D:\\kodilla-course\\own-projects\\src\\main\\resources\\plik.txt";
        BufferedReader fileReader = null;
        int count;

        try {
            fileReader = new BufferedReader(new FileReader(path));
            List<String> wordList = fileReader.lines()
                    //    .map(line -> line.split(";"))
                    .collect(Collectors.toList());

            List<Client> clientList = new ArrayList<>();

            for(int i=0; i<wordList.size(); i++) {

                StringTokenizer stringTokenizer = new StringTokenizer(wordList.get(i), ";");
                count = 0;
                int clientId = 0;
                String forName = null;
                String name = null;
                int phone = 0;
                String city = null;

                while (stringTokenizer.hasMoreTokens()) {

                    if (count == 0) {
                        clientId = Integer.parseInt(stringTokenizer.nextToken());
                    }
                    if (count == 1) {
                        forName = stringTokenizer.nextToken().toUpperCase();
                    }
                    if (count == 2) {
                        name = stringTokenizer.nextToken().toUpperCase();
                    }
                    if (count == 3) {
                        phone = Integer.parseInt(stringTokenizer.nextToken());
                    }
                    if (count == 4) {
                        city = stringTokenizer.nextToken().toUpperCase();
                    }

                    count++;
                }
                clientList.add(new Client(clientId, forName, name, phone, city));
                System.out.println("Dodałem nowego klienta do listy -> " + clientList.get(i).toString());
            }
            System.out.println("Obecnie posiadasz następującą liczbę klientów -> " + clientList.size());

        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
