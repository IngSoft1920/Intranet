package jovace.mytube.srvusuarios.controller;

import org.springframework.stereotype.Component;

@Component
public class IdentityBean {
	private int nombre;

	public IdentityBean() {
		nombre=this.hashCode();
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	
}
