package com.amgems.complementarymaterial.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface iGenericRepository<T, ID> extends JpaRepository<T, ID> {
    default public T findByIdOrThrow(ID id) throws Exception {
        return findById(id).orElseThrow(() -> new Exception(getClassName() + " not found"));
    }

    private String getClassName() {
        return this.getClass()
                .getGenericInterfaces()[0]
                .getTypeName()
                .replace("com.amgems.complementarymaterial.Repository.iGenericRepository<", "")
                .replace(">", "");
    }
}
