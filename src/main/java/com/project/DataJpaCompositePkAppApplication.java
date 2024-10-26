package com.project;

import com.project.entity.Account;
import com.project.entity.AccountPK;
import com.project.repository.AccountRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class DataJpaCompositePkAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
				SpringApplication.run(DataJpaCompositePkAppApplication.class, args);

		AccountRepository accountRepo = context.getBean(AccountRepository.class);

		/*
		// Setting composite key
		AccountPK pk = new AccountPK();
		pk.setAccNum(149042412481L);
		pk.setAccType("Saving");

		// setting entity data
		Account acc = new Account();
		acc.setHolderName("Mike");
		acc.setBranch("BTM Layout");
		acc.setAccountPK(pk);

		accountRepo.save(acc);// saving the entity object
		System.out.println("Record is saved");

		 */

		AccountPK pk = new AccountPK();
		pk.setAccNum(149042412481L);
		pk.setAccType("Saving");

		Optional<Account> byId = accountRepo.findById(pk);
		if(byId.isPresent()){
			System.out.println(byId.get());
		}
	}

}
