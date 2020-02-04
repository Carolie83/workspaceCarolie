package curso.modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NumeroMultiplicar {
private int numero;

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

@Override
public String toString() {
	return "NumeroMultiplicar [numero=" + numero + "]";
}

}
