package com.mycompany.portalapi.dtos.attendanceDto;

import com.mycompany.portalapi.constants.AttendanceStatusName;
import lombok.Builder;

@Builder
public record MonthlyAttendance(
        Integer year,
        Integer month,
        Integer day,
        AttendanceStatusName attendanceStatusName,
        boolean isHoliday
) {
}
