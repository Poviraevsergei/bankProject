package by.park.repository;

import by.park.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
public interface TransactionRepository extends JpaRepository<Transaction, Long>, CrudRepository<Transaction, Long>, PagingAndSortingRepository<Transaction, Long> {
    @Modifying
    @Query("delete from Transaction t where t.id=:id")
    void deleteTransactionById(@Param("id") Long id);
}