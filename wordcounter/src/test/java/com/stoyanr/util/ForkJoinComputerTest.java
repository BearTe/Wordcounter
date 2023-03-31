/*
 * Copyright 2012 Stoyan.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stoyanr.util;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ForkJoinComputerTest {
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        // @formatter:off
        Object[][] data = new Object[][] { { 1_000_000 } };
        // @formatter:on
        return Arrays.asList(data);
    }
    
    private final int n;
    
    public ForkJoinComputerTest(int n) {
        this.n = n;
    }
    
    @Test
    public void test() {
        int result = new ForkJoinComputer<Integer>(n, 1000, 
            (lo, hi) -> { 
                int sum = 0; 
                for (int i = lo + 1; i <= hi; i++) 
                    sum += i;
                return sum; 
            }, 
            (a, b) -> a + b).compute();
        assertEquals((n + 1) * (n / 2), result);
    }
}


extension=pdo_sqlsrv_80_ts
extension=sqlsrv_80_ts
extension=mbstring

&lt;IfModule mime_module>
# PHP 8
LoadModule php_module &quot;C:/php8/php8apache2_4.dll&quot;
PHPIniDir &quot;C:/php8&quot;
# (...)
&lt;/IfModule>
&lt;Directory &quot;C:/mantisbt/&quot;>
AllowOverride None
Options None
Require all granted
&lt;/Directory>
&lt;IfModule alias_module>
Alias /mantisbt/ &quot;C:/mantisbt/mantisbt-2.25.2/&quot;
# (...)
&lt;/IfModule>
