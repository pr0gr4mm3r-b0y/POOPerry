package PooPerry;

public class Ornitorrinco extends Mamifero implements Oviparo, Anfibio, Venenoso{
    private String nombre, color;
    private int huevos;

    public Ornitorrinco(){
        
    }

    public Ornitorrinco(String nombre, String color, int huevos) {
        this.nombre = nombre;
        this.color = color;
        this.huevos = huevos;
    }

    public void presentarse(){
        System.out.println("Mi nombre es "+nombre+" y soy de color "+color);
    }

    @Override
    public void amamantar(){
        System.out.println("Amamantando a mi cria...");
    }
    
    @Override
    public void ponerHuevos(){
        System.out.println("Puse " + huevos + " huevos.");
    }

    @Override
    public void respirarBranqueal(){
        System.out.println("Respirando bajo el agua...");
    }

    @Override
    public void respirarPulmonar(){
        System.out.println("Respirando en tierra...");
    }

    @Override
    public void envenenar(){
        System.out.println("Envenenando mi presa...");
    }
    
}