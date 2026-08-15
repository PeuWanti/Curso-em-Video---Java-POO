public class Consulta implements sobreConsulta {
    private String data;
    private String horario;
    private boolean confirmada;
    private Paciente paciente;
    private Medico medico;

    public Consulta(String data, String horario, Paciente paciente, Medico medico) {
        this.data = data;
        this.horario = horario;
        this.paciente = paciente;
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public void confirmarConsulta() {
        setConfirmada(true);
    }

    @Override
    public void cancelarConsulta() {
        setConfirmada(false);
    }

    @Override
    public void remarcarConsulta(String novaData, String novoHorario) {
        setData(novaData);
        setHorario(novoHorario);

        System.out.printf("Consulta remarcada para o dia %s às %s horas",getData(),getHorario());
    }

    @Override
    public void informacoesConsulta() {
        String Sintoma = paciente.getProblema();
        System.out.println("Informações da consulta:");
        System.out.println("Data: " + getData());
        System.out.println("Horario: " + getHorario());
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Medico: " + medico.getNome());
        System.out.println("Sintoma: " + Sintoma);

    }
}
