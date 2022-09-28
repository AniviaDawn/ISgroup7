package com.group7.isgroup7.repository;

import com.group7.isgroup7.pojo.FileDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileRepository extends JpaRepository<FileDetails, Integer> {

}
