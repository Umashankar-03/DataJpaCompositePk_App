package com.project.repository;

import com.project.entity.Account;
import com.project.entity.AccountPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account , AccountPK> {
}
