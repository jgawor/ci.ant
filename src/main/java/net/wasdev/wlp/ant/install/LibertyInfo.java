/**
 * (C) Copyright IBM Corporation 2014.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.wasdev.wlp.ant.install;

import java.util.Map;

public class LibertyInfo {

    private final String version;
    private final Map<String, String> map;

    public LibertyInfo(String version, Map<String, String> map) {
        this.version = version;
        this.map = map;
    }

    public String getProperty(String type) {
        return map.get(type);
    }

    public String getUri() {
        return map.get("uri");
    }

    public String getLicenseUri() {
        return map.get("license");
    }

    public Version getVersion() {
        return Version.parseVersion(version);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("LibertyInfo[");
        builder.append(version);
        builder.append(": ");
        builder.append(map);
        builder.append("]");
        return builder.toString();
    }

}
