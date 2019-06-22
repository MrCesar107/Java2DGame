package principal.graficos;

import java.awt.Canvas;
import java.awt.Dimension;

import principal.control.Teclado;

public class SuperficieDibujo extends Canvas {
	private static final long serialVersionUID = -6227038142688953660L;
	
	private int ancho;
	private int alto;
	
	private Teclado teclado;
	
	public SuperficieDibujo(final int ancho, final int alto) {
		this.ancho = ancho;
		this.alto = alto;
		
		teclado = new Teclado();
		
		setIgnoreRepaint(true);
		setPreferredSize(new Dimension(ancho, alto));
		addKeyListener(teclado);
		setFocusable(true);
		requestFocus();
	}
}
