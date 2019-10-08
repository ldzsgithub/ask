package com.jy23.mapper;

import java.util.List;

import com.jy23.entity.HomePageP2;

public interface HomePageMapper {

	int countByProbeType(int probeType);

	List<String> selectDeptName();

	int countAlarmProbe();

	int countTolalProbe();

	List<HomePageP2> selectDeptData();

	int selectTrouble(int sDay);

}