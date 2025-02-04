package com.douzone.server.dto.vehicle.jpainterface;

import com.douzone.server.entity.Vehicle;

import java.time.LocalDateTime;

public interface IVehicleListResDTO {
	Long getId();

	LocalDateTime getStartedAt();

	LocalDateTime getEndedAt();

	LocalDateTime getCreatedAt();

	LocalDateTime getModifiedAt();

	String getReason();

	String getTitle();

	Vehicle getVehicle();

	String getVehicleImg();

	String getEmpNo();

	String getName();
}
