package com.douzone.server.dto.vehicle.impl;

import com.douzone.server.dto.vehicle.jpainterface.IVehicleEmpResDTO;
import com.douzone.server.entity.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VehicleEmpResDTO implements IVehicleEmpResDTO {
	private Long id;
	private LocalDateTime startedAt;
	private LocalDateTime endedAt;
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	private String reason;
	private String title;
	private Vehicle vehicle;
	private String vehicleImg;
}
