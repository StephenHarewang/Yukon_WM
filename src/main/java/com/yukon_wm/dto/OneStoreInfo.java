package com.yukon_wm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OneStoreInfo {
    private String sid;
    private String name;
    private String imageUrl;
    private String introduce;
    private ArrayList<good> goods;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public static class good{
        private String imageUrl;
        private Double price;
        private String name;
        private String pointA;
        private String pointB;
    }
}
