package com.loginregister.SpringBootQuoraLoginRegisterApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.loginregister.SpringBootQuoraLoginRegisterApp.entity.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long>{

	@Query("from UserModel where name=:name and password=:password")
	public UserModel searchByNameAndPassword(String name, String password);

}
