package HrmsProject.Hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="experiences")
public class Experience {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="workplace_name")
	private String workplaceName;
	
	@Column(name="position")
	private String position;
	
	@Column(name="still_work")
	private Boolean stillWork;
	
	@Column(name="start_of_work")
	private Date startOfWork;
	
	@Column(name="finish_of_work")
	private Date finishOfWork;
	
	

}
