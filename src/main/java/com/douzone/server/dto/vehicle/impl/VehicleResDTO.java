package com.douzone.server.dto.vehicle.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VehicleResDTO {
	private Long id;
	private String name;
	private String number;
	private String model;
	private String color;
	private int capacity;
	private String vehicleImg;
}
