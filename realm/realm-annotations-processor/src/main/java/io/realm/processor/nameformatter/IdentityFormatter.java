/*
 * Copyright 2017 Realm Inc.
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
package io.realm.processor.nameformatter;

/**
 * Formatter that doesn't do any conversion when translating from Java to Realm.
 *
 * @see io.realm.annotations.RealmNamePolicy#IDENTITY
 */
public class IdentityFormatter implements CaseFormatter {

    public static CaseFormatter INSTANCE = new IdentityFormatter();

    @Override
    public String format(String name) {
        return name;
    }

}
