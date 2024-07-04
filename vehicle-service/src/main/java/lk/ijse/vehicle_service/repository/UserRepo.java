package lk.ijse.vehicle_service.repository;

import lk.ijse.vehicle_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}

