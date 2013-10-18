/**
 *  Copyright 2011-2013 Terracotta, Inc.
 *  Copyright 2011-2013 Oracle, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package domain;

/**
 * @author Greg Luck
 */
public class Identifier2 {

  private final String name;

  /**
   * Constructor
   *
   * @param name
   */
  public Identifier2(String name) {
    this.name = name;
  }

  /**
   * Implemented without class checking
   *
   * @param o
   * @return
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;

    return o.toString().equals(this.toString());
  }

  @Override
  public int hashCode() {
//        return name != null ? name.hashCode() : 0;
    return 10;
  }


  @Override
  public String toString() {
    return name;
  }
}
