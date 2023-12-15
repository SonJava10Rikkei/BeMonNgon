package com.gutrend.bemonngon.repository;

import com.gutrend.bemonngon.model.Role;
import com.gutrend.bemonngon.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}
