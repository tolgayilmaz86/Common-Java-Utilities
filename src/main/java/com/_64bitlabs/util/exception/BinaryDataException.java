/*
 * Binary data exception.
 * Copyright (C) 2014-2016 Tolga Yilmaz
 * info@64bitlabs.com
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * See LICENSE.txt for details.
 */

package com._64bitlabs.util.exception;

import java.io.IOException;

/**
 * Signals that binary data was encountered and continuing
 * with a text operation would likely corrupt the data.
 *
 * @author Tolga Yilmaz info@64bitlabs.com
 * @since 64bitlabsutils 1.0.0
 */
public class BinaryDataException extends IOException {

	/**
	 * Serial version ID
	 */
	private static final long serialVersionUID = 1898699236015077076L;

	/**
	 * Constructs an IOException with null  as its error detail message.
	 *
	 * @since 64bitlabsutils 1.0.0
	 */
	public BinaryDataException(){
		super();
	}

	/**
	 * Constructs an IOException with the specified detail message.
	 * The error message string s can later be retrieved by the
	 * Throwable.getMessage()  method of class java.lang.Throwable.
	 *
	 * @param s the detail message.
	 *
	 * @since 64bitlabsutils 1.0.0
	 */
	public BinaryDataException(String s){
		super(s);
	}
}
