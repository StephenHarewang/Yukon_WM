package com.yukon_wm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserAllOrder {

    private Double money;
    private String oid;
    private String tips;
    private String state;
    private String imageUrl;
    private String storeName;
}
