package lk.ijse.payment_service.repository;

import lk.ijse.payment_service.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

}

