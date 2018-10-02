package modulo4.abstractas;

public abstract class InstrumentoMusical {

    //Una clase normal no puede tener metodos abstractos

    private String tipoInstrumento;

    public String mostrarTipoInstrumento() {
        return tipoInstrumento;
    }


    public abstract void tocar();

}
