/**********************************************
 * Copyright (C) 2010 Lukas Laag
 * This file is part of lib-gwt-svg-edu.
 * 
 * libgwtsvg-edu is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg-edu is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with libgwtsvg-edu.  If not, see http://www.gnu.org/licenses/
 **********************************************/
package org.vectomatic.svg.edu.client.push;

import com.google.gwt.resources.client.CssResource;

public interface PushCss extends CssResource {
	@ClassName("border-in")
	public String borderIn();
	@ClassName("border-out")
	public String borderOut();
	@ClassName("tile-border")
	public String tileBorder();
	@ClassName("root-svg")
	String rootSvg();

}
