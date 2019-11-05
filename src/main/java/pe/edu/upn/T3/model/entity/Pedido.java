package pe.edu.upn.T3.model.entity;





import java.util.ArrayList;
import java.util.Date;
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
@Table(name = "pedidos")
public class Pedido {

	@Id
	@Column(name = "codigo_ped")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name = "precio_total")
	private Float precioTotal;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "estado")
	private String estado;
	
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)
	private List<DetallePedido> detalles;
	
	public Pedido() {
		detalles = new ArrayList<>();
	}
	public void addDetalle(DetallePedido detalle) {
		detalle.setPedido(this);
		this.detalles.add(detalle);
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Float getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Float precioTotal) {
		this.precioTotal = precioTotal;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public List<DetallePedido> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<DetallePedido> detalles) {
		this.detalles = detalles;
	}
	
	
}
