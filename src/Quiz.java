/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ucr
 */
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {                              
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "1. ¿Qué es la complejidad temporal de un algoritmo?",
            "2. ¿Cuál es la complejidad temporal de un bucle que itera n veces?",
            "3. Si tienes un algoritmo con un bucle anidado que itera n veces, ¿cuál es su complejidad?",
            "4. ¿Qué representa O(log n) en términos de complejidad?",
            "5. Si un algoritmo tiene una complejidad de O(n^3) y n es 1000, ¿cuántas operaciones realizará?"
        };
        
        String[] answers = {
            "b", // Respuesta correcta: b
            "b", // Respuesta correcta: b
            "c", // Respuesta correcta: c
            "c", // Respuesta correcta: c
            "c"  // Respuesta correcta: c
        };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                score++;
            }
        }

        System.out.println("Tu puntuación es: " + score + "/" + questions.length);
        scanner.close();
    }
}
