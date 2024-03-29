package com.mycompany.portalapi.models.faculty;


import com.mycompany.portalapi.models.hrms.Teacher;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    @Id
    @SequenceGenerator(name = "subject_sequence", sequenceName = "subject_sequence", initialValue = 1)
    @GeneratedValue(generator = "subject_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Integer semester;
    @ManyToMany(mappedBy = "subjects")
    private Set<Department> departments = new HashSet<>();
    @ManyToMany
    @JoinTable(name = "teacher_subject",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private Set<Teacher> teachers = new HashSet<>();
    private Integer credit;
}
