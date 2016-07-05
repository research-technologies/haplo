/* Haplo Platform                                     http://haplo.org
 * (c) Haplo Services Ltd 2006 - 2016    http://www.haplo-services.com
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.         */

package org.haplo.jsinterface.remote.app;

public interface AppAuthenticationService {
    public String getName();

    public void connect();

    public boolean isConnected();

    public void disconnect();

    public String authenticate(String username, String password);

    public String search(String criteria);
}
