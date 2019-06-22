package principal.maquinaestado;

import java.awt.Graphics2D;

import principal.maquinaestado.estados.juego.GestorJuego;

public class GestorEstados {
	private EstadoJuego[] estados;
	private EstadoJuego estadoActual;
	
	public GestorEstados() {
		iniciarEstados();
		iniciarEstadoActual();
	}

	private void iniciarEstados() {
		// Ir aumentando el array conforme se agregan nuevos estados
		estados = new EstadoJuego[1];
		estados[0] = new GestorJuego();
	}
	
	private void iniciarEstadoActual() {
		estadoActual = estados[0];
	}
	
	public void actualizar() {
		estadoActual.actualizar();
	}
	
	public void dibujar(Graphics2D g) {
		estadoActual.dibujar(g);
	}
	
	public void cambiarEstadoActual(final int nuevoEstado) {
		estadoActual = estados[nuevoEstado];
	}
	
	public EstadoJuego getEstadoActual() {
		return estadoActual;
	}
}
