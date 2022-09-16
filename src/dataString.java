import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class dataString {

    public static void main(String[] args) {
        String nome = "Joseana";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.length());

        String nomeOutro = "joseana";
        System.out.println(nome.equalsIgnoreCase(nomeOutro));

        //Quero escrever "Olá, nome. Hoje é dia-da-semana. Bom DIA

        //ISO 8601 - padrão de datas do java
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        //Locale brasil = new Locale("pt", "BR"); o language e o country é o intelliJ que adiciona

        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil ));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour()>=0 && agora.getHour()<12){
            saudacao = "bom dia";
        } else if (agora.getHour()>=12 && agora.getHour() <18) {
            saudacao = "boa tarde";
        }else if(agora.getHour() >=18 && agora.getHour()<24){
            saudacao="boa noite";
        }else{
            saudacao= "Olá";
        }
        //%s avisa que vai declarar uma string e %n é uma quebra de linha
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

    }
}
