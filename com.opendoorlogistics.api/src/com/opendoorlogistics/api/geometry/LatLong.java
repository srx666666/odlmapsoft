/*******************************************************************************
 * Copyright (c) 2014 Open Door Logistics (www.opendoorlogistics.com)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at http://www.gnu.org/licenses/lgpl.txt
 ******************************************************************************/
package com.opendoorlogistics.api.geometry;

/**
 * Read-only interface for a lat-long
 * @author Phil
 *
 */
public interface LatLong {
	double getLatitude();
	double getLongitude();
	
	default boolean isValid(){
		return getLongitude()>= -180.0 && getLongitude() <= 180.0 && getLatitude() >= -90.0 && getLatitude() <=90.0;
	}
	
}
