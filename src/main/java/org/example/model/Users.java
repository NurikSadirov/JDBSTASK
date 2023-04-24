package org.example.model;


import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private Long id;
    private String fistName;
    private String lastName;
    private byte age;
}
