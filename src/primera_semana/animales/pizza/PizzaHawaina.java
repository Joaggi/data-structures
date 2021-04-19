package primera_semana.animales.pizza;

import java.util.ArrayList;

public class PizzaHawaina implements Pizza<Ingredientes>{
    private int tipoPizza;
    private int contadorGetter=0;
    private int contadorSetter=0;

    @Override
    public ArrayList<String> hacerPizza() {
        ArrayList<String> ingredientes = new ArrayList<>();
        ingredientes.add("peperonni");
        return ingredientes;
    }

    private void adicionarPeperonni(ArrayList<String> ingredientes){
        ingredientes.add("peperonni");
    }

    public int getTipoPizza() {
        this.contadorGetter++;
        return tipoPizza;
    }

    public void setTipoPizza(int tipoPizza) throws Exception {
        if(tipoPizza <4) {
            contadorSetter++;
            this.tipoPizza = tipoPizza;
        }
        else{
            throw new Exception("Mensje error");
        }



    }



}
