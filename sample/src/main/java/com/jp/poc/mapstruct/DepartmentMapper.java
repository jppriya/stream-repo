package com.jp.poc.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
	@Mapping(target = "deptCode", source = "department.deptId")
	DepartmentDTO departmentToDepartmentDTO(Department department);

	@Mapping(target = "deptId", source = "departmentDTO.deptCode")
	Department departmentDTOToDepartment(DepartmentDTO departmentDTO);
}
