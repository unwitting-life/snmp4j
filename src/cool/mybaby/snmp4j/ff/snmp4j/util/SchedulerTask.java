/*_############################################################################
  _## 
  _##  SNMP4J - SchedulerTask.java  
  _## 
  _##  Copyright 2003-2007  Frank Fock and Jochen Katz (SNMP4J.org)
  _##  
  _##  Licensed under the Apache License, Version 2.0 (the "License");
  _##  you may not use this file except in compliance with the License.
  _##  You may obtain a copy of the License at
  _##  
  _##      http://www.apache.org/licenses/LICENSE-2.0
  _##  
  _##  Unless required by applicable law or agreed to in writing, software
  _##  distributed under the License is distributed on an "AS IS" BASIS,
  _##  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  _##  See the License for the specific language governing permissions and
  _##  limitations under the License.
  _##  
  _##########################################################################*/


package cool.mybaby.snmp4j.ff.snmp4j.util;

/**
 * The <code>SchedulerTask</code> extends the <code>Runnable</code> interface
 * by methods that are needed for recurrent execution of a task.
 *
 * @author Frank Fock
 * @version 1.6
 * @since 1.6
 */
public interface SchedulerTask extends Runnable {

    /**
     * Checks whether this task is ready to be executed. A task is
     *
     * @return <code>true</code> if this task can be executed now.
     */
    boolean isReadyToRun();

    /**
     * Returns <code>true</code> if this task is finished and should never be
     * executed again.
     *
     * @return <code>true</code> if this task is finished and cannot be executed
     * anymore.
     */
    boolean isDone();

}