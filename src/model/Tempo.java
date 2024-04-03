package model;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tempo(){
        this(0, 0, 0);
    }

    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    public int getSegundos(){
        return(getHora()* 60 * 60 + getMinuto() * 60 + getSegundo());
    }
    
    public void incrementarSegundo(){
        if (getSegundo() + 1 == 60){
            setSegundo(0);
            incrementarMinuto();
        }else{
            setSegundo(getSegundo() + 1);
        }
    }

    public void incrementarMinuto(){
        if (getMinuto() + 1 == 60){
            setMinuto(0);
            incrementarHora();
        }else{
            setMinuto(getMinuto() + 1);
        }
    }
    
    public void incrementarHora(){
        if (getHora() + 1 == 24){
            setHora(0);
        }else{
            setHora(getHora() + 1);
        }
    }

    public void decrementarSegundo(){
        if (getSegundo() - 1 == -1){
            setSegundo(0);
            decrementarMinuto();
        }else{
            setSegundo(getSegundo() - 1);
        }
    }

    public void decrementarMinuto(){
        if (getMinuto() - 1 == -1) {
            setMinuto(0);
            decrementarHora();            
        }else{
            setMinuto(getMinuto() - 1);
        }
    }

    public void decrementarHora(){
        if (getHora() - 1 == -1) {
            setHora(23);
        }else{
            setHora(getHora() - 1);
        }
    }

    public String getTempo(){
        return(getHora() + ":" + getMinuto() + ":" + getSegundo());
    }
}