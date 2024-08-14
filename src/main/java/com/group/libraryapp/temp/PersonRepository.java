package com.group.libraryapp.temp;

import com.group.libraryapp.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Address, Long> {
}
