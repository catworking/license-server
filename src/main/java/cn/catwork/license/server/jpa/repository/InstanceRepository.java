package cn.catwork.license.server.jpa.repository;

import cn.catwork.license.server.jpa.entity.Instance;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by figo-007 on 2017/3/20.
 */
@RepositoryRestResource(path="instance")
public interface InstanceRepository extends JpaRepository<Instance, Long> {
}
