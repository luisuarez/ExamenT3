package pe.edu.upn.T3.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "platos")
public class Plato {

	@Id
	@Column(name = "codigo_pla")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name = "nombre_pla", length = 20, nullable = false)
	private String nombre;
	
	@Column(name = "descripcion", length = 20, nullable = false)
	private String descripcion;
	
	@Column(name = "precio",length = 20, nullable = false)
	private Float precio;
	
	@OneToMany(mappedBy = "plato", fetch = FetchType.LAZY)
	private List<DetallePedido> detalles;
	
	public Plato() {
		detalles = new ArrayList<>();
	}
	public void addDetalle(DetallePedido detalle) {
		detalle.setPlato(this);
		this.detalles.add(detalle);
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public List<DetallePedido> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<DetallePedido> detalles) {
		this.detalles = detalles;
	}
	
	
}
