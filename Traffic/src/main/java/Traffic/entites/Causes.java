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
@Table(name="T_causes")
public class Causes implements Serializable{
	public Causes()
	{
	
	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CAUSES_ID")
	private int id ;
	@Column(name="CAUSE")
	private String cause ;
	@Column(name="C_ACCIDENTS")
	private String accidents;
	@Column(name="C_TUES")
	private String tues;
	@Column(name="C_BLESSES")
	private String blesses;
}
