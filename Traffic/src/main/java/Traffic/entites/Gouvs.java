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
@Table(name="T_gouvs")
public class Gouvs implements Serializable{
	public Gouvs() {
		
	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="GOUVS_ID")
	private int id ;
	@Column(name="GOUV")
	private String gouv ;
	@Column(name="G_ACCIDENTS")
	private String accidents;
	@Column(name="G_TUES")
	private String tues;
	@Column(name="G_BLESSES")
	private String blesses;

}
