public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Jáber", 58,"(71) 98841-2763","Gripe");
        Medico medico = new Medico("Pedro W", "554-227","Geriatra");
        Consulta consulta = new Consulta("25/08","15:00" , paciente, medico);
        consulta.informacoesConsulta();
    }
}
