package in.bank.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bank.insurance.model.Insurance;

@Repository
public interface InsuranceRepository extends CrudRepository<Insurance, Long> {

	Insurance findByCustomerId(int customerID);
	
}
