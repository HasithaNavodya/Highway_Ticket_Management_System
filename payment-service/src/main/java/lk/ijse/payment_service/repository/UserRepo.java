package lk.ijse.payment_service.repository;

import lk.ijse.payment_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}

