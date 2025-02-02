/*
 * Etisalat Egypt, Open Source
 * Copyright 2021, Etisalat Egypt and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

/**
 * @author Ayman ElSherif
 */

package com.rodan.intruder.ss7.entities.event.model.mobility;

import com.rodan.intruder.ss7.entities.event.model.LocationInfo;
import com.rodan.intruder.ss7.entities.event.model.MapMessage;
import com.rodan.intruder.ss7.entities.event.model.SubscriberInfo;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public abstract class PsiResponse implements MapMessage {
    private com.rodan.intruder.ss7.entities.event.model.SubscriberInfo subscriberInfo;
    private com.rodan.intruder.ss7.entities.event.model.LocationInfo locationInfo;
    private String vlrGt;
    private String sgsnGt;

    public PsiResponse(SubscriberInfo subscriberInfo, LocationInfo locationInfo, String vlrGt, String sgsnGt) {
        this.subscriberInfo = subscriberInfo;
        this.locationInfo = locationInfo;
        this.vlrGt = vlrGt;
        this.sgsnGt = sgsnGt;
    }
}
