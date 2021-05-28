package com.alinaneacsu.ecommercetshirtstore.tshirt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TshirtRepository extends JpaRepository<Tshirt, Long> {

}
