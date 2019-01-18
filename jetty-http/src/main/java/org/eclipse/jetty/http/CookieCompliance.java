//
//  ========================================================================
//  Copyright (c) 1995-2019 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.http;

/**
 * The compliance for Cookie handling.
 */
public class CookieCompliance
{
    public static final CookieCompliance RFC6265 = new CookieCompliance(true);
    public static final CookieCompliance RFC2965 = new CookieCompliance(false);
    private final boolean isRFC6265;

    public CookieCompliance(boolean isRFC6265)
    {
        this.isRFC6265 = isRFC6265;
    }

    public boolean isRFC6265()
    {
        return isRFC6265;
    }

    public boolean isRFC2965()
    {
        return !isRFC6265;
    }
}
