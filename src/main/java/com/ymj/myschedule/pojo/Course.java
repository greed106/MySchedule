package com.ymj.myschedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String courseName;
    private Integer courseId;
    private String courseLocation;
    private Integer teacherId;
    private Integer courseLength;
    private String courseTime;
}
