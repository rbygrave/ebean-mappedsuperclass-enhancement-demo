package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ImaginaryTable", schema = "imaginary_schema")
public class Child extends Parent {

	@Id
	@Column(name = "id")
	private Integer id;

}
