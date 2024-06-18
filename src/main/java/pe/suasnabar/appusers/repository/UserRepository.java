package pe.suasnabar.appusers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.suasnabar.appusers.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
