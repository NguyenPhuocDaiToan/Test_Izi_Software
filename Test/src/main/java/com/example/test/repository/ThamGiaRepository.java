package com.example.test.repository;

import com.example.test.model.ThamGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ThamGiaRepository extends JpaRepository<ThamGia, String> {
    @Query(value = "delete from thamgia where MaHD = ?1", nativeQuery = true)
    @Transactional
    @Modifying
    void deleteByMaHD(String MaHD);
}
