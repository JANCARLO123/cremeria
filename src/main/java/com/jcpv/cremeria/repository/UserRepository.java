package com.jcpv.cremeria.repository;

import com.jcpv.cremeria.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jancarlo on 14/02/18.
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

    public Users findByName(String name);
}
