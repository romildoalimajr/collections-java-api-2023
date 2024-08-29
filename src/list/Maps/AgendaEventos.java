package list.Maps;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributos
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
    /*/    Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();*/
        //eventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();

                System.out.println("O próximo evento.: " + 
                proximoEvento + " acontecerá na data " + 
                proximaData + ".\n");
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 15 ), "Evento 01", "Atração 01");;
        agendaEventos.adicionarEvento(LocalDate.of(2022, 10, 28 ), "Evento 02", "Atração 02");;
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10 ), "Evento 03", "Atração 03");;
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 25 ), "Evento 04", "Atração 04");;
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 31 ), "Evento 05", "Atração 05");;
        System.out.println();


        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

        

    }
}
