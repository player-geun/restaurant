package com.example.restaurant.entity;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WishListEntity extends MemoryDbEntity {

    private String title;

    private String category;

    private String address;

    private String roadAddress;

    private String homePageLink;

    private String imageLink;

    private boolean isVisit;

    private int visitCount;

    private LocalDateTime lastVisitDate;
}
