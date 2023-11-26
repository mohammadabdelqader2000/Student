package com.student.student.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table(name="student")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;


    private String firstName;


    private String lastName;







}
