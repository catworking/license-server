package cn.catwork.license.server.jpa.repository;

import cn.catwork.license.server.jpa.entity.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by figo-007 on 2017/3/20.
 */
@RepositoryRestResource(path="license")
public interface LicenseRepository extends JpaRepository<License, Long> {
}
