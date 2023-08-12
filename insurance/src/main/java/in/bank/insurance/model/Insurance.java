package in.bank.insurance.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//(AUTO_INCRMENT PRIMARY_KEY)
	@Column(name = "insurance_number")
	private int insuranceNumber; 
	
	@Column(name = "customer_id")
	private int customerId;

	 @Column(name = "insurance_type")
	private String insuranceType;
	
	@Column(name = "insurance_amount ")
	private int insuranceAmt;
	
	@Column(name = "loan_end_date ")
	private LocalDate loanEndDate;

}
