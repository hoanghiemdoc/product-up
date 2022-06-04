package com.fpt.t2010aspring.entity;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String rollNumber;
    private String fullName;
    private String email;
    private String phone;
    private String address;
    private String note;
    private LocalDateTime dob;
    private int status;
}
