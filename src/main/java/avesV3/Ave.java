package avesV3;

import avesV3.TipoSonido;
import avesV3.TipoVuelo;

public abstract class Ave {
    private TipoSonido tipoSonido;
    private TipoVuelo tipoVuelo;
    //metodos de una ave

    public void setTipoSonido(TipoSonido tipoSonido) {
        this.tipoSonido = tipoSonido;
    }
    public void setTipoVuelo(TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }
    public void realizarSonido() {
        tipoSonido.makeSound();
    }
    public void realizarVuelo() {
        tipoVuelo.vuelo();
    }
}
