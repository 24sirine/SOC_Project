package Traffic.entites;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name="T_routes")
public class Routes implements Serializable{
	public Routes() {
	
	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ROUTE_ID")
	private int id ;
	@Column(name="ROUTE")
	private String route ;
	@Column(name="R_ACCIDENTS")
	private String accidents;
	@Column(name="R_TUES")
	private String tues;
	@Column(name="R_BLESSES")
	private String blesses;
}
