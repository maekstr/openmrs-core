/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.customdatatype.datatype;

import org.apache.commons.lang.StringUtils;
import org.openmrs.Program;
import org.openmrs.api.context.Context;

/**
 * This is a class for custom datatypes for programs
 *
 * @since 1.12
 */
public class ProgramDatatype extends BaseMetadataDatatype<Program> {
	
	/**
	 * @see org.openmrs.customdatatype.SerializingCustomDatatype#deserialize(java.lang.String)
	 * @should return the object by given uuid string
	 * @override
	 */
	public Program deserialize(String uuid) {
		if (StringUtils.isBlank(uuid)) {
			return null;
		}
		return Context.getProgramWorkflowService().getProgramByUuid(uuid);
	}
}
