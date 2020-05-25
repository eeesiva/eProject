package com.siva.eProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.siva.eProject.entity.Project;

@Repository
@RepositoryRestResource(collectionResourceRel="Project",path="project")
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
