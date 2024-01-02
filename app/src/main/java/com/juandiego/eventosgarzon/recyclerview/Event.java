package com.juandiego.eventosgarzon.recyclerview;

public class Event {

    private String titulo;
    private String descripcion;
    private String lugar;
    private String fecha;
    private String hora;

    public Event(){}


     public Event(String titulo, String descripcion, String lugar,String fecha, String hora ) {
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.lugar = lugar;
            this.fecha = fecha;
            this.hora = hora;

        }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


   public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    };

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}






