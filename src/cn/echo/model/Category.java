package cn.echo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table
@SequenceGenerator(name="ID_SEQ", sequenceName="SEQ_CATEGORY", allocationSize=1)
public class Category implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="ID_SEQ")
	@Column(name="ID")
	private long id;
	
	@Column(name="name", length=10, nullable=false)
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
