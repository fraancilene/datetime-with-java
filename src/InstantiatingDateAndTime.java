import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstantiatingDateAndTime {
    public static void main(String[] args) {
        // instanciando data a partir do agora

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();


        // formatando data-hora em texto ISO 8601
        LocalDate d04 = LocalDate.parse("2023-10-04");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-04T01:30:26");
        Instant d06 = Instant.parse("2023-10-04T01:30:26Z");

        // texto no formato customizado com o DateTimeFormatter
        LocalDate d07 = LocalDate.parse("04/10/2023", fmt1);
        LocalDateTime d08 = LocalDateTime.parse("20/07/2023 01:30", fmt2);

        // instanciando data a partir de dados isolados
        LocalDate d09 = LocalDate.of(2023, 7, 20);
        LocalDateTime d10 = LocalDateTime.of(2023, 7, 20, 05, 25);



        System.out.println("d01 - LocalDate = " + d01);
        System.out.println("d02 - LocalDateTime = " + d02);
        System.out.println("d03 - Instant (padrão GMT) = " + d03);
        System.out.println("d04 - texto ISO 8601 LocalDate = " + d04);
        System.out.println("d05 - texto ISO 8601 LocalDateTime = " + d05);
        System.out.println("d06 - texto ISO 8601 Instant = " + d06);

        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);

        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);



    }
}