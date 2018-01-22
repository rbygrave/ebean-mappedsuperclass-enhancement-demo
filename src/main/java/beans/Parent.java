package beans;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Parent {

	@Column(name = "inheritedColumn")
	private String inheritedColumn;

	public String getInheritedColumn() {
		return inheritedColumn;
	}

	public void setInheritedColumn(String inheritedColumn) {
		this.inheritedColumn = inheritedColumn;
	}

}
