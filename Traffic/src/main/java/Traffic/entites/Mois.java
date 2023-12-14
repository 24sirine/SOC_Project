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
@Table(name="T_mois")
public class Mois implements Serializable{
	public Mois()
	{
	
	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="MOIS_ID")
	private int id ;
	@Column(name="MOISS")
	private String moiss ;
	@Column(name="M_ACCIDENTS")
	private String accidents;
	@Column(name="M_TUES")
	private String tues;
	@Column(name="M_BLESSES")
	private String blesses;
}
