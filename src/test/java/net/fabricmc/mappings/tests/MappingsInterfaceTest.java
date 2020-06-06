/*
 * Copyright 2019 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.mappings.tests;

import net.fabricmc.mappings.Mappings;
import net.fabricmc.mappings.model.V2MappingsProvider;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@Deprecated
public class MappingsInterfaceTest {
	@Test
	public void testParsingToOldInterface() throws Exception {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(MappingsInterfaceTest.class.getResourceAsStream("/bigboi_mappings.tinyv2"), StandardCharsets.UTF_8))) {
            Mappings mappings = V2MappingsProvider.readTinyMappings(reader);
            int x = 2;
        }
    }
}