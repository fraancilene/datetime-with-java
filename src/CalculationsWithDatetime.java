import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculationsWithDatetime {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2023-10-04");
        LocalDateTime d02 = LocalDateTime.parse("2023-10-25T01:30:26");
        Instant d03 = Instant.parse("2023-10-12T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        System.out.println("Semana passada LocalDate = " + pastWeekLocalDate);
        System.out.println("Próxima semana = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
        System.out.println("Semana passada LocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("Próxima semana LocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
        System.out.println("Semana passada Instant = " + pastWeekLocalDateTime);
        System.out.println("Próxima semana Instant = " + nextWeekLocalDateTime);

        // duração entre horas
        Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atTime(0,0) );
        Duration t3 = Duration.between(pastWeekInstant, d03);
        Duration t4 = Duration.between(d03, pastWeekInstant);


        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());



    }
}
