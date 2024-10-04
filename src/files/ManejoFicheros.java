/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package files;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author ucr
 */
public class ManejoFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File file = new File("PUGOLFITO.txt");
        if (file.exists()) {
            Voter[] voters = readFile(file);
            System.out.println("Cantidad de Votantes: " + voters.length);
            String apellido = "Perez";
//            ArrayList finds = search(voters, apellido);
//            if (!finds.isEmpty()) {
//                System.out.println("Cantidad de "+apellido +" "+finds.size());
//                for (int i = 0; i < finds.size(); i++) {
//                    System.out.println(((Voter) finds.get(i)).getFullName());
//                }
//            }

            HashSet find = catalogar(voters, apellido);

            List<Voter> list = new ArrayList<>(find);

            Collections.sort(list);

            if (!list.isEmpty()) {
                System.out.println("Cantidad de apellido  " + list.size());
                for (int i = 0; i < list.size(); i++) {
                    String apellido1 = String.valueOf(list.get(i));
                    ArrayList finds = search(voters, apellido1);
                    if (finds.size() > 1000) {
                        System.out.println("apellido1 = " + apellido1);
                        System.out.println(list.get(i) + " : " + finds.size());
                    }

                }
            }

        }
    }

    public static Voter[] readFile(File file) throws IOException {
        Voter[] data = new Voter[25488];
        try (
                BufferedReader br = new BufferedReader(new FileReader(file.getPath()))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String dataVoter[] = line.split(",");
                Voter voter = new Voter(
                        dataVoter[0].toUpperCase().trim(),
                        dataVoter[1].toUpperCase().trim(),
                        dataVoter[2].toUpperCase().trim(),
                        dataVoter[3].toUpperCase().trim(),
                        dataVoter[4].toUpperCase().trim(),
                        dataVoter[5].toUpperCase().trim(),
                        dataVoter[6].toUpperCase().trim(),
                        dataVoter[7].toUpperCase().trim()
                );
                data[i] = voter;
                i++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private static ArrayList search(Voter[] voters, String apellido) {
        ArrayList data = new ArrayList();

        for (int i = 0; i < voters.length; i++) {
            if (voters[i].getSegundoApellido().equals(apellido.toUpperCase())
                    || voters[i].getPrimerApellido().equals(apellido.toUpperCase())) {
                data.add(voters[i]);
            }
        }
        return data;

    }

    private static HashSet catalogar(Voter[] voters, String apellido) {

        HashSet hs = new HashSet();
        for (Voter voter : voters) {
            hs.add(voter.getPrimerApellido());
        }
        return hs;

    }
}

