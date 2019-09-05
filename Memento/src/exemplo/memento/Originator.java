
package exemplo.memento;

/**
 *
 * @author camila
 */
public class Originator {
    private String estado;
    
    public Memento criarMemento(){
        return new Memento(estado);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Memento SalvarEstadoMemento(){
        return new Memento (estado);
    }
    public void getEstadoSalvo(Memento UltimoEstado){
        estado = UltimoEstado.getEstado();
    }
}
