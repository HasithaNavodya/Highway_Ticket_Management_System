package lk.ijse.ticket_service.repository;

import lk.ijse.ticket_service.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
