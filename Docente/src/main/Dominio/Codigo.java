package ISO2_2023_B01.Servidor;

public class Codigo {
String id;
int codigo;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public Codigo(String id, int codigo) {
	super();
	this.id = id;
	this.codigo = codigo;
}
}
