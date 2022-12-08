package kodlama.io.Kodlama.ioDevsSpring.entities.concrates;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "language")
@Data
// getter setter 
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "language", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<SubTechnology> subTechnologys;

}
