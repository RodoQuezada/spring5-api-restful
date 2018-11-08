package com.gazu.springapiresttest.bootstrap;

import com.gazu.springapiresttest.domain.Category;
import com.gazu.springapiresttest.repositories.CategoryRespository;
import org.springframework.boot.CommandLineRunner;

public class Bootstrap implements CommandLineRunner {


    private CategoryRespository categoryRespository;

    public Bootstrap(CategoryRespository categoryRespository) {
        this.categoryRespository = categoryRespository;
    }


    @Override
    public void run(String... args) throws Exception {

        Category fruits = new Category();
        


    }
}
