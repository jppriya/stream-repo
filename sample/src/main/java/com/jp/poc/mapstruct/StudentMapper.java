package com.jp.poc.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @author jayapriya.r
 *
 */
@Mapper(componentModel = "spring", uses = { DepartmentMapper.class })
public interface StudentMapper {
	
	/**
	 * Configures mapping for the bean attributes. Student bean has attribute called "name", StudentDTO bean has attribute called "studentName"
	 * Mapstruct will transform studentName to name. @Mapping will do that.
	 * To transform Bean into another bean we should create seperate mapper for that attribute
	 * @param studentDTO
	 * @return
	 */
	@Mappings({ @Mapping(target = "name", source = "studentDTO.studentName"),
			@Mapping(target = "dob", source = "studentDTO.dob", dateFormat = "dd-MM-yyyy HH:mm:ss"),
			@Mapping(target = "department", source = "studentDTO.dept")})
	Student studentDTOtoStudent(StudentDTO studentDTO);

	/**
	 * @param student
	 * @return
	 */
	@Mappings({ @Mapping(target = "studentName", source = "student.name"),
			@Mapping(target = "dob", source = "student.dob", dateFormat = "dd-MM-yyyy HH:mm:ss"),
			@Mapping(target = "dept", source = "student.department")})
	StudentDTO studentToStudentDTO(Student student);
}
