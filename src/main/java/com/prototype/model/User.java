package com.prototype.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class User {
    private String name;
    private String id;
    private int age;
    private String email;
}
