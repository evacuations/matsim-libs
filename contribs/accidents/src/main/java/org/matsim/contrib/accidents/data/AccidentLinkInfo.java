/* *********************************************************************** *
 * project: org.matsim.*
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2017 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */

package org.matsim.contrib.accidents.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.network.Link;
import org.matsim.contrib.accidents.computation.AccidentsComputationMethod;

/**
* @author ikaddoura, mmayobre
*/

public class AccidentLinkInfo {
	
	private final Id<Link> linkId;
	
	private ArrayList<Integer> roadTypeBVWP;	
	private AccidentsComputationMethod computationMethod;

	private final Map<Integer, TimeBinInfo> timeSpecificInfo = new HashMap<>();
	
	public AccidentLinkInfo(Id<Link> linkId) {
		this.linkId = linkId;
	}
	
	public Id<Link> getLinkId() {
		return linkId;
	}

	public ArrayList<Integer> getRoadTypeBVWP() {
		return roadTypeBVWP;
	}

	public void setRoadTypeBVWP(ArrayList<Integer> roadType) {
		this.roadTypeBVWP = roadType;
	}

	public Map<Integer, TimeBinInfo> getTimeSpecificInfo() {
		return timeSpecificInfo;
	}

	public AccidentsComputationMethod getComputationMethod() {
		return computationMethod;
	}

	public void setComputationMethod(AccidentsComputationMethod computationMethod) {
		this.computationMethod = computationMethod;
	}

}

