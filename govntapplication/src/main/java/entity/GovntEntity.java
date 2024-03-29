package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Data 
@Entity
@Table(name="govnt_table")

@NamedQuery(name="readAll",query="SELECT entity from GovntEntity entity ")

public class GovntEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="contactNumber")
	private Long contactNumber;
	@Column(name="email")
	private String email;
	@Column(name="age")
	private int age;
	@Column(name="motherTounge")
	private String motherTounge;
	@Column(name="gender")
	private String gender;
	@Column(name="maritalStatus")
	private String maritalStatus;
	@Column(name="nationality")
	private String nationality;
	@Column(name="religion")
	private String religion;
	@Column(name="address")
	private String address;
	

}
