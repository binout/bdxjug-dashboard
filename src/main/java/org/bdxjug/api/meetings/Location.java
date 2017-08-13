/*
 * Copyright 2016 Benoît Prioux
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bdxjug.api.meetings;

public class Location {

    public final String name;
    public final String address;
    public final Geo geo;

    public Location(String name, String address, Geo geo) {
        this.name = name;
        this.address = address;
        this.geo = geo;
    }

    public String nName() {
        return name;
    }

    public String address() {
        return address;
    }

    public Geo geo() {
        return geo;
    }
}