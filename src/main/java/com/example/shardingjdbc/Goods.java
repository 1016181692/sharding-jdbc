package com.example.shardingjdbc;

import com.sun.javafx.beans.IDProperty;
import jdk.nashorn.internal.ir.annotations.Immutable;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author navy
 * @version 1.0
 * @date 2020-02-16 21:58
 */
@Data
@Entity
@Table(name="goods")
public class Goods {

    @Id
    private Long goodsId;

    private String goodsName;

    private Long goodsType;
}
