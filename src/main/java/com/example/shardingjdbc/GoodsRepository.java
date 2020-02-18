package com.example.shardingjdbc;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author navy
 * @version 1.0
 * @date 2020-02-16 22:00
 */
public interface GoodsRepository extends JpaRepository<Goods,Long> {

    List<Goods> findAllByGoodsIdBetween(Long goodsId1, Long goodsId2);

    List<Goods> findAllByGoodsIdIn(List<Long> goodsIds);
}
