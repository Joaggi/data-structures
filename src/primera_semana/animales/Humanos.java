package primera_semana.animales;

public class Humanos extends Viviparos implements Mamifero{

    protected boolean bilingue;
    int numeroDeIdiomas;

    @Override
    public boolean esViviparo() {
        return false;
    }

    public String hablar(){
        return "Hola";
    }

    public void setNumeroDeIdiomas(boolean biligue){
        this.bilingue = biligue;
        if(biligue == true){
            numeroDeIdiomas = 2;
        }
        else{
            numeroDeIdiomas = 1;
        }
    }

    public void setNumeroDeIdiomas(int numeroDeIdiomas){
        if(numeroDeIdiomas>1){
            this.bilingue = true;
            this.numeroDeIdiomas = numeroDeIdiomas;
        }
        else{
            this.bilingue = false;
            this.numeroDeIdiomas = numeroDeIdiomas;
        }
    }

}
