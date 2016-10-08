/*******************************************************************************
 * Copyright 2012 Google Inc. All Rights Reserved.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.google.gdt.eclipse.platform.jetty;

import java.util.Map;

/**
 * Delegate to the real JSON implementation.
 */
public class JSON {
  public static String toString(Map<?, ?> map) {
    // This resides in GWT 2.7 but not GWT 2.8. TODO where did it go?
    return org.eclipse.jetty.util.ajax.JSON.toString(map);
  }
}
