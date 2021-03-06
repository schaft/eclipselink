/*
 * Copyright (c) 2018, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

package org.eclipse.persistence.internal.jaxb;

import org.eclipse.persistence.jaxb.AttributeNode;

public class AttributeNodeImpl<X> implements AttributeNode {
    protected String currentAttribute;

    public AttributeNodeImpl() {
    }

    public AttributeNodeImpl(String attributeName) {
        this.currentAttribute = attributeName;
    }

    @Override
    public String getAttributeName() {
        return currentAttribute;
    }
}
