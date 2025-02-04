package com.douzone.server.dto.vehicle.jpainterface;

import java.time.LocalDateTime;

public interface IVehicleWeekTimeDTO {
	Integer getHTime();

	Integer getHCount();

	Long getVId();

	LocalDateTime getStartedAt();

	LocalDateTime getEndedAt();

	LocalDateTime getReservationCreatedAt();

	LocalDateTime getReservationModifiedAt();

	String getReason();

	String getTitle();

	String getVehicleImg();

	String getModel();

	String getColor();

	String getVNumber();

	String getVName();

	Integer getCapacity();

	String getEmpNo();

	String getEName();
}
