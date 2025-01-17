package io.seata.product.entity;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Product {
    private Long id;

    private String productName;

    private Integer stock;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
