package com.gazu.springapiresttest.repositories;

import com.gazu.springapiresttest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRespository extends JpaRepository<Category, Long> {


}
