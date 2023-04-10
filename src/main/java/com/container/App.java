package com.container;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre uma mensagem: ");
        String message = scanner.nextLine();

        System.out.println("Escolha um formato:");
        System.out.println("1. Mensagem in uppercase");
        System.out.println("2. Mensagem in lowercase");
        System.out.println("3. Date time + Mensagem");
        System.out.println("4. Mensagem de trás pra frente");
        System.out.print("Digite o numero do formato: ");
        int formatNumber = scanner.nextInt();
        scanner.close();

        FormatStrategy strategy = null;
        switch (formatNumber) {
            case 1:
                strategy = new UppercaseFormatStrategy();
                break;
            case 2:
                strategy = new LowercaseFormatStrategy();
                break;
            case 3:
                strategy = new DateTimeFormatStrategy();
                break;
            case 4:
                strategy = new ReverseFormatStrategy();
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(1);
        }

        String formattedMessage = strategy.format(message);
        System.out.println(formattedMessage);
        
    }

    interface FormatStrategy {
        String format(String message);
    }

    static class UppercaseFormatStrategy implements FormatStrategy {
        @Override
        public String format(String message) {
            return message.toUpperCase();
        }
    }

    static class LowercaseFormatStrategy implements FormatStrategy {
        @Override
        public String format(String message) {
            return message.toLowerCase();
        }
    }

    static class DateTimeFormatStrategy implements FormatStrategy {
        @Override
        public String format(String message) {
            LocalDateTime now = LocalDateTime.now();
            String dateTime = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return dateTime + " " + message;
        }
    }

    static class ReverseFormatStrategy implements FormatStrategy {
        @Override
        public String format(String message) {
            return new StringBuilder(message).reverse().toString();
        }
    }
}