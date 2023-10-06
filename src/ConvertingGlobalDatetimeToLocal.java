import java.time.*;

public class ConvertingGlobalDatetimeToLocal {

    public static void main(String[] args) {
        // converter data-hora global para local
        LocalDate d01 = LocalDate.parse("2023-10-04");
        LocalDateTime d02 = LocalDateTime.parse("2023-10-04T01:30:26");

        // convertendo um Instant para uma data local considerando o horário do meu computador
        Instant d03 = Instant.parse("2023-10-04T01:30:26Z");
        LocalDate r1 = d03.atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("r1 = " + r1);

        LocalDate r2 = d03.atZone(ZoneId.of("America/Cuiaba")).toLocalDate();
        System.out.println("r2 = " + r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        System.out.println("r3 = " + r3);
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("America/Cuiaba"));
        System.out.println("r4 = " + r4);

        // obter dados de uma data-hora local
        System.out.println("d01 dia = " + d01.getDayOfMonth());
        System.out.println("d01 mês = " + d01.getMonthValue());
        System.out.println("d01 ano = " + d01.getYear());

        System.out.println("d02 ano = " + d02.getYear());
        System.out.println("d02 hora = " + d02.getHour());
        System.out.println("d02 segundo = " + d02.getSecond());
        System.out.println("d02 cronologia = " + d02.getChronology());

    }




}
