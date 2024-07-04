package lk.ijse.ticket_service.repository;

import lk.ijse.ticket_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
