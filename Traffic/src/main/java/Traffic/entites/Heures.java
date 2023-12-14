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
@Table(name="T_heures")
public class Heures implements Serializable{
	public Heures() {
		
	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="HEURES_ID")
	private int id ;
	@Column(name="HEURE")
	private String heure ;
	@Column(name="H_ACCIDENTS")
	private String accidents;
	@Column(name="H_TUES")
	private String tues;
	@Column(name="H_BLESSES")
	private String blesses;
}
