package ISO2_2023_B01.it1;

public class Evento {
	private String id;
	private String nombre;
	private String fecha;
	private String hora;
	private String descripcion;
	private boolean isPresencial;
	private String tipoEvento;
	
	public Evento(String id, String nombre, String fecha, String hora, String descripcion, 
			boolean isPresencial, String tipoEvento) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
        this.isPresencial = isPresencial;
        this.tipoEvento = tipoEvento;
}
